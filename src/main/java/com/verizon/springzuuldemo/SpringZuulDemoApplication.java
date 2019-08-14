package com.verizon.springzuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.verizon.springzuuldemo.filters.Prefilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulDemoApplication.class, args);
	}
	@Bean 
	public Prefilter prefilter() {
		return new Prefilter();
	}

}
