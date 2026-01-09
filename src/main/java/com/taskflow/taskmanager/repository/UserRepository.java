package com.taskflow.taskmanager.repository;

import com.taskflow.taskmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
