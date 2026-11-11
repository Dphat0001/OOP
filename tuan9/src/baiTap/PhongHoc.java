package baiTap;

public abstract class PhongHoc {
	
	protected String maPhong;
    protected String nha;
    protected double dienTich;
    protected int soBongDen;
    
	public PhongHoc(String maPhong, String nha, double dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.nha = nha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

    public String getMaPhong() {
		return maPhong;
	}
	public String getNha() {
		return nha;
	}
	public double getDienTich() {
		return dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}
	
	 public boolean datChuanChung() {
	       return dienTich >= 20
	               && soBongDen > 0
	               && dienTich / soBongDen >= 1.5;
	    }

	    public abstract boolean datChuan();

	    public abstract void hienThi();
}