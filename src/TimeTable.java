import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;

/**
 * This class is the shows the film timetable ticketing system.
 * @author Group 18
 */

public class TimeTable extends JFrame {

	private JPanel contentPane;
	public ArrayList<String> filmName;
	public Film Films[];
	public JButton time[][];
	int filmNum = 0, flag = 0;
	public ArrayList<String>[] filmTime;
	/**
	 * Create the frame.
	 */
	public TimeTable() {
		ArrayList<JButton> arrTime = new ArrayList<>();
		setTitle("Timetable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 275, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		try {
            File file=new File("data/Films.txt");
            if(file.isFile() && file.exists()){ 
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
                String lineTxt = null;
				if(Start.films==null||Start.films.size()==0){
					 flag = 1;
					 Start.films = new ArrayList<>();
				}
                while((lineTxt = br.readLine()) != null){
                	String[] filminfo = lineTxt.split("-");


                	System.out.println(filminfo[0]);
                	JPanel panel_1 = new JPanel();

        			panel_1.setLayout(new GridLayout(0, 4, 0, 0));
        			JTextPane txtpn = new JTextPane();
        			txtpn.setText(filminfo[0] + "-" + filminfo[1]);
        			panel_1.add(txtpn);
        			contentPane.add(panel_1);
                	System.out.println(lineTxt);
                	for(int i = 2;i< filminfo.length;i++){
                		final int j = filmNum;
        				JButton jb=new JButton(filminfo[i]);
        				panel_1.add(jb);
        				arrTime.add(jb);
        				if(flag == 1){
            				Film film = new Film(filminfo[0],filminfo[i],filminfo[1] );
            				Start.films.add(film);
        				}

        				jb.addActionListener(new ActionListener() {
        					public void actionPerformed(ActionEvent e) {
        						try {
									new Screen(Start.films.get(j),Start.films.get(j).tickets,Start.films.get(j).screen);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
        						dispose();
        						initTicket(Start.films.get(j));
        					}
        				});
                    	filmNum++;
                	}

                }
                reader.close();
                br.close();
            }else{
        System.out.println("Files missing");
            }
		} catch (Exception e) {
        System.out.println("Reading failed");
        e.printStackTrace();
		}

			

		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FilmDetail();
				dispose();
			}
		});
		contentPane.add(btnBack);
 
		
		setVisible(true);
		
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute =calendar.get(Calendar.MINUTE);
		
		checkTime(arrTime,hour,minute);
		
	}
	/**
	 * Make the buttons whose time are invalid
	 * @param arr Button list
	 * @param hour Real time hour
	 * @param minute Real time minute
	 */
	public void checkTime(ArrayList<JButton> arr, int hour, int minute){
		for(JButton jb : arr){
			String time = jb.getText();
			String tHour = time.substring(0,2);
			String tMin = time.substring(3,5);
			if(Integer.parseInt(tHour) < hour){
				jb.setEnabled(false);
				
			}
			if((Integer.parseInt(tHour) == hour)&&(Integer.parseInt(tMin) < minute)){	
				jb.setEnabled(false);
			}
		}
		
	}
	

// for init the ticket function
	private void initTicket(Film f){
		Start.ticket.setFilm(f.getName());
		Start.ticket.setScreen(f.getScreen());
		Start.ticket.setTime(f.getTime());
	}
}
