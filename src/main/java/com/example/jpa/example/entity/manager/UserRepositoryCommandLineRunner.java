package com.example.jpa.example.entity.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.jpa.example.entity.User;
import com.example.jpa.example.repository.UserRepository;

public class UserRepositoryCommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	public void run(String... args) {
		User harry = new User("Harry", "Admin");
		userRepository.save(harry);
		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		for (User user : userRepository.findAll()) {
			log.info(user.toString());
		}
	}
}
