package com.jsp.MVC.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Dispatcherintilizer  extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class[] getServletConfigClasses() {
		Class [] config= {Config.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[]= {"/"};
		return mapping;
	}

}
