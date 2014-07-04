package edu.bnuz.controllers;

import com.jfinal.core.Controller;

public class HomeController extends Controller {
	public void index() {
		render("home.html");
	}

}
