package com.javacourse.project.hibernateAndJpa.Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.javacourse.project.hibernateAndJpa.Business.ICityService;

@WebServlet(urlPatterns = "/result")
public class CityServlet extends HttpServlet{
	private ICityService cityService;
	


}
