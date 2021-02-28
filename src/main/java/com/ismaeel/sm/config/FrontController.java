package com.ismaeel.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] appConfigClasses = {AppConfig.class};
		return appConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] urls= {"/"};
		return urls;
	}

}
