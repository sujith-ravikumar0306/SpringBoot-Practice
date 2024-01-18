//package com.sujith.springboot.starter.Controller;
//
//import com.sujith.springboot.starter.Entity.Department;
//import com.sujith.springboot.starter.Service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.awt.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .name("CSE")
//                .address("DELHI")
//                .deptCode("CSE_DL")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    @DisplayName("Test for saving entity")
//    void saveDepartment() throws Exception {
//        Department idepartment = Department.builder()
//                .name("CSE")
//                .address("DELHI")
//                .deptCode("CSE_DL")
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(idepartment))
//                .thenReturn(department);
//
//        mockMvc.perform(post("/department")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "    \"name\":\"CSE\",\n" +
//                        "    \"address\":\"DELHI\",\n" +
//                        "    \"deptCode\":\"CSE_DL\"\n" +
//                        "}"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void getDepartmentById()
//    {
//
//    }
//}