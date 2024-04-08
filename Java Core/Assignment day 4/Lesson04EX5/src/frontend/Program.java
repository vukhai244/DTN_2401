package frontend;

import java.util.Scanner;

import backend.QuanLyCB;

public class Program {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCB qlcb = new QuanLyCB();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	qlcb.themMoiCanBo();
                    break;
                case 2:
                    // Tìm kiếm theo họ tên
                    System.out.print("Nhập họ tên cần tìm kiếm: ");
                    scanner.nextLine(); // Consume newline character
                    String hoTen = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(hoTen);
                    break;
                case 3:
                    // Hiển thị danh sách cán bộ
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    // Xóa cán bộ theo tên
                    System.out.print("Nhập họ tên cán bộ cần xóa: ");
                    scanner.nextLine(); // Consume newline character
                    String tenCanBo = scanner.nextLine();
                    qlcb.xoaCanBoTheoTen(tenCanBo);
                    break;
                case 5:
                    // Thoát khỏi chương trình
                    qlcb.thoat();
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại.");
            }
        }
    }
}
