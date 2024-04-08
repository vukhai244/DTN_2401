package backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class QuanLyCB {
	private List<CanBo> danhSachCanBo;

    public QuanLyCB() {
        danhSachCanBo = new ArrayList<>();
    }

    // Phương thức thêm mới cán bộ
    public void themMoiCanBo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        System.out.print("Nhập họ tên: ");
        scanner.nextLine(); 
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhập giới tính: ");
        scanner.nextLine(); 
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập bậc: ");
                int bac = scanner.nextInt();
                CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                themMoiCanBo(congNhan);
                break;
            case 2:
                System.out.print("Nhập ngành đào tạo: ");
                scanner.nextLine(); 
                String nganhDaoTao = scanner.nextLine();
                KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                themMoiCanBo(kySu);
                break;
            case 3:
                System.out.print("Nhập công việc: ");
                scanner.nextLine();
                String congViec = scanner.nextLine();
                NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                themMoiCanBo(nhanVien);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
        System.out.println("Đã thêm mới cán bộ: " + canBo.getHoTen());
    }

    // Phương thức tìm kiếm theo họ tên
    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equals(hoTen)) {
                System.out.println("Thông tin cán bộ:");
                System.out.println("Họ tên: " + canBo.getHoTen());
                System.out.println("Tuổi: " + canBo.getTuoi());
                System.out.println("Giới tính: " + canBo.getGioiTinh());
                System.out.println("Địa chỉ: " + canBo.getDiaChi());

                if (canBo instanceof CongNhan) {
                    System.out.println("Bậc: " + ((CongNhan) canBo).getBac());
                } else if (canBo instanceof KySu) {
                    System.out.println("Ngành đào tạo: " + ((KySu) canBo).getNganhDaoTao());
                } else if (canBo instanceof NhanVien) {
                    System.out.println("Công việc: " + ((NhanVien) canBo).getCongViec());
                }

                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có họ tên: " + hoTen);
    }

    // Phương thức hiển thị thông tin về danh sách các cán bộ
    public void hienThiDanhSachCanBo() {
        System.out.println("Danh sách các cán bộ:");
        for (CanBo canBo : danhSachCanBo) {
            System.out.println(canBo.getHoTen());
        }
    }

    // Phương thức xóa cán bộ theo tên
    public void xoaCanBoTheoTen(String hoTen) {
        Iterator<CanBo> iterator = danhSachCanBo.iterator();
        while (iterator.hasNext()) {
            CanBo canBo = iterator.next();
            if (canBo.getHoTen().equals(hoTen)) {
                iterator.remove();
                System.out.println("Đã xóa cán bộ có họ tên: " + hoTen);
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có họ tên: " + hoTen);
    }

    // Phương thức thoát khỏi chương trình
    public void thoat() {
        System.out.println("Đã thoát khỏi chương trình.");
        System.exit(0);
    }
}