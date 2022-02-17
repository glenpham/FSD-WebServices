package com.example.restservice.service;

import com.example.restservice.model.Employee;
import com.example.restservice.model.Address;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){

        Employee emp1 = new Employee(1,"Joseph","Joestar",new Address(4322,"Papineau Avenue",
                "H2K 4J5"),"514-241-9258" );
        Employee emp2 = new Employee(2,"Jotaro","Joestar",new Address(2721,"Levy Street",
                "H3C 5K4"),"514-718-4134" );
        Employee emp3 = new Employee(3,"Dio","Brando",new Address(4396,"Acadie Boulevard",
                "H2K 4J5"),"514-984-4142" );
        Employee emp4 = new Employee(4,"Giorno","Giovanna",new Address(538,"Sherbrooke West",
                "H4A 1H3"),"514-512-4735" );

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        return employees;
    }

    public Employee getById(int id){
        for(Employee emp : employees){
            if (emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
