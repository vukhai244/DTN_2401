package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.ITuyenSinh;
import backend.TuyenSinh;
import backend.News;
import backend.ThiSinh;


public class ProgamTuyenSinh {
	
	
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		TuyenSinh ts = new TuyenSinh();
		Menu();
		while(true) {
			System.out.println("Mời bạn chọn chức năng tương ứng từ 1 đến 5");
			int choice = 0;
			choice = ScannerUtils.inputInt();
			switch(choice) {
			case 1:		
				ts.ThemMoiThiSinh();
                break;
			case 2:
				ts.ThongTinThiSinh();
				break;
			case 3:
				ts.TimKiemSBD();;
				break;
			case 4:
				ts.Xoa();
				break;
			case 5:
				ScannerUtils.closeProgram();
			case 6:
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



	
	public static void Menu() {
		System.out.println("========Menu========");
		System.out.println("1. Thêm mới thi sinh");
		System.out.println("2. Thông tin thí sinh");
		System.out.println("3. Tìm kiếm theo số báo danh");
		System.out.println("4. Xóa theo số báo danh");
		System.out.println("5. Exit");
		System.out.println("6: Help");
		System.out.println("==============================");
	}
}
