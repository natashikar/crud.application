package com.betisor.crud.application.service;

import com.betisor.crud.application.entity.Teacher;
import com.betisor.crud.application.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void update(Teacher teacher, Long id) {
        teacher.setId(id);
        teacherRepository.save(teacher);
    }

    public List<Teacher> findALl() {
        return teacherRepository.findAll();
    }

    public Teacher getOne(Long id) {
        return teacherRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void delete(Long id) {
        var teacher = getOne(id);

        teacherRepository.delete(teacher);
    }

}