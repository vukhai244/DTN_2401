package backend;

import java.util.Arrays;

public class KhoiThi extends ThiSinh implements ITuyenSinh {
	private String khoiThi;
	private String[] khoiA = {"Toán", "Lý", "Hóa"};
	private String[] khoiB = {"Toán", "Hóa", "Sinh"};
	private String[] khoiC = {"Văn", "Sử", "Địa"};
	
	public KhoiThi (String soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoiThi ) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		this.khoiThi = khoiThi;
//		if (khoiThi.equals("A")) {
//            this.khoiA = khoiA;
//        } else if (khoiThi.equals("B")) {
//            this.khoiB = khoiB;
//        } else if (khoiThi.equals("C")) {
//            this.khoiC = khoiC;
//        }
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
		
	}

	@Override
	public void ThongTinThiSinh() {
		// TODO Auto-generated method stub
		System.out.println("SoBaoDanh: " + super.getSoBaoDanh());
        System.out.println("HoTen: " + super.getHoTen());
        System.out.println("DiaChi: " + super.getDiaChi());
        System.out.println("MucUutien: " + super.getMucUutien());
        String[] monThi = getMonThi(khoiThi);
        System.out.println("Môn thi: " + Arrays.toString(monThi));	
		
	}

	@Override
	public void TimKiemSBD(String soBaoDanh) {
		// TODO Auto-generated method stub
		boolean found = false;
		if (super.getSoBaoDanh().equals(soBaoDanh)) {
            System.out.println("Thông tin thí sinh có số báo danh " + soBaoDanh + ":");
            ThongTinThiSinh();
            found = true;
		}
            if (!found) {
                System.out.println("Không tìm thấy thí sinh có số báo danh " + soBaoDanh);
            }
        }
		

	@Override
	public void Thoát() {
		// TODO Auto-generated method stub
		
	}	
}

