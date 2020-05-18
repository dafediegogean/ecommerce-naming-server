package br.com.ecommerce.naming.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceNamingServerApplication.class, args);
	}

}
