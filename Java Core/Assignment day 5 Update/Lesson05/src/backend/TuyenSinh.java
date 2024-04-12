package backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh extends ThiSinh implements ITuyenSinh {
	
	public Scanner scanner = new Scanner(System.in);
	public static List<TuyenSinh> lstNew =  new ArrayList<TuyenSinh>();
	
	private String khoiThi;
	private String[] khoiA = {"Toán", "Lý", "Hóa"};
	private String[] khoiB = {"Toán", "Hóa", "Sinh"};
	private String[] khoiC = {"Văn", "Sử", "Địa"};
	
	public TuyenSinh (){
		super();
		
	}
	
	
	public TuyenSinh (String soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoiThi ) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		this.khoiThi = khoiThi;
	}

	 public String[] getMonThi(String khoiThi) {
	        if (khoiThi.equals("A")) {
	            return khoiA;
	        } else if (khoiThi.equals("B")) {
	            return khoiB;
	        }
	        return khoiC;	
	    }
	
	 @Override
	    public String toString() {
	        return "Số báo danh: " + super.getSoBaoDanh()  + ", Họ tên: " + super.getHoTen() + ", Địa chỉ: " + super.getDiaChi() + ", Mức ưu tiên: " + super.getMucUutien();
	    }

	@Override
	public void ThemMoiThiSinh() {
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
        TuyenSinh khoiThi = new TuyenSinh(soBaoDanh, hoTen, diaChi, mucUutien, kT);
        lstNew.add(khoiThi);
        System.out.println("Nhập thành công!");
		
	}

	@Override
	public void ThongTinThiSinh() {
		// TODO Auto-generated method stub
		if(lstNew.isEmpty()) {
			System.out.println("Chưa có dữ liệu để hiển thị!");
		}
		System.out.println("Danh sách thi sinh: ");
		for(TuyenSinh khoiThi : lstNew) {
		System.out.println("SoBaoDanh: " + khoiThi.getSoBaoDanh());
        System.out.println("HoTen: " + khoiThi.getHoTen());
        System.out.println("DiaChi: " + khoiThi.getDiaChi());
        System.out.println("MucUutien: " + khoiThi.getMucUutien());
        String[] monThi = getMonThi(khoiThi.khoiThi);
        System.out.println("Môn thi: " + Arrays.toString(monThi));	
		 }
	}

	@Override
	public void TimKiemSBD() {
		// TODO Auto-generated method stub
		System.out.print("Nhập số báo danh: ");
        String soBaoDanh = scanner.nextLine();
        boolean found = false;
        for(TuyenSinh khoiThi : lstNew) {
		if (khoiThi.getSoBaoDanh().equals(soBaoDanh)) {
            System.out.println("Thông tin thí sinh có số báo danh " + soBaoDanh + ":");
            System.out.println(khoiThi);
            found = true;
		}
            if (!found) {
                System.out.println("Không tìm thấy thí sinh có số báo danh " + soBaoDanh);
            }
        }
  }
	
	@Override
	public void Xoa() {
		// TODO Auto-generated method stub
		boolean found = false;
		System.out.print("Nhập số báo danh: ");
        String soBaoDanh1 = scanner.nextLine();
		for (int i = 0; i < lstNew.size(); i++) {
	        TuyenSinh khoiThi = lstNew.get(i);
	        if (khoiThi.getSoBaoDanh().equals(soBaoDanh1)) {
	            System.out.println("Thông tin thí sinh có số báo danh " + soBaoDanh1 + ":");
	            System.out.println(khoiThi); // Print the information of the found candidate
	            lstNew.remove(i); // Remove the candidate at index i
	            found = true;
	            System.out.println("Đã xóa thành công!");
	            break; // Break the loop once the candidate is found and deleted
	        }
	    }
	    if (!found) {
	        System.out.println("Không tìm thấy thí sinh có số báo danh " + soBaoDanh1);
	    }
}
		

	@Override
	public void Thoát() {
		// TODO Auto-generated method stub
		
	}	
}

