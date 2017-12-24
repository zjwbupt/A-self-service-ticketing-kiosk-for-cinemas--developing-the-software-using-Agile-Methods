import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class is displays the information of the films.
 * @author Group 18
 */

public class FilmDetail extends JFrame {

	/**
	 * Create the frame.
	 */
	public FilmDetail() {
		
		setTitle("Film Detail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 200, 600, 600);
		getContentPane().setLayout(null);
		
			
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(474, 136, 100, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				new Start();
				setVisible(false);
				Start.ticket = null;
			}
		});
		getContentPane().add(btnBack);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(0, 0, 475, 551);
		getContentPane().add(imageLabel);
		ImageIcon img = new ImageIcon("film.png");
		
		imageLabel.setIcon(scaleImage(img));
		
		JButton btnBuy = new JButton("NEXT");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TimeTable();
				dispose();
				Start.ticket = new Ticket();
			}
		});
		btnBuy.setBounds(474, 328, 100, 29);
		getContentPane().add(btnBuy);
		setVisible(true);
	}
	
		
	/**
	 * Set the post of movies
	 * @param icon The post image
	 * @return a scaled image
	 */
	private ImageIcon scaleImage(ImageIcon icon) { 
			
		//as the details contains image of several films
		
		Image image = icon.getImage(); 
		image = image.getScaledInstance(378, 426, Image.SCALE_DEFAULT); 

		return new ImageIcon(image); 
	}
}
