package com.best.elaticsearch;

import com.best.elaticsearch.model.Employee;
import com.best.elaticsearch.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElaticsearchApplicationTests {

	@Test
	public void contextLoads(){
	}

	@Autowired
	EmployeeService employeeService;

//	@Autowired
//	ElasticsearchTemplate elasticsearchTemplate;
//
//
//	@Before
//	public void init(){
//		elasticsearchTemplate.deleteIndex(Employee.class);
//		elasticsearchTemplate.createIndex(Employee.class);
//		elasticsearchTemplate.putMapping(Employee.class);
//		elasticsearchTemplate.refresh(Employee.class);
//	}


	@Test
	public void addTest(){
		Employee employee =new Employee();
		employee.setFirstName("test");
		employee.setAbout("test about");
		employee.setAge( 34);employee.setId(899L);employee.setLastName("last name test");

		employeeService.add(employee);

		Iterable<Employee> iterable = employeeService.list(employee.getFirstName());

	}

}
