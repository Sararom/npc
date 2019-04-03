package com.uca.capas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLabo2
 */
@WebServlet("/ServletLabo2")
public class ServletLabo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLabo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String user = "Sara";
		String passw = "hola";
		String usrf = request.getParameter("user");
		String pswf = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if(user.equals(usrf) && passw.equals(pswf)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Credenciales correctas</h3>");
			out.println("</body>");
			out.println("</html>");
		}	else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Credenciales incorrectas, intente de nuevo</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}	
		
		

}}
