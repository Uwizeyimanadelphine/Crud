package com.SpringCrud.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringCrud.Crud.Domain.Mark;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer> {
}
