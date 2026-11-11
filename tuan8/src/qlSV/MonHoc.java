package qlSV;

public enum MonHoc {
	
	LAP_TRINH_JAVA("Lập trình Java", 450000f),
	CO_SO_DU_LIEU("Cơ sở dữ liệu", 450000f),
	TOAN_ROI_RAC("Toán rời rạc", 400000f),
	MANG_MANG_TINH("Mạng máy tính", 500000f),
	TRI_TUE_NHAN_TAO("Trí tuệ nhân tạo", 600000f),
	KY_THUAT_PHAN_MEM("kỹ thuật phần mềm", 480000f),
	LAP_TRINH_WEB("Lập trình web", 500000f),
	HE_DIEU_HANH("Hệ điều hành", 420000f);
	
	private final String tenMon;
	private final float donGia;
	
	
	private MonHoc(String tenMon, float donGia) {
		this.tenMon = tenMon;
		this.donGia = donGia;
	}

	public String getTenMon() {
		return tenMon;
	}

	public float getDonGia() {
		return donGia;
	}

	public static MonHoc fromTenMon(String tenMon) {
		for (MonHoc mh : values()) 	
			if (mh.tenMon.equalsIgnoreCase(tenMon)) return mh;
		return null;
	}

	@Override
	public String toString() {
		return String.format("%s (%,.0f VNĐ/tín chỉ)", tenMon, donGia);
	}
	
}
