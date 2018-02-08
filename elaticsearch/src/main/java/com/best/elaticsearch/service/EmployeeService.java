package com.best.elaticsearch.service;

import com.best.elaticsearch.model.Employee;
import com.best.elaticsearch.reposities.EmployeeReposity;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeReposity employeeReposity;


    public Employee add(Employee employee){
        return employeeReposity.save(employee);
    }


    public Iterable<Employee> list(String query ){
        return  employeeReposity.search( new QueryStringQueryBuilder(query)
                .field("firstName") );
    }
}
