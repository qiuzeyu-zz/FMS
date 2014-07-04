package edu.bnuz.common;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;

import edu.bnuz.login.LoginController;

public class WebConfig extends JFinalConfig{

	/**
	 * @param args
	 */

	@Override
	public void configConstant(Constants me) {
		loadPropertyFile("a_little_config.txt");
		me.setDevMode(getPropertyToBoolean("devMode", false));
		me.setViewType(ViewType.JSP);
	}
	
	@Override
	public void configRoute(Routes me) {
		me.add("/", LoginController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
	}

	@Override
	public void configInterceptor(Interceptors me) {
	}

	@Override
	public void configHandler(Handlers me) {
	}

	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}

}
