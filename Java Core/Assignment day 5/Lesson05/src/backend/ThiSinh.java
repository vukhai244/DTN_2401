package backend;

public class ThiSinh {
	private String soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUutien;
	
	public ThiSinh (String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUutien = mucUuTien;
	}

	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getMucUutien() {
		return mucUutien;
	}

	public void setMucUutien(int mucUutien) {
		this.mucUutien = mucUutien;
	} 
	
}
