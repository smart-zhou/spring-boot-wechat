package com.wechat;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.wechat.jersey.JerseyApplication;

@SpringBootApplication
public class SpringBootWechatApplication {

	@Bean
	public ServletRegistrationBean jerseyServlet(){
		ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/*");
		// our rest resources will be available in the path /jersey/*
		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyApplication.class.getName());
		return registration;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWechatApplication.class, args);
	}
}
