package ar.com.martinjm.repositories;

import ar.com.martinjm.entities.AutorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<AutorEntity, Integer> {
    List<AutorEntity> findAll();
}
