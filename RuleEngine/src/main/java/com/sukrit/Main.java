package com.sukrit;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sukrit.Entity.Employee;

@SpringBootApplication
public class Main {
	
	public static void main(String[] args) throws SQLException {
		 ConfigurableApplicationContext context = SpringApplication.run(
				 Main.class, args);
		DatabaseOperations databaseOperations = (DatabaseOperations) context
                .getBean("databaseOperations");

        databaseOperations.queryEmployees();

        databaseOperations.insertEmployee(new Employee(100, "David", 45));

        System.out.print("After insert, ");
        databaseOperations.queryEmployees();
	}

}
