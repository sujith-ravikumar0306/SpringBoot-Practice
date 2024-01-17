package com.sujith.springboot.starter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data   //Takes care of getter,setter, toString, hashCode methods
@NoArgsConstructor  //Creates constructor with no arguments
@AllArgsConstructor //Creates constructor with all arguments
@Builder    //Implement a builder pattern
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Department name cannot be empty!")
    private String name;
    private String address;
    @Length(max = 5 , min = 3)
    private String deptCode;

}
