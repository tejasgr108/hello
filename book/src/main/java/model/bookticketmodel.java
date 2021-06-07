package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;



import BookTicket.BookTicket;
import book.User;

public class bookticketmodel {
	Connection conn =null;
	PreparedStatement stt =null;

	public  void booktickett1(DataSource datasource, BookTicket booknewticket) {
		Connection conn =null;
		PreparedStatement stt =null;
		try {
			conn = datasource.getConnection();
	        String seat = booknewticket.getSeat();
			String query = "INSERT INTO BOOK (seat) values(?)";
			stt = conn.prepareStatement(query);
			stt.setNString(1, seat);
			stt.execute();
			
			
		
		
		
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
	
	


	
				
		
		
	}

	    

	public void createuser(DataSource datasource, User createuser) {
		Connection conn = null;
		PreparedStatement st =null;
		try {
			conn = datasource.getConnection();
			String first_name =createuser.getFirst_name();
			String last_name =createuser.getLast_name();
			String username =createuser.getUsername();
			String password =createuser.getPassword();
			String email =createuser.getEmail();
			String contact =createuser.getContact();
			String query ="INSERT INTO USER1 (first_name,last_name,username,password,email,contact) values (?,?,?,?,?,?)";
			st =conn.prepareStatement(query);
			st.setString(1, first_name);
			st.setString(2, last_name);
			st.setString(3, username);
			st.setString(4, password);
			st.setString(5, email);
			st.setString(6, contact);
			st.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}



	public void signin(DataSource datasource, User sample) {
		Connection conn =null;
		PreparedStatement sp =null;
		ResultSet rs =null;
		
		try {
			conn = datasource.getConnection();
			String username = sample.getUsername();
			String password = sample.getPassword();
			String query = "SELECT FROM USER1 WHERE USERNAME=? AND PASSWORD=?";
			sp = conn.prepareStatement(query);
			sp.setString(1, username);
			sp.setString(2,password);
			rs= sp.executeQuery();
			if(rs.next()) {
				System.out.println("welceme! login successful.");
				
				
			}
			
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}




}
