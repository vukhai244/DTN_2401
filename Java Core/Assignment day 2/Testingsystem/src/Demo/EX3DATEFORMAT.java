package Demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EX3DATEFORMAT {
	public static void main (String[] args) {
	
	Exam exam1= new Exam();
	exam1.examId=1;
	exam1.code="made1";
	exam1.title= "Thi đầu vào";
	exam1.createDate = new Date("2024/04/01");
	
	//Question1
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String formattedDate = formatter.format(exam1.createDate);
    System.out.println("Thông tin Exam:");
    System.out.println("Exam ID: " + exam1.examId);
    System.out.println("Code: " + exam1.code);
    System.out.println("Title: " + exam1.title);
    System.out.println("Create Date: " + formattedDate);
    
    //Question2
  	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDate2 = formatter2.format(exam1.createDate);
    System.out.println("Thông tin Exam:");
    System.out.println("Exam ID: " + exam1.examId);
    System.out.println("Code: " + exam1.code);
    System.out.println("Title: " + exam1.title);
    System.out.println("Create Date: " + formattedDate2);
    
    //Question3
  	SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy");
    String formattedDate3 = formatter3.format(exam1.createDate);
    System.out.println("Create Date: " + formattedDate3);
    
    //Question4
  	SimpleDateFormat formatter4 = new SimpleDateFormat("MM/yyyy");
    String formattedDate4 = formatter4.format(exam1.createDate);
    System.out.println("Create Date: " + formattedDate4);
    
    //Question5
  	SimpleDateFormat formatter5 = new SimpleDateFormat("MM/dd");
    String formattedDate5 = formatter5.format(exam1.createDate);
    System.out.println("Create Date: " + formattedDate5);
   
	}
}
