package BookTicket;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="book2")
public class BookTicket2 {


@Id
@Column(name="seat2")
	private String seat2;



@Column(name="username")
private String username;




/**
	 * @return the seat2
	 */
	public String getSeat2() {
		return seat2;
	}



	/**
	 * @param seat2 the seat2 to set
	 */
	public void setSeat2(String seat2) {
		this.seat2 = seat2;
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



	public BookTicket2(String seat2, String username) {
		super();
		this.seat2 = seat2;
		this.username = username;
	}



	public BookTicket2() {
		super();
	}
	
	
	
	
}




