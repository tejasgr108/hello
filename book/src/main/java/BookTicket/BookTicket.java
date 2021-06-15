package BookTicket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class BookTicket {
	
	@Id
    @Column(name="seat")
	private String seat;
	
    @Column(name="username")
    private String username;
	/**
	 * @return the seat
	 */
	public String getSeat() {
		return seat;
	}



	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}


    /**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	


	public BookTicket(String seat, String username) {
		super();
		this.seat = seat;
		this.username = username;
	}



	public BookTicket() {
		super();
	}


	



	




	
	

}
