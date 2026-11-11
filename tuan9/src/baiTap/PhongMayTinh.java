package baiTap;

public class PhongMayTinh extends PhongHoc {
	
private int soMayTinh;

	public PhongMayTinh(String maPhong, String nha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, nha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}


	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	
	@Override
    public boolean datChuan() {
        return datChuanChung()
                && soMayTinh > 0
                && dienTich / soMayTinh >= 1.5;
    }
	
	  @Override
	    public void hienThi() {
	        System.out.println(
	            "Ma phong: " + maPhong
	            + ", Nha: " + nha
	            + ", Dien tich: " + dienTich
	            + ", So bong den: " + soBongDen
	            + ", So may tinh: " + soMayTinh
	            + ", Dat chuan: " + (datChuan() ? "Co" : "Khong")
	        );
	    }
}
