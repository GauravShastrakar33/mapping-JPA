package com.example.mapping_JPA.repositories;

import com.example.mapping_JPA.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
