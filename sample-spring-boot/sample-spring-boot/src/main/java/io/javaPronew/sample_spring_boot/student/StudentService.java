package io.javaPronew.sample_spring_boot.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    public static StudentRepository studentRepository;

    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void putValueStudent(Long studentId , String email) {

        Student stu = studentRepository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        stu.setEmail(email);
    }

    public List<Student> hello() {
        return studentRepository.findAll();
    }

    public void addnewStudent(Student student) {
        //System.out.println(student);
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (exists) {
            studentRepository.deleteById(studentId);

        }
        else{
            System.out.println("Student not found");
        }
    }

}
