package backend;

public class Account {
	public void inputAge(int age) throws InvalidAgeInputingException   {
		if(age<0) {
			throw new InvalidAgeInputingException ("The age must be greater than 0");
		} else {
			System.out.println("Tuổi của bạn là: "+ age);
		}
	}
}
