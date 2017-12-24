

/**
 * This class is stores the tickets of the ticketing system.
 * @author Group 18
 */


public class Ticket{
	
	
	private String ticketID;
	private String film;
	private String time;
	private String screen;
	private String ticketType;
	private String studentID;
	private String seatNumber;
	private float price = 16;

	
	public Ticket(){
		this.ticketID = idGenerator();
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public String getTicketID() {
		return ticketID;
	}

	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
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
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
/**
 * Generate a unique id
 * @return A unique id
 */
	public String idGenerator(){
		while(true){
			String id = ranNumber();
			
			if(Start.ids.size()>0){
				for(String s : Start.ids){
					if(!(Start.ids.contains(s))){
						Start.ids.add(id);
						return id;
					}
					else{
						continue;
					}
				}	
			}
			return id;
		}
			
		
	}
	
	/**
	 * Generate a id for a ticket.
	 * @return id
	 */
	public String ranNumber(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<8;i++){
			int bit = (int) (Math.random()*4 + 1);
			sb.append(bit);
		}
		String id = sb.toString();
		return id;
	}
	public String toString(){
		return "TICKET ID: " + ticketID + "\n" + "FILM: " + film + "\n" + "TIME: " + time + "\n" + "SCREEN: " 
	+ screen + "\n" + "TICKET TYPE: " + ticketType + "\n" + "STUDENT ID: " + studentID + "\n" + "SEAT NUMBER: " + seatNumber + "\n" + "PRICE: " + price;
		
	}
}