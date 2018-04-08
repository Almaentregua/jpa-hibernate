package ar.com.martinjm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class EntitieController {

    @RequestMapping("test")
    public void test(){

    }
}
