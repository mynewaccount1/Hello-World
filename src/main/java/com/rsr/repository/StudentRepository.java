package com.rsr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rsr.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
