package book;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



import BookTicket.BookTicket;
import model.bookticketmodel;


@WebServlet("/controller") public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   @Resource(name="jdbc/project")
	    private DataSource datasource;
	   
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String pages =request.getParameter("page");
			pages =pages.toLowerCase();
			if(pages.equals("book")) {
				request.getServletContext().getRequestDispatcher("/book.jsp").forward(request, response);
			}
			else if(pages.equals("signup")) {
				request.getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
			}
			else if(pages.equals("signin")) {
				request.getServletContext().getRequestDispatcher("/signin.jsp").forward(request, response);
			}
			else if(pages.equals("displaymovies")) {
				request.getServletContext().getRequestDispatcher("/displaymovies.jsp").forward(request, response);
			}
			else {
				response.sendRedirect("/homepage.jsp");
				}
			
			}
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String book = request.getParameter("form");
		if(book.equals("bookticketsmethod")){
			String[] seats = request.getParameterValues("seat");
			String seat ="";
			for (int i=0;i<seats.length;i++) {
				 seat += seats[i]+"";
			}
			BookTicket booknewticket =new BookTicket(seat) ;
			bookticketmethod(booknewticket);
			
		}
		else if(book.equals("createusermethod")) {
			User createuser = new User(request.getParameter("first_name"),
					request.getParameter("last_name"), request.getParameter("username"),
					request.getParameter("password"),request.getParameter("email"),request.getParameter("contact"));
			createusermethod(createuser);
		}
		else {
			response.sendRedirect("/homepage.jsp");
		}
	}


	private void createusermethod(book.User createuser) {
	      new bookticketmodel().createuser(datasource , createuser);
		
	}


	private void bookticketmethod(BookTicket booknewticket) {
		new bookticketmodel().booktickett1(datasource,booknewticket);
		return;
		
	}


	
}
