package com.br.user_api;

import com.br.user_api.domain.User;
import com.br.user_api.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private User_Repository user_repository;

	@Override
	public void run(String... args) throws Exception {
		user_repository.save(new User(null, "User Test", "email@test.com", "test", 25.8));
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

}
