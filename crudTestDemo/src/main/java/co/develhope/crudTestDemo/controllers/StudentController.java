package co.develhope.crudTestDemo.controllers;

import co.develhope.crudTestDemo.entities.Student;
import co.develhope.crudTestDemo.repositories.StudentRepository;
import co.develhope.crudTestDemo.services.StudentService;
import jakarta.websocket.server.PathParam;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;
    @PostMapping("")
    public @ResponseBody Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @GetMapping("/")
    public @ResponseBody List<Student> getList(){
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public @ResponseBody Student getSingle(@PathVariable long id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()) {
            return student.get();
        } else {
            return null;
        }
    }
    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody @NotNull Student student) {
        student.setId(id);
        studentRepository.save(student);

    }
    @PutMapping("/{id}/working")
    public void setStudentWorking(@PathVariable long id, @RequestParam("isWorking") boolean isWorking) {
        studentService.updateisWorking(id, isWorking);

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        studentRepository.deleteById(id);

    }


}
