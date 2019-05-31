package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth")
public class Authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String name  = request.getParameter("name");
		String pwd = request.getParameter("psw");
		
		PrintWriter out = response.getWriter();
		
		
		if(email.equals("abc@gmail.com") && name.equals("ganesh") && pwd.equals("ganesh") ){
			
			out.println("Hello "+name+ " You logged in");
			RequestDispatcher rd = request.getRequestDispatcher("/success.html");
			rd.include(request, response);
		}else {
			
			out.println("You entered wrong password ");
			RequestDispatcher rd = request.getRequestDispatcher("/failure.html");
			rd.include(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		doGet(request, response);
	}

}
