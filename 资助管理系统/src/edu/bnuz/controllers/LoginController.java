package edu.bnuz.controllers;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.ehcache.CacheKit;

public class LoginController extends CommonController {
	
	public void index() {
		System.out.print(getSession());
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
			getSession().setAttribute("loginuser", user.get(0));
			redirect("/student");
		}
	}
	

}
