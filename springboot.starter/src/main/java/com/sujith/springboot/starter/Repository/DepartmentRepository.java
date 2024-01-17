package com.sujith.springboot.starter.Repository;

import com.sujith.springboot.starter.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //Find a record by specific field (name in our example)
    public Department findByname(String name);

    //Find a record by specific field (name in our example) ignoring the case sensitivity.
    public Department findByNameIgnoreCase(String name);
}
