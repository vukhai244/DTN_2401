package Demo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX2SYSTEMPRINTF {
	public static void main (String[] args) {
	//EX2: SYSTEM OUT PRINTF
	
			//Question 1
			
			int number1 = 5;
	        System.out.printf("Số nguyên là: %d\n", number1);
	        
	        //Question2
	        int number2 = 100000000;
	        String formattedNumber = String.format("%,d", number2);
	        System.out.println("Số nguyên định dạng: " + formattedNumber);
	        
	        //Question 3
	        double number3 = 5.567098;
	        String formattedNumber3 = String.format("%.4f", number3);
	        System.out.println("Số thực định dạng: " + formattedNumber3);
	        
	        //Question 4
	        String name = "Nguyễn Văn A";
	        System.out.println("Tôi tên là \"" +name +"\" và tôi đang độc thân");
	        
	        //Question 5
	        Date now = new Date();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
	        String formattedDate = formatter.format(now);
	        System.out.println("Thời gian hiện tại: " + formattedDate);
	        

}
	
}