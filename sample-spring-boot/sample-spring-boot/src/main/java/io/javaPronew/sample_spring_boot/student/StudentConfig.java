package io.javaPronew.sample_spring_boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository respo){
        return args -> {
            Student hari = new Student(
                    "hari",
                    "harish8502@gmial.com",
                    LocalDate.of(2002, Month.MAY,8)

            );
            Student ammu = new Student(
                    "ammu",
                    "ammu123@gamil.com",
                    LocalDate.of(2007,Month.JULY,7)


            );
            //List.of(hari, ammu).forEach(respo::save);

        };

    }
}
