package frontend;

import java.util.ArrayList;
import java.util.List;

import backend.Student;

public class Program {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", 1));
        students.add(new Student(2, "Nguyễn Văn B", 1));
        students.add(new Student(3, "Nguyễn Văn C", 1));
        students.add(new Student(4, "Nguyễn Văn D", 1));
        students.add(new Student(5, "Nguyễn Văn E", 2));
        students.add(new Student(6, "Nguyễn Văn F", 2));
        students.add(new Student(7, "Nguyễn Văn G", 2));
        students.add(new Student(8, "Nguyễn Văn H", 3));
        students.add(new Student(9, "Nguyễn Văn I", 3));
        students.add(new Student(10, "Nguyễn Văn J", 3));

        System.out.println("Danh sách học sinh điểm danh:");
        for (Student student : students) {
            student.diemDanh();
        }

        System.out.println("\nNhóm 1 đang học bài:");
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        // Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("\nNhóm 2 đang dọn vệ sinh:");
        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
    }
}
