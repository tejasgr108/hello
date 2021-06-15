package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import BookTicket.BookTicket;
import BookTicket.BookTicket1;
import BookTicket.BookTicket2;


public class bookingmodel {

	public void booktickett1( BookTicket booknewticket) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gat?useSSL=false","root", "Tejasgr108@");
			String seat = booknewticket.getSeat();
			String username =booknewticket.getUsername();
			
			String query = "insert into book (seat,username) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, seat);
			statement.setString(2, username);
			statement.execute();
		    System.out.println("ticket booked");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void booktickett2(BookTicket1 booknewticket1) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gat?useSSL=false","root", "Tejasgr108@");
			String seat = booknewticket1.getSeat1();
			String username = booknewticket1.getUsername();
			String query = "insert into book1 (seat1,username) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, seat);
			statement.setString(2,username);
			statement.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void booktickett3(BookTicket2 booknewticket2) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gat?useSSL=false","root", "Tejasgr108@");
			String seat = booknewticket2.getSeat2();
			String username = booknewticket2.getUsername();
			String query = "insert into book2 (seat2,username) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, seat);
			statement.setString(2, username);
			statement.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
