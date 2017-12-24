	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextPane;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import java.awt.GridLayout;
	import java.util.ArrayList;
	import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This class is the screen interface of the ticketing system.
 * @author Group 18
 */

	public class Screen extends JFrame {

		private JPanel contentPane;
	
		private JButton btnBack, btnCancel, btnPay;
		private JPanel panel_8;
		private JPanel panel_9;
		private JLabel lblNewLabel_1;
		private JLabel lblNewLabel_2;
		private JLabel lblNewLabel_3;
		private JLabel lblNewLabel_4;
		private JPanel panel_10;
		private JLabel label;
		private JLabel label_1;
		private JLabel label_2;
		private JLabel label_3;

		int seatLayout[][];
		JButton seat[][];
		JPanel[] panel;
		
		/**
		 * Create the frame.
		 * @param f The film corresponding to the seat.
		 * @param arr The list of seats which are booked.
		 * @param screen The screen identification of the film
		 * @throws IOException The exceptions in reading files
		 */
		public Screen(Film f, ArrayList<JButton> arr , String screen) throws IOException {
			Start.ticket = new Ticket();
			ArrayList<JButton> arrjb = new ArrayList<>();
			setTitle("Screen");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(630, 275, 700, 400);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			JTextPane txtpnScreen = new JTextPane();
			txtpnScreen.setEditable(false);
			txtpnScreen.setForeground(Color.WHITE);
			txtpnScreen.setText("                        SCREEN");
			txtpnScreen.setBackground(Color.BLACK);
			JPanel panelBot = new JPanel();
			contentPane.add(panelBot,BorderLayout.SOUTH);	
			panelBot.setLayout(new GridLayout(0, 3, 0, 0));
			

			Date   curDate   =   new   Date(System.currentTimeMillis());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss"); 
			
			btnPay = new JButton("Pay");
			btnPay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Start.tickets.addAll(Start.book);
					f.tickets.addAll(Start.bookjb);
			        for(Ticket t:Start.book){
			        	writeToFile(t, "Ticket "+ sdf.format(curDate)+".txt");			        
			        	}
			        Start.book.clear();
			        Start.bookjb.clear();
			        JOptionPane.showMessageDialog(null, "Payment Successful", "alert", JOptionPane.INFORMATION_MESSAGE); 
					new Start();
					dispose();
				}
			});
			
			panelBot.add(btnPay);
			
			panelBot.add(txtpnScreen);
			FileReader reader = new FileReader("data/"+screen + ".txt");
            BufferedReader br = new BufferedReader(reader);
            
            String input =null;
            seatLayout = new int[4][9];
            int m = 0;
			while(( input = br.readLine()) != null){
				System.out.println(input);
			char[] fileSeatLayout = input.toCharArray();
			System.out.println(fileSeatLayout.length);
			
			for (int n = 0; n < fileSeatLayout.length; n++) {  
				seatLayout[m][n]=Integer.parseInt(""+fileSeatLayout[n]);				
				} 			
			m++;
			}
			reader.close();
			br.close();
			

			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new TimeTable();
					dispose();
					Start.book.clear();
					Start.bookjb.clear();
				}
			});
			
			panelBot.add(btnCancel);
			
			panel_8 = new JPanel();
			contentPane.add(panel_8,BorderLayout.CENTER);
			panel_8.setLayout(new GridLayout(0, 1, 40, 20));
			
			panel = new JPanel[seatLayout.length];
			seat = new JButton[10][10];


			for (int i = 0; i < seatLayout.length; i++) {
				char rowc = (char)(seatLayout.length-i+64);
				String row = String.valueOf(rowc); 
				panel[i] = new JPanel();
				panel_8.add(panel[i]);  
				panel[i].setLayout(new GridLayout(1, 4, 20, 0));    
	            for (int j = 0; j < seatLayout[i].length; j++) {   
 
	            	if(seatLayout[i][j]==1){
		            	seat[i][j] = new JButton( row + (j+1));
		            	panel[i].add(seat[i][j]);  
		            	arrjb.add(seat[i][j]);
	            	}
	            	else
	            	panel[i].add(new JPanel());     
	                         
	            }   
			}
			
			panel_8.add(new JPanel());  

			panel_9 = new JPanel();
			contentPane.add(panel_9, BorderLayout.WEST);
			panel_9.setLayout(new GridLayout(5, 0, 0, 0));
			
			lblNewLabel_1 = new JLabel(" D   ");
			panel_9.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel(" C   ");
			panel_9.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel(" B   ");
			panel_9.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel(" A   ");
			panel_9.add(lblNewLabel_4);
			
			panel_10 = new JPanel();
			contentPane.add(panel_10, BorderLayout.EAST);
			panel_10.setLayout(new GridLayout(5, 0, 0, 0));
			
			label = new JLabel("   D ");
			panel_10.add(label);
			
			label_1 = new JLabel("   C ");
			panel_10.add(label_1);
			
			label_2 = new JLabel("   B ");
			panel_10.add(label_2);
			
			label_3 = new JLabel("   A ");
			panel_10.add(label_3);
			setVisible(true);

			for(JButton jb : arrjb){
				jb.setEnabled(true);
				jb.addActionListener(new Action(arr,f));
			}

			
			
			for(int i=0;i<Start.bookjb.size();i++){
				for(int j=0;j<arrjb.size();j++){
					if(arrjb.get(j).getText().equals(Start.bookjb.get(i).getText())){
						arrjb.get(j).setBackground(Color.RED);
						arrjb.get(j).setEnabled(false);
					}
				}
			}
			
			
			
			
			for(int i=0;i<f.tickets.size();i++){
				for(int j=0;j<arrjb.size();j++){
					if(arrjb.get(j).getText().equals(f.tickets.get(i).getText()))
						arrjb.get(j).setEnabled(false);
				}
			}
		}
		private class Action implements ActionListener{

			private ArrayList<JButton> arr;
			private Film f;
			public Action(ArrayList<JButton> arr,Film f){
				this.arr = arr;
				this.f = f;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton jb = (JButton) e.getSource();
				Start.bookjb.add(jb);
				Start.ticket.setSeatNumber(jb.getText());
				new Identity(arr,1,f);
				dispose();
				System.out.println("size:" + arr.size());
			}
			
		}
		
		/**
		 * Write ticket details to files.
		 * @param t Ticket.
		 * @param fileName The file that records the ticket detail.
		 */
		private void writeToFile(Ticket t, String fileName){
			File file = new File(fileName);
			try {
				FileWriter fileWritter = new FileWriter(file.getName(),false);
				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
				bufferWritter.write(t.toString());
		        bufferWritter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
