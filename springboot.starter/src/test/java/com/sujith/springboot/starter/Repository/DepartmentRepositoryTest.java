//package com.sujith.springboot.starter.Repository;
//
//import com.sujith.springboot.starter.Entity.Department;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//class DepartmentRepositoryTest {
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//    @BeforeEach
//    void setUp() {
//        Department d = Department.builder()
//                .departmentId(1L)
//                .name("MECH")
//                .address("ME-01")
//                .deptCode("1234")
//                .build();
//
//        testEntityManager.persist(d);
//    }
//
//    @Test
//    @DisplayName("Getting department by ID")
//    public void getTheDepartmentWithId()
//    {
//        Department d = departmentRepository.findById(1L).get();
//        assertEquals(d.getName(),"MECH");
//
//    }
//}