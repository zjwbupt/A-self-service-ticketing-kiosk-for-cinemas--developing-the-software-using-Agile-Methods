import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 * This class is the shows the identity detail of the ticketing system.
 * @author Group 18
 */



public class Identity extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textStu;
	private JTextPane txtStu;
	private JButton btnChild;
	private JButton btnAdult;
	private JButton btnSenior;
	private JButton btnStudent;
	private JTextField priceField;
	/**
	 * This class is the identity interface of the ticketing system.
	 * @author Group 18
	 * @param arr The arraylist of the tickets bought
	 * @param code An identification for checking the data
	 * @param film Film of the ticket booked
	 */
	public Identity(ArrayList<JButton> arr, int code,Film film) {
		setTitle("Choose your identity");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(630, 275, 700, 400);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 4, 0, 0));
		
		JTextPane txtpnType = new JTextPane();
		txtpnType.setEditable(false);
		txtpnType.setBackground(SystemColor.textHighlight);
		txtpnType.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnType.setText("Type");
		panel.add(txtpnType);
		
		JTextPane txtpnDescription = new JTextPane();
		txtpnDescription.setEditable(false);
		txtpnDescription.setBackground(SystemColor.textHighlight);
		txtpnDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnDescription.setText("Description");
		panel.add(txtpnDescription);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setEditable(false);
		txtpnId.setBackground(SystemColor.textHighlight);
		txtpnId.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnId.setText("ID required");
		panel.add(txtpnId);
		
		JTextPane txtpnDiscount = new JTextPane();
		txtpnDiscount.setEditable(false);
		txtpnDiscount.setBackground(SystemColor.textHighlight);
		txtpnDiscount.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnDiscount.setText("Discount");
		panel.add(txtpnDiscount);
		
		JTextPane txtpnChild = new JTextPane();
		txtpnChild.setEditable(false);
		txtpnChild.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnChild.setText("Child");
		panel.add(txtpnChild);
		
		JTextPane txtpnTo = new JTextPane();
		txtpnTo.setEditable(false);
		txtpnTo.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnTo.setText("2 to 17 years old");
		panel.add(txtpnTo);
		
		JTextPane txtpnNone = new JTextPane();
		txtpnNone.setEditable(false);
		txtpnNone.setText("None");
		txtpnNone.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(txtpnNone);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		textPane_8.setText("50%");
		textPane_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textPane_8);
		
		JTextPane txtpnAdult = new JTextPane();
		txtpnAdult.setEditable(false);
		txtpnAdult.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnAdult.setText("Adult");
		panel.add(txtpnAdult);
		
		JTextPane txtpnYears = new JTextPane();
		txtpnYears.setEditable(false);
		txtpnYears.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnYears.setText("18 years and older");
		panel.add(txtpnYears);
		
		JTextPane txtpnNone_1 = new JTextPane();
		txtpnNone_1.setEditable(false);
		txtpnNone_1.setText("None");
		txtpnNone_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(txtpnNone_1);
		
		JTextPane txtpnNone_3 = new JTextPane();
		txtpnNone_3.setEditable(false);
		txtpnNone_3.setText("None");
		txtpnNone_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(txtpnNone_3);
		
		JTextPane txtpnSenior = new JTextPane();
		txtpnSenior.setEditable(false);
		txtpnSenior.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnSenior.setText("Senior");
		panel.add(txtpnSenior);
		
		JTextPane txtpnYearsAnd = new JTextPane();
		txtpnYearsAnd.setEditable(false);
		txtpnYearsAnd.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnYearsAnd.setText("55 years and older");
		panel.add(txtpnYearsAnd);
		
		JTextPane txtpnNone_2 = new JTextPane();
		txtpnNone_2.setEditable(false);
		txtpnNone_2.setText("None");
		txtpnNone_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(txtpnNone_2);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setEditable(false);
		textPane_13.setText("20%");
		textPane_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textPane_13);
		
		JTextPane txtpnStudent = new JTextPane();
		txtpnStudent.setEditable(false);
		txtpnStudent.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnStudent.setText("Student");
		panel.add(txtpnStudent);
		
		JTextPane txtpnYearsAnd_1 = new JTextPane();
		txtpnYearsAnd_1.setEditable(false);
		txtpnYearsAnd_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnYearsAnd_1.setText("18 years and older and in full time education");
		panel.add(txtpnYearsAnd_1);
		
		JTextPane txtpnStudentId = new JTextPane();
		txtpnStudentId.setEditable(false);
		txtpnStudentId.setText("Student ID");
		txtpnStudentId.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(txtpnStudentId);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setEditable(false);
		textPane_19.setText("15%");
		textPane_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textPane_19);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		JTextPane txtpnChooseYourIdentity = new JTextPane();
		panel_1.add(txtpnChooseYourIdentity);
		txtpnChooseYourIdentity.setEditable(false);
		txtpnChooseYourIdentity.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtpnChooseYourIdentity.setBackground(SystemColor.window);
		txtpnChooseYourIdentity.setText("Your identity: ");
		
		btnChild = new JButton("Child");
		panel_1.add(btnChild);
		
		btnAdult = new JButton("Adult");
		panel_1.add(btnAdult);
		
		btnStudent = new JButton("Student");
		panel_1.add(btnStudent);
		btnStudent.addActionListener(this);
		
		
		btnSenior = new JButton("Senior");
		panel_1.add(btnSenior);
		
		JTextPane txtpnPrice = new JTextPane();
		panel_1.add(txtpnPrice);
		txtpnPrice.setBackground(SystemColor.window);
		txtpnPrice.setText("Price:");
		
		priceField = new JTextField();
		panel_1.add(priceField);
		priceField.setBorder(null);
		priceField.setBackground(SystemColor.window);
		priceField.setEditable(false);
		priceField.setColumns(10);
		priceField.setText("$" + Start.ticket.getPrice());
		
		JLabel label_3 = new JLabel("");
		panel_1.add(label_3);
		
		txtStu = new JTextPane();
		panel_1.add(txtStu);
		txtStu.setVisible(false);
		txtStu.setBackground(SystemColor.window);
		txtStu.setEditable(false);
		txtStu.setText("Student ID: ");
		
		textStu = new JTextField();
		panel_1.add(textStu);
		textStu.setVisible(false);
		textStu.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JLabel label_4 = new JLabel("");
		panel_1.add(label_4);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnConfirm = new JButton("Confirm");
		panel_1.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnStudent.isEnabled() && btnChild.isEnabled() && btnSenior.isEnabled() && btnAdult.isEnabled()){
					JOptionPane.showMessageDialog(null, "Please choose your identity", "alert", JOptionPane.ERROR_MESSAGE);
					return ;
				}
				
				if(!btnStudent.isEnabled() && (textStu.getText().equals(""))){
					JOptionPane.showMessageDialog(null, "Student ID can not be empty", "alert", JOptionPane.ERROR_MESSAGE);
					return ;
				}
				
				
				Start.ticket.setStudentID(textStu.getText());
				new TicketDetail(film);				
				dispose();
			}
		});
		JButton btnBack = new JButton("Back");
		panel_1.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.bookjb.remove(Start.bookjb.size()-1);
				dispose();
				try {
					new Screen(film ,film.tickets,film.screen);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSenior.addActionListener(this);
		btnAdult.addActionListener(this);
		btnChild.addActionListener(this);
		
		
		
		setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnChild){
			btnChild.setEnabled(false);
			btnAdult.setEnabled(true);
			btnStudent.setEnabled(true);
			btnSenior.setEnabled(true);
			
			txtStu.setVisible(false);
			textStu.setVisible(false);
			
			Start.ticket.setPrice(8);
			priceField.setText("$" + Start.ticket.getPrice());
			Start.ticket.setTicketType(btnChild.getText());
		}
		if(e.getSource()==btnStudent){
			btnStudent.setEnabled(false);
			btnAdult.setEnabled(true);
			btnChild.setEnabled(true);
			btnSenior.setEnabled(true);
			
			txtStu.setVisible(true);
			textStu.setVisible(true);
			
			Start.ticket.setPrice(13.6f);
			priceField.setText("$" + Start.ticket.getPrice());
			Start.ticket.setTicketType(btnStudent.getText());
		}
		if(e.getSource()==btnSenior){
			btnSenior.setEnabled(false);
			btnAdult.setEnabled(true);
			btnStudent.setEnabled(true);
			btnChild.setEnabled(true);
			
			txtStu.setVisible(false);
			textStu.setVisible(false);
			
			Start.ticket.setPrice(12.8f);
			priceField.setText("$" + Start.ticket.getPrice());
			Start.ticket.setTicketType(btnSenior.getText());
		}
		if(e.getSource()==btnAdult){
			btnAdult.setEnabled(false);
			btnChild.setEnabled(true);
			btnStudent.setEnabled(true);
			btnSenior.setEnabled(true);
			
			txtStu.setVisible(false);
			textStu.setVisible(false);
			
			Start.ticket.setPrice(16);
			priceField.setText("$" + Start.ticket.getPrice());
			Start.ticket.setTicketType(btnAdult.getText());
		}
	}
}
