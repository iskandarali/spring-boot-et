package com.frankmoley.lil.sbet.landon.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Position;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private static final List<Employee> employees = new ArrayList();

    static{
        employees.add(new Employee(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
        employees.add(new Employee(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
        employees.add(new Employee(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
    }

    public List<Employee> getAllEmployee(){
        return employees;
    }
}