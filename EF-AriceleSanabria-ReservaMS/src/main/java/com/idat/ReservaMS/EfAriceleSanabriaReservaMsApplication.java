package com.idat.ReservaMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfAriceleSanabriaReservaMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAriceleSanabriaReservaMsApplication.class, args);
	}

}
