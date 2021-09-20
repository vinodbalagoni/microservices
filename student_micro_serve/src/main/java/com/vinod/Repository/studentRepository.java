package com.vinod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinod.Model.Student;
@Repository
public interface studentRepository extends JpaRepository<Student, Long> {

}
