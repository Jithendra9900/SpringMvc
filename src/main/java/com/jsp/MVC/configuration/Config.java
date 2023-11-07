package com.jsp.MVC.configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configurable
@ComponentScan(basePackages = " com.jsp.MVC")
@EnableJpaRepositories(basePackages = "com.jsp.MVC")
public class Config 
{

	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean("entityManagerFactory")
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean()
	{
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("SpringMvc");
		return bean;
	}
	@Bean("transactionManager")
	public JpaTransactionManager getJpaTransactionManager(EntityManagerFactory factory)
	{
		JpaTransactionManager jt=new JpaTransactionManager();
		jt.setEntityManagerFactory(factory);
		return jt;
	}
}
