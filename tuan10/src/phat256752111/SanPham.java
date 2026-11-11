package phat256752111;

import java.time.LocalDate;

public abstract class SanPham {
	protected String tenSanPham;
	protected LocalDate ngaySanXuat;
	protected double giaNhap;
	protected int soLuongTonKho;
	protected String maSP;
		
	public SanPham(String maSP, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTonKho) {
		super();
		this.maSP = maSP;
		this.tenSanPham = tenSanPham;
		this.ngaySanXuat = ngaySanXuat;
		this.giaNhap = giaNhap;
		this.soLuongTonKho = soLuongTonKho;
	}
	
	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(int soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	@Override
	public String toString() {
		return "SanPham [tenSanPham=" + tenSanPham + ", ngaySanXuat=" + ngaySanXuat + ", giaNhap=" + giaNhap
				+ ", soLuongTonKho=" + soLuongTonKho + ", maSP=" + maSP + "]";
	}
	
}