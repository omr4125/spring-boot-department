package com.department.springbootdepartment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

//    @Length(min = 1, max = 30)
//    @Email
//    @Positive
//    @Negative
    //@Column(nullable = false)
    @NotBlank(message = "department name should not be blank")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
