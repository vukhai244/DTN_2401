package backend;

import java.util.Scanner;

public class StudentQ2 extends Person {
	    private String studentID;
	    private double averageScore;
	    private String email;

	    public StudentQ2() {
	    }

	    public StudentQ2(String name, String gender, String dateOfBirth, String address, String studentID, double averageScore, String email) {
	        super(name, gender, dateOfBirth, address);
	        this.studentID = studentID;
	        this.averageScore = averageScore;
	        this.email = email;
	    }

	    public String getStudentID() {
	        return studentID;
	    }

	    public void setStudentID(String studentID) {
	        this.studentID = studentID;
	    }

	    public double getAverageScore() {
	        return averageScore;
	    }

	    public void setAverageScore(double averageScore) {
	        this.averageScore = averageScore;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public void inputInfo() {
	        super.inputInfo();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập mã sinh viên: ");
	        this.studentID = scanner.nextLine();
	        System.out.print("Nhập điểm trung bình: ");
	        this.averageScore = scanner.nextDouble();
	        scanner.nextLine(); // Clear the buffer
	        System.out.print("Nhập email: ");
	        this.email = scanner.nextLine();
	    }

	    @Override
	    public void showInfo() {
	        super.showInfo();
	        System.out.println("Mã sinh viên: " + studentID);
	        System.out.println("Điểm trung bình: " + averageScore);
	        System.out.println("Email: " + email);
	    }

	    public boolean hasScholarship() {
	        return averageScore >= 8.0;
	    }
	}
