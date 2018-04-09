package ar.com.martinjm.service.Implementation;

import ar.com.martinjm.entities.DirectionEntity;
import ar.com.martinjm.entities.EmployerEntity;
import ar.com.martinjm.repositories.EmployerRepository;
import ar.com.martinjm.service.Interfaces.EmployeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServices implements EmployeInterface    {

    @Autowired
    EmployerRepository employerRepository;

    @Override
    public List<EmployerEntity> getAllEmployes() {
        DirectionEntity directionEntity = new DirectionEntity();
        directionEntity.setStreet("calle falsa");
        directionEntity.setStreetNumber(123);
        EmployerEntity employerEntity = new EmployerEntity();
        employerEntity.setDirectionEntity(directionEntity);
        employerEntity.setName("name");
        employerEntity.setLastName("lastname");
        employerRepository.save(employerEntity);
        List<EmployerEntity> response = employerRepository.findAll();
        return response;
    }
}
