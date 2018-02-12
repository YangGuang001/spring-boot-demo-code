package com.springboot.demo.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AutoconfigurationApplication {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/auto")
	public String hello() {
		return helloService.say();
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet());
		servletRegistrationBean.addUrlMappings("/home");
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
		filterRegistrationBean.addUrlPatterns("/");
		return filterRegistrationBean;
	}

	@Bean
	public ServletListenerRegistrationBean<MyServletListener> servletListenerRegistrationBean() {
		ServletListenerRegistrationBean<MyServletListener> registrationBean = new ServletListenerRegistrationBean<MyServletListener>(new MyServletListener());
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(AutoconfigurationApplication.class, args);
	}


}
