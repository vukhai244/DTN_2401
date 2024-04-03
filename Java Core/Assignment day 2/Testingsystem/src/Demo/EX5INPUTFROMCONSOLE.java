package Demo;

import java.util.Scanner;

public class EX5INPUTFROMCONSOLE {
	public static void main (String[] args) {
    //Question 1
    
    Scanner scanner = new Scanner(System.in);
    for(int i=1; i<4; i++) {
    	System.out.print("Nhập số nguyên thứ " + i+ ": ");
        int number1 = scanner.nextInt();
        System.out.println("Số thứ " + i+" là: " + number1);
    }
    
    //Question 2
    
   for(int i=1; i<3; i++) {
    	System.out.print("Nhập số thực thứ " + i+ ": ");
        double number1 = scanner.nextDouble();
        System.out.println("Số thứ " + i+" là: " + number1);
    }
    
    //Question 3
    
   Scanner scanner1 = new Scanner(System.in);

    System.out.print("Nhập họ và tên: ");
    String fullName = scanner1.nextLine();
    System.out.println("Họ và tên của bạn là: " + fullName);
   
    
    //Question 4
    Scanner scanner4 = new Scanner(System.in);
    System.out.print("Nhập ngày sinh nhật của bạn (dd/MM/yyyy): ");
    String birthday = scanner4.nextLine();
    System.out.println("Ngày sinh nhật của bạn là: " + birthday);
	
    //Question 5
    account();
    
    //Question 6
    department();
    
    //Question 7
    Scanner scanner7 = new Scanner(System.in);

    System.out.print("Nhập số chẵn: ");
    int number = scanner7.nextInt();

    while (number % 2 != 0) {
        System.out.println("Số bạn nhập không phải số chẵn. Hãy nhập lại.");
        System.out.print("Nhập số chẵn: ");
        number = scanner7.nextInt();
    }

    System.out.println("Số chẵn bạn đã nhập là: " + number);
    
    //Question8
    question8();
    scanner.close();
}
public static void account() {
Scanner scanner = new Scanner(System.in);

System.out.println("Nhập Position (1: Dev, 2: Test, 3: ScrumMaster, 4: PM): ");
int positionCode = scanner.nextInt();
scanner.nextLine();
String position;
switch(positionCode) {
    case 1:
        position = "Dev";
        System.out.println(position);
        break;
    case 2:
        position = "Test";
        System.out.println(position);
        break;
    case 3:
        position = "ScrumMaster";
        System.out.println(position);
        break;
    case 4:
        position = "PM";
        System.out.println(position);
        break;
    default:
        position = "Unknown";
        System.out.println(position);
        break;
	}
}

public static void department() {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập ID của department: ");
    String id = scanner.nextLine();

    System.out.println("Nhập tên của department: ");
    String name = scanner.nextLine();
    
    System.out.println("Thông tin department:");
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);

}

public static void question8() {
Scanner scanner = new Scanner(System.in);

System.out.print("Mời bạn nhập vào chức năng muốn sử dụng (1: Tạo account, 2: Tạo department: ");
int positionCode = scanner.nextInt();
scanner.nextLine();
String position;
switch(positionCode) {
    case 1:
        account();
        break;
    case 2:
       department();
       break;
    default:
        System.out.println("Mời bạn nhập lại!");
        question8();  
        break;
	}
}
}

