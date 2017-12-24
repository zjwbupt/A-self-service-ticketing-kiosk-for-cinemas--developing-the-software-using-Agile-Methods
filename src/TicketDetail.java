import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

/**
 * This class is the shows the ticket detail of the ticketing system.
 * @author Group 18
 */

public class TicketDetail extends JFrame {

	private JPanel contentPane;
	private JTextField film;
	private JTextField tic;
	private JTextField price;
	private JTextField type;
	private JTextField stu;
	private JTextField screen;
	private JTextField time;
	private JTextField seat;



	/**
	 * Create the frame.
	 * @param f Film
	 */
	public TicketDetail( Film f ) {
		setTitle("Ticket Detail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(630, 275, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(22, 21, 367, 36);
		contentPane.add(panel);
		
		JTextPane txtpnTicketId = new JTextPane();
		panel.add(txtpnTicketId);
		txtpnTicketId.setBackground(SystemColor.window);
		txtpnTicketId.setText("Ticket ID: ");
		
		tic = new JTextField();
		tic.setBackground(SystemColor.window);
		tic.setEditable(false);
		panel.add(tic);
		tic.setText(Start.ticket.getTicketID());
		tic.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 69, 367, 36);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnFilm = new JTextPane();
		txtpnFilm.setBounds(10, 5, 35, 21);
		panel_1.add(txtpnFilm);
		txtpnFilm.setText("Film: ");
		txtpnFilm.setBackground(SystemColor.window);
		
		film = new JTextField();
		film.setBackground(SystemColor.window);
		film.setBounds(45, 5, 312, 26);
		film.setEditable(false);
		panel_1.add(film);
		film.setText(Start.ticket.getFilm());
		film.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_2.setBounds(22, 118, 367, 36);
		contentPane.add(panel_2);
		
		JTextPane txtpnPrice = new JTextPane();
		panel_2.add(txtpnPrice);
		txtpnPrice.setText("Price:");
		txtpnPrice.setBackground(SystemColor.window);
		
		price = new JTextField();
		price.setBackground(SystemColor.window);
		price.setEditable(false);
		price.setColumns(10);
		price.setText("$" + Start.ticket.getPrice());
		panel_2.add(price);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_3.setBounds(22, 166, 367, 36);
		contentPane.add(panel_3);
		
		JTextPane txtpnType = new JTextPane();
		panel_3.add(txtpnType);
		txtpnType.setText("Type:");
		txtpnType.setBackground(SystemColor.window);
		
		type = new JTextField();
		type.setBackground(SystemColor.window);
		type.setEditable(false);
		type.setColumns(10);
		type.setText(Start.ticket.getTicketType());
		panel_3.add(type);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_4.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_4.setBounds(22, 214, 367, 36);
		contentPane.add(panel_4);
		
		JTextPane txtpnStudentId = new JTextPane();
		panel_4.add(txtpnStudentId);
		txtpnStudentId.setText("Student ID: ");
		txtpnStudentId.setBackground(SystemColor.window);
		
		stu = new JTextField();
		stu.setBackground(SystemColor.window);
		stu.setEditable(false);
		stu.setColumns(10);
		stu.setText(Start.ticket.getStudentID());
		panel_4.add(stu);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_5.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5.setBounds(22, 262, 367, 36);
		contentPane.add(panel_5);
		
		JTextPane txtpnScreen = new JTextPane();
		panel_5.add(txtpnScreen);
		txtpnScreen.setText("Screen:");
		txtpnScreen.setBackground(SystemColor.window);
		
		screen = new JTextField();
		screen.setBackground(SystemColor.window);
		screen.setEditable(false);
		screen.setColumns(10);
		screen.setText(Start.ticket.getScreen());
		panel_5.add(screen);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_6.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_6.setBounds(22, 308, 367, 36);
		contentPane.add(panel_6);
		
		JTextPane txtpnTime = new JTextPane();
		panel_6.add(txtpnTime);
		txtpnTime.setText("Time:");
		txtpnTime.setBackground(SystemColor.window);
		
		time = new JTextField();
		time.setBackground(SystemColor.window);
		time.setEditable(false);
		time.setColumns(10);
		time.setText(Start.ticket.getTime());
		panel_6.add(time);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_7.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_7.setBounds(22, 360, 367, 36);
		contentPane.add(panel_7);
		
		JTextPane txtpnSeat = new JTextPane();
		panel_7.add(txtpnSeat);
		txtpnSeat.setText("Seat:");
		txtpnSeat.setBackground(SystemColor.window);
		
		seat = new JTextField();
		seat.setBackground(SystemColor.window);
		seat.setEditable(false);
		seat.setColumns(10);
		seat.setText(Start.ticket.getSeatNumber());
		panel_7.add(seat);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.book.add(Start.ticket);
				
				JOptionPane.showMessageDialog(null, "Book Successful", "alert", JOptionPane.INFORMATION_MESSAGE); 
				dispose();
				try {
					new Screen(f,f.tickets,f.screen);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		btnNewButton.setBounds(327, 428, 117, 29);
		contentPane.add(btnNewButton);
		setVisible(true);
	}
	
	


}
