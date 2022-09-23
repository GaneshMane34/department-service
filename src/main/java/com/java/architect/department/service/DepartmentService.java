package com.java.architect.department.service;

import com.java.architect.department.entity.Department;
import com.java.architect.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDeparment(Department department) {
        log.info("-- Inside the service of Department--");
        return  departmentRepository.save(department);
    }

    public Department findDepartmentByID(Long departmentId) {
        return  departmentRepository.findByDepartmentId(departmentId);
    }
}
