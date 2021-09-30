package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repo) {
		return args ->{
			Student mary = new Student(1L,"Mary", "mary@demo.com", LocalDate.of(2000, Month.SEPTEMBER, 30),22);
			Student jane = new Student(2L,"Jane", "jane@demo.com", LocalDate.of(1999, Month.SEPTEMBER, 11),23);
			Student alex = new Student(3L,"Alex", "alex@demo.com", LocalDate.of(1996, Month.JANUARY, 31),26);
			repo.saveAll(Arrays.asList(mary,jane,alex));
		};
	}
}
