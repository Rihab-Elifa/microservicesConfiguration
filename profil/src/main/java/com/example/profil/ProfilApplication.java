package com.example.profil;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDiscoveryClient
class ProfilApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProfilApplication.class, args);
	}

}
