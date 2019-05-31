package com.date.ganesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DateAndTime")
public class DateAndTime extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//set content 
		resp.setContentType("text/html");
		
		//PrintWriter Object
		PrintWriter out = resp.getWriter();
		
		Date date = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		
		out.println("Date and time    "+ft.format(date));
	}

}
