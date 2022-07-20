package com.devsuperior.depts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.depts.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
