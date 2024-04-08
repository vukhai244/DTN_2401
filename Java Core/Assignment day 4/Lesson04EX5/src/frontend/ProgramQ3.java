package frontend;

import backend.HighSchoolStudent;

public class ProgramQ3 {
	public static void main(String[] args) {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");

        // In thông tin của highSchoolStudent
        System.out.println("Thông tin của highSchoolStudent:");
        System.out.println("ID: " + highSchoolStudent.id);
        System.out.println("Name: " + highSchoolStudent.name);
        System.out.println("Clazz: " + highSchoolStudent.getClazz());
        System.out.println("Desired University: " + highSchoolStudent.getDesiredUniversity());
    }
}
