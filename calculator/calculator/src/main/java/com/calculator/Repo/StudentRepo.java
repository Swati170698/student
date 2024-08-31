package com.calculator.Repo;

import com.calculator.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {

}
