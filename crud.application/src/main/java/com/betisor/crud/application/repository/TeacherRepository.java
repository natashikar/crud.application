package com.betisor.crud.application.repository;

import com.betisor.crud.application.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    default List<Teacher> findAllByAge(Integer age) {
        return null;
    }


}
