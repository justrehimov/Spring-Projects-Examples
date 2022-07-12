package com.desofme.springbootresttemplate.api;

import com.desofme.springbootresttemplate.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class RestClientController {

    private final RestTemplate restTemplate;
    private final static String url = "http://localhost:8080/employee";

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.ok(getEmployeeList());
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(save(employee));
    }

    private Employee save(Employee employee){
        ResponseEntity<Employee> response = restTemplate.postForEntity(url, employee, Employee.class);
        return response.getBody();
    }
    private List<Employee> getEmployeeList(){
       ResponseEntity<List> response =  restTemplate.getForEntity(url, List.class);
       List<Employee> employees = response.getBody();
       return employees;
    }

}
