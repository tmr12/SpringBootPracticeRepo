package com.tmr.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.tmr.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
