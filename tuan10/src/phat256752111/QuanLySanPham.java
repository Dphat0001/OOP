package phat256752111;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLySanPham  {

	private final List<SanPham> dsSP = new ArrayList<>();

	public boolean themSanPham(SanPham sp) {
		if (sp == null || timTheoMa(sp.getMaSP()) != null) {
			
			return false;
		}
		return dsSP.add(sp);
	}

	public boolean xoaSanPham(String maSP) {
		SanPham sp = timTheoMa(maSP);;
		
		if (sp != null) {
			return dsSP.remove(sp);
		}
		return false;
	}

	public SanPham timTheoMa(String maSP) {
		for (SanPham sp : dsSP) {
			if (sp.getMaSP().equalsIgnoreCase(maSP)) {
				return sp;
			}
		}
		return null;
	}

	public boolean suaSoLuongTon(String maSP, int soLuongMoi ) {
		for (int i = 0; i < dsSP.size();i++) {
			if(dsSP.get(i).getMaSP().equalsIgnoreCase(maSP)) {
				dsSP.get(soLuongMoi);
				
				return true;
			}
		}
		return false;
	}
}