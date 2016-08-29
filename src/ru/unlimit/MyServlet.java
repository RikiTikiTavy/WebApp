package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/MyServlet", description = "Servlet Discription", displayName = "NameDisplayed")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
	
		System.out.println(name);
		System.out.println(lastName);
		
		response.setContentType("text/html;charset = utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello from MyServlet.POST" + name +  " " + lastName+ "</h3>");
		out.close();
	}

}
