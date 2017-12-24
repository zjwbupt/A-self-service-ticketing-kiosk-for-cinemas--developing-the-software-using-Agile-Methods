import java.util.ArrayList;

import javax.swing.JButton;

/**
 * This class stores the films.
 * @author Group 18
 */

public class Film {
	public ArrayList<JButton> tickets = new ArrayList<>();
	private String name;
	private String time;
	public String screen;
	// the class named film including 3 main strings 
	public Film(String name,String time,String screen){
		this.name = name;
		this.time = time;
		this.screen = screen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
	
}
 