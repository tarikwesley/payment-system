package com.project.paymentsystem.repository;

import com.project.paymentsystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
