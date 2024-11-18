package co.project.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.project.proyecto.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    List <Employee> findByName(@Param("name") String name);

}
