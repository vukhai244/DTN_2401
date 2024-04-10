package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.ITuyenSinh;
import backend.KhoiThi;
import backend.News;
import backend.ThiSinh;


public class TuyenSinh {
	
	public static List<KhoiThi> lstNew =  new ArrayList<KhoiThi>();
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Menu();
		while(true) {
			System.out.println("Mời bạn chọn chức năng tương ứng từ 1 đến 5");
			int choice = 0;
			choice = ScannerUtils.inputInt();
			switch(choice) {
			case 1:		
				ThemMoiThiSinh(scanner);
                break;
			case 2:
				ThongTinThiSinh ();
				break;
			case 3:
				TimKiemSBD1(scanner);
				break;
			case 4:
				ScannerUtils.closeProgram();
			case 5:
				Menu();
			default:
				System.out.println("Bạn chỉ được chọn các số từ 1 đến 5");
				break;
			}
		}
	}
//  ThiSinhKhoiA news = new ThiSinhKhoiA("12a", "r", "r", 2);
//  System.out.println("ThiSinhKhoiA: "+news);
//  System.out.println("Monthi: "+ String.join(", ", news.getMonThi()));

	private static KhoiThi ThemMoiThiSinh(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("soBaoDanh: ");
        String soBaoDanh = scanner.nextLine();
        System.out.print("hoTen: ");
        String hoTen = scanner.nextLine();        
        System.out.print("diaChi: ");
        String diaChi = scanner.nextLine();      
        System.out.print("mucUutien: ");
        int mucUutien = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Khối thi: ");
        String kT = scanner.nextLine();
        KhoiThi khoiThi = new KhoiThi(soBaoDanh, hoTen, diaChi, mucUutien, kT);
        lstNew.add(khoiThi);
        System.out.println("Nhập thành công!");
        return khoiThi;
	}
        
	public static void ThongTinThiSinh () {
		if(lstNew.isEmpty()) {
			System.out.println("Chưa có dữ liệu để hiển thị!");
		}
		 System.out.println("Danh sách thi sinh: ");
		 for(KhoiThi khoiThi : lstNew) {
			 khoiThi.ThongTinThiSinh();
		 }
	}
	
	public static void TimKiemSBD1 (Scanner scanner) {
		System.out.print("soBaoDanh: ");
        String soBaoDanh = scanner.nextLine();
        for(KhoiThi khoiThi : lstNew) {
			 khoiThi.TimKiemSBD(soBaoDanh);
		 }
		
}

	
	public static void Menu() {
		System.out.println("========Menu========");
		System.out.println("1. Thêm mới thi sinh");
		System.out.println("2. Thông tin thí sinh");
		System.out.println("3. Tìm kiếm theo số báo danh");
		System.out.println("4. Exit");
		System.out.println("5: Help");
		System.out.println("==============================");
	}
}
