package com.best.elaticsearch.reposities;

import com.best.elaticsearch.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeReposity extends ElasticsearchRepository<Employee,Long>{
}
