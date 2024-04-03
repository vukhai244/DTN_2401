package Demo;

import java.util.Date;

public class EX1FLOWCONTROL {
	public static void main (String[] args) {
		
		//Department

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
		
		//Group
		
		Group group1= new Group();
		group1.groupId=1;
		group1.groupName="Group 1";
		group1.creator= account2;
		group1.createDate = new Date("2024/04/01");
		
		Group group2= new Group();
		group2.groupId=1;
		group2.groupName="Group 2";
		group2.creator= account2;
		group2.createDate = new Date("2024/04/01");
		
		Group group3= new Group();
		group3.groupId=3;
		group3.groupName="Group 3";
		group3.creator= account2;
		group3.createDate = new Date("2024/04/01");
		
		//Assignment day 2
		
				//EX1: FLOW CONTROL
				//Question1
				if(account2.department.departmentName == null)
				{
					System.out.println("Nhân viên này chưa có phòng ban: ");
				} else {
					System.out.println("Phòng ban của nhân viên này là:  " + account2.department.departmentName);
				}
				
				//Question2
				
				Group[] groups = {group1,group2,group3};
				int numbergroup1=0;
				for(Group g: groups) {
					if(groups[numbergroup1].creator==account2)
					numbergroup1++;
					}
				if(groups[0].creator==account2 && groups[1].creator==account2 && groups[2].creator==account2){
					System.out.println("Nhân viên này là người quan trọng");
				}else if(groups[0].creator==account2 && groups[1].creator==account2 && groups[2].creator==account2 && groups[3].creator==account2){
					System.out.println("Nhân viên này là người hóng chuyện tham gia tất cả group");
				}else {
					System.out.println("Group của nhân viên này là Java, Fresher, C# Fresher");
				}
				
				//Question3
				
				String message = account2.department.departmentName == null ? "Nhân viên này có phòng ban" : "Phòng ban của nhân viên này là: "+ account2.department.departmentName;
				System.out.println(message);
				
				//Question4
				
				String ques4 = (account1.position.positionName == "Dev") ? "Đây là dev" : "Người này không phải dev";
				System.out.println(ques4);
				
				//Question6
				
				switch (numbergroup1) {
			    case 1:
			        System.out.println("Group của nhân viên này là Java, Fresher, C# Fresher");
			        break;
			    case 2:
			        System.out.println("Group của nhân viên này là Java, Fresher, C# Fresher");
			        break;
			    case 3:
			        System.out.println("Nhân viên này là người quan trọng");
			        break;
			    default:
			    	System.out.println("Nhân viên này là người hóng chuyện tham gia tất cả group");
			    	}
				
				//Question7
				int number7;
				if(account1.position.positionName == "Dev") {
					number7 = 1;
				} else {number7 = 2;}
				
				switch (number7) {
			    case 1:
			        System.out.println("Đây là dev");
			        break;
			    case 2:
			        System.out.println("Người này không phải dev");
			        break;
			    	}
				
				//FOREACH
				//question 8
				
				Account[] accounts = {account1,account2,account3};
				for(Account a: accounts) {
					System.out.println("Email: "+ a.email);
					System.out.println("FullName: "+ a.fullName);
					System.out.println("Phòng ban: "+ a.department.departmentName);
					}
				
				//question 9
				
				Department[] departments = {department1,department2,department3};
				for(Department d: departments) {
					System.out.println("ID: "+ d.departmentId);
					System.out.println("Name: "+ d.departmentName);
					}
				
				//FOR
				//Question10
				for(int i=0; i<accounts.length;i++){
					System.out.println("Thông tin account thứ "+ (i+1) +" là: ");
					System.out.println("Email: "+ accounts[i].email);
					System.out.println("FullName: "+ accounts[i].fullName);
					System.out.println("Phòng ban: "+ accounts[i].department.departmentName);
				}
				
				//Question11
				for(int i=0; i<departments.length;i++){
					System.out.println("Thông tin department thứ "+ (i+1) +" là: ");
					System.out.println("id: "+ departments[i].departmentId);
					System.out.println("Name: "+ departments[i].departmentName);
				}
				
				//Question12
				for(int i=0; i<departments.length-1;i++){
					System.out.println("Thông tin department thứ "+ (i+1) +" là: ");
					System.out.println("id: "+ departments[i].departmentId);
					System.out.println("Name: "+ departments[i].departmentName);
				}
				
				//Question13
				for(int i=0; i<accounts.length;i++){
					if(accounts[i]!=account2) {
					System.out.println("Thông tin account thứ "+ (i+1) +" là: ");
					System.out.println("Email: "+ accounts[i].email);
					System.out.println("FullName: "+ accounts[i].fullName);
					System.out.println("Phòng ban: "+ accounts[i].department.departmentName);
					}
				}
				
				//Question14
				for(int i=0; i<accounts.length;i++){
					if(accounts[i].accountId<4) {
					System.out.println("Thông tin account thứ "+ (i+1) +" là: ");
					System.out.println("Email: "+ accounts[i].email);
					System.out.println("FullName: "+ accounts[i].fullName);
					System.out.println("Phòng ban: "+ accounts[i].department.departmentName);
					}
				}
				
				//Question15
				for(int i=0; i<20;i+=2){
					System.out.println(i);
					}
				
				
				//WHILE
				//Question16
				int i1=0;
				while(i1<accounts.length){
					System.out.println("Thông tin account thứ "+ (i1+1) +" là: ");
					System.out.println("Email: "+ accounts[i1].email);
					System.out.println("FullName: "+ accounts[i1].fullName);
					System.out.println("Phòng ban: "+ accounts[i1].department.departmentName);
					i1++;
				}
				
				//Question17
				int i2=0;
				while(i2<accounts.length){
					System.out.println("Thông tin department thứ "+ (i2+1) +" là: ");
					System.out.println("id: "+ departments[i2].departmentId);
					System.out.println("Name: "+ departments[i2].departmentName);
					i2++;
				}
				
				
				//Question18
				int i3=0;
				while(i3<accounts.length-1){
					System.out.println("Thông tin department thứ "+ (i3+1) +" là: ");
					System.out.println("id: "+ departments[i3].departmentId);
					System.out.println("Name: "+ departments[i3].departmentName);
					i3++;
				}
				
				//Question19
				int i4=0;
				while(i4<accounts.length){
					if(accounts[i4]!=account2) {
					System.out.println("Thông tin account thứ "+ (i4+1) +" là: ");
					System.out.println("Email: "+ accounts[i4].email);
					System.out.println("FullName: "+ accounts[i4].fullName);
					System.out.println("Phòng ban: "+ accounts[i4].department.departmentName);
					}
					i4++;
				}
				
				//Question20
				int i5 =0;
				while(i5<accounts.length){
					if(accounts[i5].accountId<4) {
					System.out.println("Thông tin account thứ "+ (i5+1) +" là: ");
					System.out.println("Email: "+ accounts[i5].email);
					System.out.println("FullName: "+ accounts[i5].fullName);
					System.out.println("Phòng ban: "+ accounts[i5].department.departmentName);
					}
					i5++;
				}
				
				//Question21
				int i6=2;
				while(i6<20){
					System.out.println(i6);
					i6+=2;
					}
				
				
				//DO- WHILE
				//Question22
				int q1 = 0;
				do {
				    System.out.println("Thông tin account thứ " + (q1 + 1) + " là: ");
				    System.out.println("Email: " + accounts[q1].email);
				    System.out.println("FullName: " + accounts[q1].fullName);
				    System.out.println("Phòng ban: " + accounts[q1].department.departmentName);
				    q1++;
				} while (q1 < accounts.length);
				
				//Question23
				int q2 = 0;
				do {
				    System.out.println("Thông tin department thứ " + (q2 + 1) + " là: ");
				    System.out.println("id: " + departments[q2].departmentId);
				    System.out.println("Name: " + departments[q2].departmentName);
				    q2++;
				} while (q2 < departments.length);
				
				
				//Question24
				int q3 = 0;
				do {
				    System.out.println("Thông tin department thứ " + (q3 + 1) + " là: ");
				    System.out.println("id: " + departments[q3].departmentId);
				    System.out.println("Name: " + departments[q3].departmentName);
				    q3++;
				} while (q3 < accounts.length - 1);
				
				//Question25
				int q4 = 0;
				do {
				    if (accounts[q4] != account2) {
				        System.out.println("Thông tin account thứ " + (q4 + 1) + " là: ");
				        System.out.println("Email: " + accounts[q4].email);
				        System.out.println("FullName: " + accounts[q4].fullName);
				        System.out.println("Phòng ban: " + accounts[q4].department.departmentName);
				    }
				    q4++;
				} while (q4 < accounts.length);
				
				//Question14
				int q5 = 0;
				do {
				    if (accounts[q5].accountId < 4) {
				        System.out.println("Thông tin account thứ " + (q5 + 1) + " là: ");
				        System.out.println("Email: " + accounts[q5].email);
				        System.out.println("FullName: " + accounts[q5].fullName);
				        System.out.println("Phòng ban: " + accounts[q5].department.departmentName);
				    }
				    q5++;
				} while (q5 < accounts.length);
				
				//Question15
				int q6 = 2;
				do {
				    System.out.println(q6);
				    q6 += 2;
				} while (q6 < 20);
	}
}
	
				
	
	
	
	
				
				
				


