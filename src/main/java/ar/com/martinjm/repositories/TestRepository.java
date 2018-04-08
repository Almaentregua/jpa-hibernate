package ar.com.martinjm.repositories;

import ar.com.martinjm.entities.EmployeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<EmployeEntity,Integer> {
    EmployeEntity findEmpleadoByName(String name);
    List<EmployeEntity> findAll();
}
