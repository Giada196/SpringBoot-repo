package co.develhope.crudTestDemo.services;

import co.develhope.crudTestDemo.entities.Student;
import co.develhope.crudTestDemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class StudentService{

    @Autowired
    StudentRepository studentRepository;


   public void updateisWorking(Long studentId, boolean isWorking){
      Optional<Student> student = studentRepository.findById(studentId);
       if(!student.isPresent()) return;
    student.get().setWorking(isWorking);
      studentRepository.save(student.get());

    }
}