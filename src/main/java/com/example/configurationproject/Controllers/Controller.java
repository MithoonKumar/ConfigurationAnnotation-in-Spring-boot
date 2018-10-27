package com.example.configurationproject.Controllers;


import com.example.configurationproject.Configurations.configurerClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private configurerClass configurerClass1;


    @RequestMapping(method = RequestMethod.GET, value = "/get")
    @ResponseBody
    public String exposedMethod () {
        return configurerClass1.name;
    }
}
