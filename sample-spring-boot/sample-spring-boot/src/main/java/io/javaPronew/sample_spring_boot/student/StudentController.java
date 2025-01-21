package io.javaPronew.sample_spring_boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController

@RequestMapping("/allstu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.hello();
    }
    @PostMapping
    public void regNewStudent(@RequestBody Student student) {
        studentService.addnewStudent(student);
    }
    @PutMapping("/allstu/{studentId}")
    public void putStudent(@PathVariable("studentId")Long studentId,@RequestParam(required = false) String email ) {
        StudentService.putValueStudent(studentId,email);

    }
    @DeleteMapping(path ="/allstu/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);

    }


}
