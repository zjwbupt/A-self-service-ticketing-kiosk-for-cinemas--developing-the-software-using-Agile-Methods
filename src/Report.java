import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

/**
 * This class is responsible the report of the ticketing system.
 * @author Group 18
 */

public class Report extends JFrame {

	private JPanel contentPane;
	private JTextField bbField;
	private JTextField ksField;
	private JTextField llField;
	private JTextField mlField;
	private JTextField lgField;
	private JTextField adultField;
	private JTextField seniorField;
	private JTextField studentField;
	private JTextField childField;
	private int total,bb,ks,ll,ml,lg,adult,senior,child,student;
	private JTextField totalT;
	private JTextField totalP;
	
	/**
	 * Create the frame.
	 */
	public Report() {
		setTitle("Reprot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(660, 275, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnTotalTickets = new JTextPane();
		txtpnTotalTickets.setBackground(SystemColor.window);
		txtpnTotalTickets.setEditable(false);
		txtpnTotalTickets.setText("Total Tickets:");
		txtpnTotalTickets.setBounds(43, 195, 112, 20);
		contentPane.add(txtpnTotalTickets);
		
		JTextPane txtpnBeautyAndThe = new JTextPane();
		txtpnBeautyAndThe.setBackground(SystemColor.window);
		txtpnBeautyAndThe.setEditable(false);
		txtpnBeautyAndThe.setText("BEAUTY AND THE BEAST: ");
		txtpnBeautyAndThe.setBounds(43, 34, 167, 20);
		contentPane.add(txtpnBeautyAndThe);
		
		JTextPane txtpnKongSkullIsland = new JTextPane();
		txtpnKongSkullIsland.setBackground(SystemColor.window);
		txtpnKongSkullIsland.setEditable(false);
		txtpnKongSkullIsland.setText("KONG: SKULL ISLAND:");
		txtpnKongSkullIsland.setBounds(43, 62, 167, 20);
		contentPane.add(txtpnKongSkullIsland);
		
		JTextPane txtpnLaLaLand = new JTextPane();
		txtpnLaLaLand.setBackground(SystemColor.window);
		txtpnLaLaLand.setEditable(false);
		txtpnLaLaLand.setText("LA LA LAND:");
		txtpnLaLaLand.setBounds(43, 90, 167, 20);
		contentPane.add(txtpnLaLaLand);
		
		JTextPane txtpnMoonlight = new JTextPane();
		txtpnMoonlight.setBackground(SystemColor.window);
		txtpnMoonlight.setEditable(false);
		txtpnMoonlight.setText("MOONLIGHT:");
		txtpnMoonlight.setBounds(43, 118, 167, 20);
		contentPane.add(txtpnMoonlight);
		
		JTextPane txtpnLogan = new JTextPane();
		txtpnLogan.setBackground(SystemColor.window);
		txtpnLogan.setEditable(false);
		txtpnLogan.setText("LOGAN:");
		txtpnLogan.setBounds(43, 146, 167, 20);
		contentPane.add(txtpnLogan);
		
		JTextPane txtpnAdult = new JTextPane();
		txtpnAdult.setBackground(SystemColor.window);
		txtpnAdult.setEditable(false);
		txtpnAdult.setText("Adult:");
		txtpnAdult.setBounds(338, 34, 167, 20);
		contentPane.add(txtpnAdult);
		
		JTextPane txtpnSenior = new JTextPane();
		txtpnSenior.setBackground(SystemColor.window);
		txtpnSenior.setEditable(false);
		txtpnSenior.setText("Senior:");
		txtpnSenior.setBounds(338, 74, 167, 20);
		contentPane.add(txtpnSenior);
		
		JTextPane txtpnStudent = new JTextPane();
		txtpnStudent.setBackground(SystemColor.window);
		txtpnStudent.setEditable(false);
		txtpnStudent.setText("Student: ");
		txtpnStudent.setBounds(337, 111, 167, 20);
		contentPane.add(txtpnStudent);
		
		JTextPane txtpnChild = new JTextPane();
		txtpnChild.setBackground(SystemColor.window);
		txtpnChild.setEditable(false);
		txtpnChild.setText("Child:");
		txtpnChild.setBounds(338, 146, 167, 20);
		contentPane.add(txtpnChild);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Start();
			}
		});
		btnNewButton_1.setBounds(400,280, 130, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnSendToAdmin = new JButton("SEND TO ADMIN");
		btnSendToAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Send Successfully", "alert", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnSendToAdmin.setBounds(400,240, 130, 29);
		contentPane.add(btnSendToAdmin);
		
		bbField = new JTextField();
		bbField.setBackground(SystemColor.window);
		bbField.setEditable(false);
		bbField.setBounds(257, 34, 51, 20);
		contentPane.add(bbField);
		bbField.setText("" + query("BEAUTY AND THE BEAST"));
		bbField.setColumns(10);
		
		ksField = new JTextField();
		ksField.setBackground(SystemColor.window);
		ksField.setEditable(false);
		ksField.setColumns(10);
		ksField.setBounds(257, 62, 51, 20);
		ksField.setText("" + query("KONG: SKULL ISLAND"));
		contentPane.add(ksField);
		
		llField = new JTextField();
		llField.setBackground(SystemColor.window);
		llField.setEditable(false);
		llField.setColumns(10);
		llField.setBounds(257, 90, 51, 20);
		llField.setText("" + query("LA LA LAND"));
		contentPane.add(llField);
		
		mlField = new JTextField();
		mlField.setBackground(SystemColor.window);
		mlField.setEditable(false);
		mlField.setColumns(10);
		mlField.setBounds(257, 118, 51, 20);
		mlField.setText("" + query("MOONLIGHT"));
		contentPane.add(mlField);
		
		lgField = new JTextField();
		lgField.setBackground(SystemColor.window);
		lgField.setEditable(false);
		lgField.setColumns(10);
		lgField.setBounds(257, 146, 51, 20);
		lgField.setText("" + query("LOGAN"));
		contentPane.add(lgField);
		
		adultField = new JTextField();
		adultField.setBackground(SystemColor.window);
		adultField.setEditable(false);
		adultField.setColumns(10);
		adultField.setBounds(517, 34, 51, 20);
		adultField.setText("" + query("Adult"));
		contentPane.add(adultField);
		
		seniorField = new JTextField();
		seniorField.setBackground(SystemColor.window);
		seniorField.setEditable(false);
		seniorField.setColumns(10);
		seniorField.setBounds(517, 74, 51, 20);
		seniorField.setText("" + query("Senior"));
		contentPane.add(seniorField);
		
		studentField = new JTextField();
		studentField.setBackground(SystemColor.window);
		studentField.setEditable(false);
		studentField.setColumns(10);
		studentField.setBounds(517, 111, 51, 20);
		studentField.setText("" + query("Student"));
		contentPane.add(studentField);
		
		childField = new JTextField();
		childField.setBackground(SystemColor.window);
		childField.setEditable(false);
		childField.setColumns(10);
		childField.setBounds(517, 146, 51, 20);
		childField.setText("" + query("Child"));
		contentPane.add(childField);
		
		totalT = new JTextField();
		totalT.setBackground(SystemColor.window);
		totalT.setEditable(false);
		totalT.setColumns(10);
		totalT.setBounds(257, 195, 51, 20);
		contentPane.add(totalT);
		totalT.setText(""+ Start.tickets.size());
		
		JButton button = new JButton("");
		button.setEnabled(false);
		button.setBounds(319, 6, 7, 168);
		contentPane.add(button);
		
		JTextPane txtpnTotalProfits = new JTextPane();
		txtpnTotalProfits.setBackground(SystemColor.window);
		txtpnTotalProfits.setText("Total Profits:");
		txtpnTotalProfits.setEditable(false);
		txtpnTotalProfits.setBounds(338, 195, 112, 20);
		contentPane.add(txtpnTotalProfits);
		
		JButton button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setBounds(6, 173, 676, 10);
		contentPane.add(button_1);
		
		totalP = new JTextField();
		totalP.setText("0");
		totalP.setEditable(false);
		totalP.setColumns(10);
		totalP.setBackground(SystemColor.window);
		totalP.setBounds(517, 195, 51, 20);
		contentPane.add(totalP);
		float profit = 0;
		for(Ticket t : Start.tickets){
			if(t.getTicketType().equals("Adult")){
				profit += 16;
			}
			if(t.getTicketType().equals("Child")){
				profit += 8;
			}
			if(t.getTicketType().equals("Senior")){
				profit += 12.8;
			}
			if(t.getTicketType().equals("Student")){
				profit += 13.6;
			}
		}
		totalP.setText("$" + profit);
		setVisible(true);
	}
	/**
	 * Calculate tickets.
	 * @param s Film name
	 * @return The number of queried film.
	 */
	public int query(String s){
		int count = 0;
		if(s.equals("BEAUTY AND THE BEAST")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getFilm().equals(s)){
						count++;
					}
				}
				return count;
			}
			
		}
		if(s.equals("KONG: SKULL ISLAND")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getFilm().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		if(s.equals("LA LA LAND")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getFilm().equals(s)){
						count++;
					}
				}
				return count;
				
			}
		}
		if(s.equals("MOONLIGHT")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getFilm().equals(s)){
						count++;
					}
				}	
				return count;
			}
		}
			
		if(s.equals("LOGAN")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getFilm().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		
		
		if(s.equals("Adult")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getTicketType().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		if(s.equals("Senior")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getTicketType().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		if(s.equals("Student")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getTicketType().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		if(s.equals("Child")){
			if(Start.tickets.size()==0)
				return 0;
			else{
				for(Ticket t : Start.tickets){
					if(t.getTicketType().equals(s)){
						count++;
					}
				}
				return count;
			}
		}
		return 0;
		
	}
}
