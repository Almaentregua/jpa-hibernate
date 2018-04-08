package ar.com.martinjm.service.Implementation;

import ar.com.martinjm.entities.EmployeEntity;
import ar.com.martinjm.repositories.TestRepository;
import ar.com.martinjm.service.Interfaces.EmployeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServices implements EmployeInterface    {

    @Autowired
    TestRepository testRepository;

    @Override
    public List<EmployeEntity> getAllEmployes() {
        List<EmployeEntity> response = testRepository.findAll();
        return response;
    }
}
