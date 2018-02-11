package com.springboot.eurekaclient;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class EurekaclientApplication {
	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient discoveryClient;

	public String hello() {
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		logger.info("/hello, host: " + instance.getHost() + "; service_id: " + instance.getServiceId());
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
}
