package com.vti.backend;

import com.vti.entity.Department;

public class Excercise1 {
	public void question1() {
      
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Sales");

        
        System.out.println("Department ID: " + department.getDepartmentId());
        System.out.println("Department Name: " + department.getDepartmentName());
    }
}
