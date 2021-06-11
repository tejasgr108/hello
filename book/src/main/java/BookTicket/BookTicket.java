package BookTicket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ Entity
@Table(name = "book")
public class BookTicket {
	
	@Id
	@Column(name = "seat")
	private String seat;
	
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



	public BookTicket(String seat) {
		super();
		this.seat = seat;
	}
	
	
	




	
	

}
