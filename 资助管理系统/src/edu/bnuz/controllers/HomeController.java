package edu.bnuz.controllers;

public class HomeController extends CommonController {
	public void index() {
		System.out.print(getSession().getAttribute("loginuser"));
		render("home.html");
	}
	
	public void sample() {
		
	}

}
