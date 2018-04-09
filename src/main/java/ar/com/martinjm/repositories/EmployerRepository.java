package ar.com.martinjm.repositories;

import ar.com.martinjm.entities.EmployerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepository extends CrudRepository<EmployerEntity,Integer> {
    EmployerEntity findEmpleadoByName(String name);
    List<EmployerEntity> findAll();
}
