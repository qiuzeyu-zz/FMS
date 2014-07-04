package edu.bnuz.controllers;

import com.jfinal.core.Controller;

public class CommonController extends Controller {

	public String getSessionId() {
		return getSession().getId();
	}

}
