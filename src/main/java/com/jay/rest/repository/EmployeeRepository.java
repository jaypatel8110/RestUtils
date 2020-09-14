package com.jay.rest.repository;

import com.jay.rest.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
    //https://github.com/shameed1910/springboot-mongodb/tree/master/springboot-mongodb
}
