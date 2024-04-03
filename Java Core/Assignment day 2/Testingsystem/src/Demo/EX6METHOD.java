package Demo;

import java.util.Date;

public class EX6METHOD {
	public static void main (String[] args) {
		
		Department department1= new Department();
		department1.departmentId=1;
		department1.departmentName="Sale";
		
		Department department2= new Department();
		department2.departmentId=2;
		department2.departmentName="Maketting";
		
		Department department3= new Department();
		department3.departmentId=3;
		department3.departmentName="Dev";
		
		
		//Position
		
		Position position1= new Position();
		position1.positionId=1;
		position1.positionName="Nhân viên";
		
		Position position2= new Position();
		position2.positionId=2;
		position2.positionName="Giám đốc";
		
		Position position3= new Position();
		position3.positionId=3;
		position3.positionName="Thực tập sinh";
		
		//Account
		
		Account account1= new Account();
		account1.accountId=1;
		account1.fullName="Nguyễn Văn A";
		account1.userName="anguyen";
		account1.department = department1;
		account1.position= position1;
		account1.createDate = new Date("2024/04/01");

		Account account2= new Account();
		account2.accountId=2;
		account2.fullName="Nguyễn Văn B";
		account2.userName="bnguyen";
		account2.department = department2;
		account2.position= position1;;
		account2.createDate = new Date("2024/04/01");
		
		Account account3= new Account();
		account3.accountId=3;
		account3.fullName="Nguyễn Văn C";
		account3.userName="cnguyen";
		account3.department = department3;
		account3.position= position1;
		account3.createDate = new Date("2024/04/01");
	//Ex6: METHOD
	//Question1
	
	insochan();
	
	//Question2
	Account[] accounts = {account1, account2, account3};
	inaccount(accounts);
	
	//Question3
	insonguyenduong();
	
}

public static void insochan() {
    System.out.println("Các số chẵn nguyên dương nhỏ hơn 10:");
    for (int i = 2; i < 10; i += 2) {
        System.out.println(i);
    }
}


public static void inaccount(Account[] accounts) {
	int numberaccount=0;
	for(Account a: accounts) {
		System.out.println("id account là: "+ accounts[numberaccount].accountId);
		System.out.println("Họ và tên: "+ accounts[numberaccount].fullName);
		System.out.println("Tên tài khoản: "+ accounts[numberaccount].userName);
		System.out.println("Phòng ban: "+ accounts[numberaccount].department.departmentName);
		System.out.println("Chức vụ: "+ accounts[numberaccount].position.positionName);
		System.out.println("Ngày tạo: "+ accounts[numberaccount].createDate);
		numberaccount++;
		}
    
    }

public static void insonguyenduong() {
    System.out.println("Các số nguyên dương nhỏ hơn 10:");
    for (int i = 1; i < 10; i++) {
        System.out.println(i);
    }
}

}
