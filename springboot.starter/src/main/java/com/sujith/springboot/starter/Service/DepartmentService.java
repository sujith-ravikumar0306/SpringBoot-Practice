package com.sujith.springboot.starter.Service;

import com.sujith.springboot.starter.Entity.Department;
import com.sujith.springboot.starter.Error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    java.util.List<Department> fetchDepartments();

    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String name);
}
