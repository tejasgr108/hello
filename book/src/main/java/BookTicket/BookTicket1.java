package BookTicket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ Entity
@Table(name = "book1")
public class BookTicket1 {
	
	@Id
	@Column(name = "seat1")
	private String seat1;
	
	/**
	 * @return the seat
	 */
	public String getSeat1() {
		return seat1;
	}



	/**
	 * @param seat the seat to set
	 */
	public void setSeat1(String seat1) {
		this.seat1 = seat1;
	}



	public BookTicket1(String seat1) {
		super();
		this.seat1 = seat1;
	}
}
	
	