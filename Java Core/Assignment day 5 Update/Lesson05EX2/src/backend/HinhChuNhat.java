package backend;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public double ChuVi () {
		System.out.println("Tính chu vi theo hình chữ nhật");
		return (chieuDai + chieuRong)*2;
	}
	
	public double DienTich () {
		System.out.println("Tính diện tích theo hình chữ nhật");
		return chieuDai * chieuRong;
	}
}




