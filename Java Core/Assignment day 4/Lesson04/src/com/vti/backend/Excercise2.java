package com.vti.backend;

import java.util.Date;

import com.vti.entity.Account;

	public class Excercise2 {
		public void question1() { 
			Account account = new Account();
			account.setAccountId(2);
			account.setEmail("Vukhaiim@gmail.com");
			account.setUserName("ngockhai");
			account.setFullName("Vu Ngoc Khai");
			Date createDate = new Date();
	        account.setCreateDate(createDate);
			account.setCreateDate(createDate);
			
		    System.out.println("Account ID: " + account.getAccountId());
		    System.out.println("Account Email: " + account.getEmail());
		    System.out.println("Account UserName: " + account.getUserName());
		    System.out.println("Account FullName: " + account.getFullName());
		    System.out.println("Account getCreateDate: " + account.getCreateDate());
		    }
}
