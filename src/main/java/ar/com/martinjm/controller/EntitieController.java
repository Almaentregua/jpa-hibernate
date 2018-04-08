package ar.com.martinjm.controller;

import ar.com.martinjm.entities.EmployeEntity;
import ar.com.martinjm.service.Implementation.EmployeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class EntitieController {

    @Autowired
    EmployeServices employeServices;

    @RequestMapping("test")
    @ResponseBody
    public List<EmployeEntity> test(){
        return employeServices.getAllEmployes();
    }
}
