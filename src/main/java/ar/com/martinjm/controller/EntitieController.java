package ar.com.martinjm.controller;

import ar.com.martinjm.entities.AutorEntity;
import ar.com.martinjm.entities.EmployerEntity;
import ar.com.martinjm.service.Implementation.BookService;
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

    @Autowired
    BookService bookService;

    @RequestMapping("allemploye")
    @ResponseBody
    public List<EmployerEntity> getAllEmployer(){
        return employeServices.getAllEmployes();
    }

    @RequestMapping("allAutors")
    @ResponseBody
    public List<AutorEntity> getAllAutors(){
        return bookService.getAllAutors();
    }

}
