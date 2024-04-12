package backend;

import java.util.Scanner;

public class Person {
	private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + dateOfBirth);
        System.out.println("Địa chỉ: " + address);
    }
}