package Demo;

import java.time.LocalDate;
import java.util.Random;

public class EX4Randomnumber {
	public static void main (String[] args) {
		//Question1
		Random random = new Random();
        int randomNumber = random.nextInt();
        System.out.println("Số nguyên ngẫu nhiên là: " + randomNumber);
        
        //Question2
        Random random2 = new Random();
        double randomNumber2 = random2.nextDouble();
        System.out.println("Số thực ngẫu nhiên là: " + randomNumber2);
        
        //Question3
        String[] departments = {"Phòng Kế toán", "Phòng Nhân sự", "Phòng Kỹ thuật", "Phòng Marketing", "Phòng Bán hàng"};
        Random random3 = new Random();
        int randomIndex = random3.nextInt(departments.length);
        System.out.println("Tên phòng ban ngẫu nhiên là: " + departments[randomIndex]);
        
        //Question4
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate = LocalDate.of(1995, 12, 20);
        Random random4 = new Random();

        long days = startDate.until(endDate).getDays();
        int randomDays = random.nextInt((int) days + 1);
        LocalDate randomDate = startDate.plusDays(randomDays);
        System.out.println("Ngày ngẫu nhiên trong khoảng từ " + startDate + " đến " + endDate + ": " + randomDate);
        
        //Question5
        LocalDate currentDate = LocalDate.now();
        LocalDate oneYearAgo = currentDate.minusYears(1);
        Random random5 = new Random();
        long days5 = oneYearAgo.until(currentDate).getDays();
        int randomDays5 = random5.nextInt((int) days + 1);
        LocalDate randomDate5 = oneYearAgo.plusDays(randomDays5);
        System.out.println("Ngày ngẫu nhiên trong khoảng một năm trở lại đây: " + randomDate5);
        
        //Question6
        LocalDate currentDate6 = LocalDate.now();
        Random random6 = new Random();
        int randomDays6 = random6.nextInt(365);
        LocalDate randomDate6 = currentDate.minusDays(randomDays6);
        System.out.println("Ngày ngẫu nhiên trong quá khứ: " + randomDate6);
        
        //Question7
        Random random7 = new Random();
        for(int i=100; i<1000; i++) {
        	int randomNumber7 = random.nextInt(1000);
        	if(randomNumber7>=100 && randomNumber7<=999) {
        		System.out.println("Số ngẫu nhiên có 3 chữ số: " + randomNumber7);
        		break;
        	}
        }

        
    }

	}

