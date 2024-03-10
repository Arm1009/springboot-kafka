package com.kafkaProject.springbootkafka.repository;

import com.kafkaProject.springbootkafka.payload.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository interface for managing user data.
 */
public interface UserDataRepository extends JpaRepository<User, String> { }