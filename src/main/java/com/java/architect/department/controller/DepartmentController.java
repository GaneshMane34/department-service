package com.java.architect.department.controller;

import com.java.architect.department.entity.Department;
import com.java.architect.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("-- Inside the controller of DepartmentController --");
        return  departmentService.saveDeparment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId) {

        return departmentService.findDepartmentByID(departmentId);

    }
}
