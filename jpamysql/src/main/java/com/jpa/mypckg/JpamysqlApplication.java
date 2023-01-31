package com.jpa.mypckg;

import com.jpa.mypckg.controller.UserController;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
public class JpamysqlApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JpamysqlApplication.class, args);
		UserController userController = context.getBean(UserController.class);

		

	}

}
