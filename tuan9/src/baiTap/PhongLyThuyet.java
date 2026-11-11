package baiTap;

public class PhongLyThuyet extends PhongHoc{


	private boolean coMayChieu;

	public PhongLyThuyet(String maPhong, String nha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, nha, dienTich, soBongDen );
		this.coMayChieu = coMayChieu;
	}
	
	
	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	
	@Override
	public boolean datChuan() {
	    return datChuanChung() && coMayChieu;
	}
	    
	@Override
	public void hienThi() {
	    System.out.println(
	        "Ma phong: " + maPhong
	        + ", Nha: " + nha
	        + ", Dien tich: " + dienTich
	        + ", So bong den: " + soBongDen
	        + ", May chieu: " + (coMayChieu ? "Co" : "Khong")
	        + ", Dat chuan: " + (datChuan() ? "Co" : "Khong")
	    );
	}
	    
}
