package edu.bnuz.controllers;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class LoginController extends Controller {
	
	public void index() {
		render("login.jsp");
	}
	
	public void login(){
		String sql = "SELECT stuno FROM student_basic WHERE stuno='" + getPara("user") + "' AND passwd='" + getPara("pwd") + "'";
		List<Record> user = Db.find(sql);
		if (user.isEmpty()) {
			render("login.jsp");
			setAttr("loginMsg", "学号或密码错误");
			setAttr("username", getPara("user"));
		} else {
			redirect("/student");
		}
	}

}
