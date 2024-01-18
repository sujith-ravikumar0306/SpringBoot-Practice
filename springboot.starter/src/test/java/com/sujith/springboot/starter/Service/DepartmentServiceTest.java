package com.sujith.springboot.starter.Service;

import com.sujith.springboot.starter.Controller.DepartmentController;
import com.sujith.springboot.starter.Entity.Department;
import com.sujith.springboot.starter.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {

        Department d = Department.builder()
                .name("IT")
                .address("IT-5")
                .deptCode("1234")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByNameIgnoreCase("IT"))
                .thenReturn(d);

    }

    @Test
    @DisplayName("Test to fetch department by name")
    public void returnDepartment_whenNameISValid()
    {
        String deptName="IT";
        Department found = departmentService.fetchDepartmentByName(deptName);
        assertEquals(deptName, found.getName());
    }
}