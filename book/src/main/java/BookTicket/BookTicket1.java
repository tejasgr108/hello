package BookTicket;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book1")

public class BookTicket1 {



	@Id
    @Column(name="seat1")
	private String seat1;
    
    @Column(name="username")
    private String username;
	
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



	public BookTicket1(String seat1, String username) {
		super();
		this.seat1 = seat1;
		this.username = username;
	}



	public BookTicket1() {
		super();
	}


	
}
	
	