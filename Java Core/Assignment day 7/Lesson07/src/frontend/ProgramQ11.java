package frontend;

import backend.InvalidAgeInputingException;
import backend.Account;

public class ProgramQ11 {
	public static void main(String[] args) {
		Account account = new Account();
		try {
			account.inputAge(25); 
            account.inputAge(-5);
			
		} catch(InvalidAgeInputingException e){
			System.out.println("Lỗi: " + e.getMessage());
		}
		
		System.out.println("completed!");
	}
}
s