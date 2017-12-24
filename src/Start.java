import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;



/**
 * This class is the homepage of the ticketing system.
 * @author Group 18
 */
public class Start extends JFrame {

	private JPanel contentPane;

	
	public static ArrayList<String> ids = new ArrayList<>();
	public static ArrayList<JButton> bookjb = new ArrayList<>();	
	public static ArrayList<Ticket> tickets = new ArrayList<>();
	public static ArrayList<Ticket> book = new ArrayList<>();
	public static ArrayList<Film> films ;
	public static Ticket ticket = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Start() {
		setTitle("WELCOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(660, 275, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 40, 40));
		
		JButton btnBuy = new JButton("Ticket");

		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FilmDetail();
				dispose();
			}
		});
		contentPane.add(btnBuy);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Report();
				dispose();
			}
		});
		contentPane.add(btnAdmin);
		
		JLabel lblSoftwareEnginerring = new JLabel("Welcome to ticketing system.",JLabel.CENTER);
		contentPane.add(lblSoftwareEnginerring);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit);
		setVisible(true);
	}

}
