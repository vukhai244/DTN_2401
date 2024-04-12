package backend;

public class HinhVuong extends HinhChuNhat{

	public HinhVuong(double canh) {
		super(canh, canh);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double ChuVi() {
		System.out.println("Tính chu vi theo hình vuông");
		return super.ChuVi();
	}
	
	@Override
	public double DienTich() {
		System.out.println("Tính diện tích theo hình vuông");
		return super.DienTich();
	}

}
