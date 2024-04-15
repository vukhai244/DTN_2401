package frontend;

import java.util.Scanner;

public class Programq5 {
	public static int inputAge() {
		Scanner scanner = new Scanner(System.in);	
		while(true) {
		try {
			System.out.println("Nhập tuổi của bạn: ");
			String input = scanner.nextLine();
			int age = Integer.parseInt(input);
			if(age<0) {
				System.out.println("Wrong inputing! The age must be greater than 0, please input again");
			} else { 
				return age;
				}
		} catch (NumberFormatException e) {
			System.out.println("Wrong inputing! Please input an age as int, input again");
		}
	}
}
	public static void main(String[] args) {
        int age = inputAge();
        System.out.println("Tuổi của bạn là: " + age);
    }
}
