package com.vti.backend;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Excercise3 {
	
	public void question1() {

    Group group = new Group();
    group.setGroupId(1);
    group.setGroupName("Java Group");

    Date createDate = new Date();
    group.setCreateDate(createDate);

    Account creator = new Account();
    creator.setAccountId(1);
    creator.setEmail("creator@example.com");
    creator.setUserName("creator");
    creator.setFullName("Creator");
  
    Department creatorDepartment = new Department();
    creatorDepartment.setDepartmentId(1);
    creatorDepartment.setDepartmentName("IT");
    creator.setDepartment(creatorDepartment);
    Position creatorPosition = new Position();
    creatorPosition.setPositionId(1);
    creatorPosition.setPositionName("Developer");
    creator.setPosition(creatorPosition);
    group.setCreator(creator);

    System.out.println("Group ID: " + group.getGroupId());
    System.out.println("Group Name: " + group.getGroupName());
    System.out.println("Group Creator: " + group.getCreator().getFullName());
    System.out.println("Group CreateDate: " + group.getCreateDate());
	}
}
