package com.SpringCrud.Crud.repository;

import com.SpringCrud.Crud.Domain.LoginForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SpringCrud.Crud.Domain.Student;
@Repository
public interface LoginRepository extends JpaRepository<Student, Long> {
    LoginForm findByUsernameAndPassword(String username, String password);
}

