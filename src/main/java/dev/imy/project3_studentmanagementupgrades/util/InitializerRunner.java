package dev.imy.project3_studentmanagementupgrades.util;

import dev.imy.project3_studentmanagementupgrades.model.Student;
import dev.imy.project3_studentmanagementupgrades.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        studentRepository.deleteAll();

        studentRepository.save(Student.builder().name("Ali").address("Istanbul").birthDate(LocalDate.of(1993, 1, 13)).gender("Male").build());
        studentRepository.save(Student.builder().name("Veli").address("Edirne").birthDate(LocalDate.of(1992, 2, 4)).gender("Male").build());
        studentRepository.save(Student.builder().name("Fatma").address("Bandirma").birthDate(LocalDate.of(1991, 3, 5)).gender("Female").build());


        studentRepository.findAll().forEach(user -> logger.info("{}", user));
    }
}
