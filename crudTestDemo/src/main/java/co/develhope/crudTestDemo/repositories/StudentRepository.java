package co.develhope.crudTestDemo.repositories;

import co.develhope.crudTestDemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
