package dev.imy.project3_studentmanagementupgrades.repository;

import dev.imy.project3_studentmanagementupgrades.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
