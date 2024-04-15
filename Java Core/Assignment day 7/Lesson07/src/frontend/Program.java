package frontend;

public class Program {
	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[10]);
		} catch(Exception e){
			System.out.println("Mảng có 3 phần tử");
		}
		
		System.out.println("Kết thúc");
	}
}
