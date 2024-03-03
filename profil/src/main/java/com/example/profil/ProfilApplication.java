package com.example.profil;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProfilApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilApplication.class, args);
	}

}
