package frontend;

import backend.Department;
import backend.Position;

import java.text.SimpleDateFormat;
import java.util.Date;

import backend.Account;

public class Program {
	public static void main(String[] args) {
		
		//Question 1
        // Khởi tạo một Object với mỗi constructor
		/*
        Department department1 = new Department();
        System.out.println("Department ID: " + department1.getId()); 
        System.out.println("Department Name: " + department1.getName()); 

        Department department2 = new Department("HR,BA");
        System.out.println("Department ID: " + department2.getId()); 
        System.out.println("Department Name: " + department2.getName()); */
        
      //Question 2
        Account account1 = new Account();
        System.out.println("Account ID: " + account1.getAccountId());
        System.out.println("Account Email: " + account1.getEmail());
        System.out.println("Account UserName: " + account1.getUserName());
        System.out.println("Account FirstName: " + account1.getFirstName());
        System.out.println("Account Lastname: " + account1.getLastName());
        
        Account account2 = new Account(1, "vukhai@gmail.com", "ngockhai", "Vũ", "Khải");
        System.out.println("Account ID: " + account2.getAccountId());
        System.out.println("Account Email: " + account2.getEmail());
        System.out.println("Account UserName: " + account2.getUserName());
        System.out.println("Account FirstName: " + account2.getFirstName());
        System.out.println("Account Lastname: " + account2.getLastName());
        
        Position position = new Position("Giám đốc");
        Account account3 = new Account(2, "vukhai@gmail.com", "ngockhai", "Vũ", "Khải", position);
        System.out.println("Account ID: " + account3.getAccountId());
        System.out.println("Account Email: " + account3.getEmail());
        System.out.println("Account UserName: " + account3.getUserName());
        System.out.println("Account FirstName: " + account3.getFirstName());
        System.out.println("Account Lastname: " + account3.getLastName());
        System.out.println("Account Position: " + account3.getPositionName());
        System.out.println("Account CreateDate: " + account3.getCreateDate());
        
        
        
	}
}
