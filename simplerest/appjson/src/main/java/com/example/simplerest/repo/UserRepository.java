package com.example.simplerest.repo;

import com.example.simplerest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
