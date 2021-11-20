package dev.imy.project3_studentmanagementupgrades.controller;

import dev.imy.project3_studentmanagementupgrades.model.Student;
import dev.imy.project3_studentmanagementupgrades.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAllStudents")
    public ResponseEntity<List<Student>> findAll(){
        return new ResponseEntity<>(studentService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/findStudentByID/{id}")
    public ResponseEntity<Student> findByID(@PathVariable int id){
        return new ResponseEntity<>(studentService.findByID(id),HttpStatus.OK);
    }

    @PostMapping("/saveStudents")
    public String save(@RequestBody Student student){
        studentService.save(student);
        return "SAVED.";
    }

    @PutMapping("/updateStudents")
    public String update(@RequestBody Student student){
        studentService.update(student);
        return "UPDATED.";
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete(@PathVariable int id){
        studentService.deleteByID(id);
        return "DELETED.";
    }
}
