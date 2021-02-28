package com.ismaeel.sm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ismaeel.sm")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public DataSource getDataSource() {
		
		  String str = ""+ "root"+ "2116"; DriverManagerDataSource dataSource = new
		  DriverManagerDataSource(); dataSource.setUsername("root");
		  dataSource.setPassword("2116");
		 dataSource.setUrl("jdbc:mysql://localhost:3307/test?useSSL=false");
		 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 

		/*
		 * DataSource dataSource = new
		 * DriverManagerDataSource("jdbc:mysql://localhost:3307/test", "root", "2116");
		 */
		return dataSource;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}

}
