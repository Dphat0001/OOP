package phat256752111;

import java.time.LocalDate;
	
public class SanPhamThucPham extends SanPham {
	
	public LocalDate ngayHetHan;


	public SanPhamThucPham(String maSP, String tenSanPham, LocalDate ngaySanXuat, double giaNhap,
			int soLuongTonKho, LocalDate ngayHetHan) {
		super(maSP, tenSanPham, ngaySanXuat, giaNhap, soLuongTonKho);
		this.ngayHetHan = ngayHetHan;
	}
	
		public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public double congThucThucPham() {
		if( ngayHetHan.isBefore(LocalDate.now())) {
		return 0;
		}
		return (giaNhap + (giaNhap * 0.05));
	}
	
	@Override
	public String toString() {
		return "SanPhamThucPham [ngayHetHan=" + ngayHetHan + "]";
	}
}
