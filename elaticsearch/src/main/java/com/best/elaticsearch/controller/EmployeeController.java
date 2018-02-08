package com.best.elaticsearch.controller;

import com.best.elaticsearch.model.Employee;
import com.best.elaticsearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
//
//
//    @RequestMapping("/{id}")
//    public Employee get(long id){
//       return employeeSearch.findOne( id );
//    }

    @RequestMapping(value = "/add", method = RequestMethod.POST )
    public Employee add( Employee employee){
        return employeeService.add(employee);
    }
//
//
//    @RequestMapping("/list")
//    public Iterable<Employee> add(){
//        return employeeSearch.findAll();
//    }
}
