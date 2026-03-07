package com.example.pc_build_dio.repository;

import com.example.pc_build_dio.entity.Build;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildRepository extends JpaRepository<Build, Long> {
}