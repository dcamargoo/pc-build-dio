package com.example.pc_build_dio.repository;

import com.example.pc_build_dio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}