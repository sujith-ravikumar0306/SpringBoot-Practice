package com.sujith.springboot.starter.Controller;

import com.sujith.springboot.starter.Entity.Department;
import com.sujith.springboot.starter.Error.DepartmentNotFoundException;
import com.sujith.springboot.starter.Service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

    //Create a record
    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department)
    {
        LOGGER.info("Inside saveDepartment() of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    //Get all the records
    @GetMapping("/department")
    public List<Department> fetchDepartment()
    {
        LOGGER.info("Inside fetDepartment() of DepartmentController");
        return  departmentService.fetchDepartments();
    }

    //Get a record by specific id
    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getDepartmentById(departmentId);
    }

    //Delete a record by specific id
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id")Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted. ID:"+departmentId;
    }

    //Update a record by id
    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id")Long departmentId , @RequestBody Department department)
    {
        return departmentService.updateDepartment(departmentId,department);
    }

    //Get a record from DB using name
    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable String name)
    {
        return departmentService.fetchDepartmentByName(name);
    }

}
