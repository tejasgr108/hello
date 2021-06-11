package book;

import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import BookTicket.BookTicket;
import BookTicket.BookTicket1;
import BookTicket.BookTicket2;
import model.hibernatemodel;


@WebServlet("/controller") public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	   
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String page =request.getParameter("page");
			page =page.toLowerCase();
			
			switch (page) {
			case "signup":
				addUser(request,response);
				break;
			case "signin":
				signin(request,response);
				displaymovies(request,response);
			    break;
			case "displaymovies":
				displaymovies(request,response);
				break;
			case "bookrrr":
				bookrrr(request,response);
				break;
			case "bookblackwidow":
				bookblackwidow(request,response);
				break;
			case "bookradheshyam":
				bookradheshyam(request,response);
				break;
			case "contactus":
				contactus(request,response);
				break;
			case "homepage":
				homepage(request,response);
				break;
			default:
				errorpage(request,response);
			}
			
			}
  
	
	private void bookradheshyam(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "BookTicket for radheshyam");
		request.getRequestDispatcher("/bookradheshyam.jsp").forward(request, response);
	
		
	}


	private void bookblackwidow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("title", "BookTicket for blackwidow");
		request.getRequestDispatcher("/bookblackwidow.jsp").forward(request, response);
	
	}


	private void bookrrr(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "BookTicket for rrr");
		request.getRequestDispatcher("/bookrrr.jsp").forward(request, response);
	
		
	}


	private void errorpage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
		// TODO Auto-generated method stub
		request.setAttribute("title", "Error");
		request.getRequestDispatcher("/errorpage.jsp").forward(request, response);
	}


	private void contactus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		request.setAttribute("title", "ContactUs");
		request.getRequestDispatcher("/contactus.jsp").forward(request, response);
		
	}


	
	


	private void displaymovies(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.setAttribute("title", "DisplayMovies");
		request.getRequestDispatcher("/displaymovies.jsp").forward(request, response);
		
		
	}


	private void signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("title", "Sign IN");
		request.getRequestDispatcher("/signin.jsp").forward(request, response);
		
	}


	private void homepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/homepage.jsp").forward(request, response);
	}


	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		request.setAttribute("title", "Sign Up");
		request.getRequestDispatcher("/signup.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String book = request.getParameter("form");
		if(book.equals("bookticketsmethod1")){
			String[] seats = request.getParameterValues("seat");
			String seat ="";
			for (int i=0;i<seats.length;i++) {
				 seat += seats[i]+"";
			}
			BookTicket booknewticket =new BookTicket(seat) ;
			bookticketmethod(booknewticket);
			
			request.getRequestDispatcher("/homepage.jsp").forward(request, response);
		}
			
		else if(book.equals("bookticketsmethod2")){
			String[] seats = request.getParameterValues("seat");
			String seat ="";
			for (int i=0;i<seats.length;i++) {
					seat += seats[i]+"";
			}
			BookTicket1 booknewticket1 =new BookTicket1(seat) ;
			bookticketmethod1(booknewticket1);
			request.getRequestDispatcher("/homepage.jsp").forward(request, response);
			
			
		}
		else if(book.equals("bookticketsmethod3")){
			String[] seats = request.getParameterValues("seat");
			String seat ="";
			for (int i=0;i<seats.length;i++) {
				 seat += seats[i]+"";
			}
			BookTicket2 booknewticket2 =new BookTicket2(seat) ;
			bookticketmethod2(booknewticket2);
			request.getRequestDispatcher("/homepage.jsp").forward(request, response);
			
		}
		else if(book.equals("createusermethod")) {
			User createuser = new User(request.getParameter("first_name"),
					request.getParameter("last_name"), request.getParameter("username"),
					request.getParameter("password"),request.getParameter("email"),request.getParameter("contact"));
			createusermethod(createuser);
			request.getRequestDispatcher("/homepage.jsp").forward(request, response);
			
		}
		else if(book.equals("signinmethod")){
			User sample = new User(request.getParameter("username"),request.getParameter("password"));
			signinmethod(  sample);
			request.getRequestDispatcher("/displaymovies.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("/homepage.jsp");
		}
	}
	


		
		


	private void bookticketmethod2(BookTicket2 booknewticket2) {
           new hibernatemodel().booktickett3(booknewticket2);
		
		return;
		
		
	}


	private void bookticketmethod1(BookTicket1 booknewticket1) {
         new hibernatemodel().booktickett2(booknewticket1);
		
		return;
		
		
	}


	private void signinmethod(User sample) {
		new hibernatemodel().signin(sample);
		
		
		
	}

	private void createusermethod(User createuser) {
	      new hibernatemodel().createuser( createuser);
		
	}


	private void bookticketmethod(BookTicket booknewticket) {
		new hibernatemodel().booktickett1(booknewticket);
		
		return;
		
	}


	
}
