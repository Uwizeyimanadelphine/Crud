package com.SpringCrud.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringCrud.Crud.Domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
