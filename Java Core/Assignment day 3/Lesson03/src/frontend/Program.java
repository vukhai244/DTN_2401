package frontend;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import backend.ScannerUtils;

public class Program {
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
//		int id = ScannerUtils.inputId("Mời bạn nhập id: ");
//		byte dpId = 1;
//		long dpId2 = dpId;
		
		float luongAccount1 = 5240.5f;
	    float luongAccount2 = 10970.055f;
	    int intLuongAccount1 = (int) luongAccount1;
        System.out.println("Lương của Account 1: " + intLuongAccount1);
        int intLuongAccount2 = (int) luongAccount2;
        System.out.println("Lương của Account 2: " + intLuongAccount2);
        
        //Question 2
        
        Random random = new Random();
        	int randomNumber = random.nextInt(100000);
        	String number = String.format("%05d", randomNumber);
        	System.out.println("Số ngẫu nhiên có 5 chữ số: " + number);
        	
        //Question 3
        	String twoLast = number.substring(number.length() - 2);
        	System.out.println("Hai số cuối: " + twoLast);
        	
        //Question 4
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Nhập số nguyên a: ");
        	int a = scanner.nextInt();
        	System.out.println("Nhập số nguyên b: ");
        	int b = scanner.nextInt();
        	//scanner.close();
        	System.out.println("Thương của a và b là: " + thuong(a,b));
        	
        //EX2: DEFAULT VALUE
        //Question 1
        	
        //EX3: BOXING & UNBOXING
        	//Question1
    		Integer luong = 5000;
            float luongFloat = luong.floatValue();
            System.out.printf("Lương: %.2f\n", luongFloat);
            
            //Question 2
            String ques2 = "1234567";
            int khai1 = Integer.parseInt(ques2);
            System.out.println("Giá trị int: " + khai1);
            
            //Question 3
            Integer ques3 = 1234567;
            int khai2 = ques3.intValue();
            System.out.println("Giá trị int: " + khai2);
        //Ex4: String
            //Question 1
            //Scanner scannerex4 = new Scanner(System.in);
            System.out.print("Nhập chuỗi: ");
            String inputex4 = scanner.nextLine();
  
            String[] array1 = inputex4.split("\\s+");
            int arraylength = array1.length;
       
            System.out.println("Số lượng từ trong chuỗi là: " + arraylength);
            
            //Question 2
            System.out.print("Nhập chuỗi thứ nhất: ");
            String s1 = scanner.nextLine();
            System.out.print("Nhập chuỗi thứ hai: ");
            String s2 = scanner.nextLine();
            String s3 = s1.concat(s2);
            System.out.println("Kết quả sau khi nối s2 vào sau s1 là: " + s3);
            
            //Question 4
            System.out.print("Nhập tên của bạn: ");
            String name = scanner.nextLine();
            for (int i = 0; i < name.length(); i++) {
                char character = name.charAt(i);
                System.out.println("Ký tự thứ " + (i + 1) + " là: " + character);
            }
            
            //Question 5
            System.out.print("Nhập họ của bạn: ");
            String lastName = scanner.nextLine();
            System.out.print("Nhập tên của bạn: ");
            String firstName = scanner.nextLine();
            System.out.println("Họ và tên đầy đủ của bạn là: " + lastName + " " + firstName);
            
            //Question6
            /*System.out.print("Nhập họ và tên đầy đủ của bạn: ");
            String fullName = scanner.nextLine();
            String[] parts = fullName.split(" ");
            String lastName6 = parts[0];
            String middleName = parts[1];
            String firstName6 = parts[2];

            System.out.println("Họ là: " + lastName6);
            System.out.println("Tên đệm là: " + middleName);
            System.out.println("Tên là: " + firstName6);*/
            
            //Question 11
            System.out.print("Nhập chuỗi: ");
            String inputString = scanner.nextLine();
            int count = count(inputString, 'a');
            System.out.println("Số lần xuất hiện của ký tự 'a' trong chuỗi là: " + count);
            
            //EX5: Object’s Method
            //Question 1
            System.out.println(department1.toString());
            
            //Question 2
            Department[] departments = {department1,department2,department3};
            for (Department department : departments) {
                System.out.println(department.toString());
            }
            
            //Question 3
            
            if (departments[0].departmentName.equals("Phòng A")) {
                System.out.println("Phòng ban thứ nhất có tên là Phòng A");
            } else {
                System.out.println("Phòng ban thứ nhất không có tên là Phòng A");
            }
            
            //Question 4
            
            if (departments[0].departmentName.equals(departments[1].departmentName)) {
                System.out.println("Phòng ban thứ nhất và phòng ban 2 bằng nhau");
            } else {
                System.out.println("Phòng ban thứ nhất và phòng ban 2 không bằng nhau");
            }
            
            //Question 6
            
            String[] departments7 = {
                    "Accounting",
                    "Boss of director",
                    "Marketing",
                    "Waiting room",
                    "Sale"
                };
                Arrays.sort(departments);
                System.out.println("Danh sách phòng ban sau khi sắp xếp:");
                for (String department7 : departments7) {
                    System.out.println(department7);
                }
            
            
	}   
		public static float thuong(int a, int b) {
			 if (b == 0) {
		            System.out.println("Lỗi: Không thể chia cho 0.");
		            return 0;
		        } else {
		            return (float) a / b;
			}
	
		}
		
		 public static int count(String str, char ch) {
		        int count = 0;
		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) == ch) {
		                count++;
		            }
		        }
		        return count;
		    }
		
		
}

