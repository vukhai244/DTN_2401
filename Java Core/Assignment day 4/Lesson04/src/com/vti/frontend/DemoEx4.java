package com.vti.frontend;

import com.vti.entity.Student;

public class DemoEx4 {
	public static void main(String[] args) {
        Student student = new Student("Khai", "HD");

        System.out.println("Thông tin sinh viên ban đầu:");
        student.displayInfo();

        student.setPoint(7.5);
        System.out.println("\nThông tin sinh viên sau khi đặt điểm:");
        student.displayInfo();

        student.addPoint(1.5);
        System.out.println("\nThông tin sinh viên sau khi cộng điểm:");
        student.displayInfo();
    }
}
