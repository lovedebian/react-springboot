
package com.arjuncodes.studentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentsystemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}

}
