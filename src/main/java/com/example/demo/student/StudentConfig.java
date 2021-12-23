package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student maximiliano = new Student("Maximiliano","maximilianolenzu@gmail.com",LocalDate.of(1995, Month.SEPTEMBER,13));
            Student casco = new Student("Casco","casco@gmail.com", LocalDate.of(2004, Month.JANUARY,5));
            repository.saveAll(
                    List.of(maximiliano,casco)
            );
        };
    }
}
