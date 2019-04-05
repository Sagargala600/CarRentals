package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.CarDao;
import models.ReservedCarDetails;

/**
 * Servlet implementation class ReserveCar
 */
@WebServlet("/ReserveCar")
public class ReserveCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserveCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String carbrand = request.getParameter("cars");
		String carmodel = request.getParameter("category");
		String totalcost = request.getParameter("total");
		HttpSession session = request.getSession(true);
		String userName = (String) session.getAttribute("uname");
		
		ReservedCarDetails cardetails = new ReservedCarDetails();
		cardetails.setFirstname(fname);
		cardetails.setLatname(lname);
		cardetails.setPhone(phone);
		cardetails.setEmail(email);
		cardetails.setCar(carbrand);
		cardetails.setCategory(carmodel);
		cardetails.setTotal(totalcost);
		cardetails.setUserName(userName);
		
		String registerCar = CarDao.registerCar(cardetails);
		if(registerCar.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		 {
			HttpSession newSession = request.getSession(true);
			newSession.setAttribute("fname", fname);
			newSession.setAttribute("lname", lname);
			newSession.setAttribute("phone", phone);
			newSession.setAttribute("email", email);
			newSession.setAttribute("cars", carbrand);
			newSession.setAttribute("category", carmodel);
			newSession.setAttribute("total", totalcost);
			newSession.setAttribute("userName", userName);
		 request.getRequestDispatcher("/View.jsp").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
			 System.out.println("Something went wrong on ReserveCar page");
		 }
		
		
		
	}

}
