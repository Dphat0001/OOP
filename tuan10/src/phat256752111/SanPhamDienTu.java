package phat256752111;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private int thoiGianBaoHanh;
	public double giaBan;
	
	public SanPhamDienTu(String maSP, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTonKho,
			int thoiGianBaoHanh, double giaBan) {
		super(maSP, tenSanPham, ngaySanXuat, giaNhap, soLuongTonKho);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.giaBan = giaBan;
	}
	
		public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
		public double getGiaBan() {
		return giaBan;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	
	public double congThucDienTu() {
	return (giaNhap + (giaNhap * 0.1) + (thoiGianBaoHanh * 50000));
	}
	
	@Override
	public String toString() {
		return "SanPhamDienTu [thoiGianBaoHanh=" + thoiGianBaoHanh + ", giaBan=" + giaBan + "]";
	}
}
