package com.sujith.springboot.starter.Service;

import com.sujith.springboot.starter.Entity.Department;
import com.sujith.springboot.starter.Error.DepartmentNotFoundException;
import com.sujith.springboot.starter.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartments()
    {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(departmentId);
        if(!department.isPresent())
        {
            throw new DepartmentNotFoundException("The department is not available");
        }

        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName()))
        {
            depDB.setName(department.getName());
        }

        if(Objects.nonNull(department.getAddress()) && !"".equalsIgnoreCase(department.getAddress()))
        {
            depDB.setAddress(department.getAddress());
        }

        if(Objects.nonNull(department.getDeptCode()) && !"".equalsIgnoreCase(department.getDeptCode()))
        {
            depDB.setDeptCode(department.getDeptCode());
        }

        return departmentRepository.save(depDB);

    }

    @Override
    public Department fetchDepartmentByName(String name) {
        return departmentRepository.findByNameIgnoreCase(   name);
    }


    //This is a comment
}
