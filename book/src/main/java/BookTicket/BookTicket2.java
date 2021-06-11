package BookTicket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ Entity
@Table(name = "book2")
public class BookTicket2 {
	
	@Id
	@Column(name = "seat2")
	private String seat2;
	
	/**
	 * @return the seat
	 */
	public String getSeat2() {
		return seat2;
	}



	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat2) {
		this.seat2 = seat2;
	}



	public BookTicket2(String seat2) {
		super();
		this.seat2 = seat2;
	}
}
	
	