package com.pluralsight.NorthWindTradersSpringBoot;

import com.pluralsight.NorthWindTradersSpringBoot.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthWindTradersSpringBootApplication implements CommandLineRunner {
    @Autowired ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(NorthWindTradersSpringBootApplication.class, args);



        //created the file to be able to work on the project for northwin traders
	}

}
