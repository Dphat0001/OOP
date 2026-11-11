package baiTap;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLyPhongHoc {
    private ArrayList<PhongHoc> ds = new ArrayList<>();

    public boolean themPhong(PhongHoc p) {
        for (PhongHoc x : ds) {
            if (x.getMaPhong().equalsIgnoreCase(p.getMaPhong())) {
                System.out.println("Ma phong da ton tai!");
                return false;
            }
        }
        ds.add(p);
        return true;
    }

    public void hienThiDanhSach() {
        for (PhongHoc p : ds) {
            p.hienThi();
        }
    }

    public PhongHoc timPhong(String ma) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(ma)) {
                return p;
            }
        }
        return null;
    }

    public void sapXepTheoNha() {
        ds.sort(Comparator.comparing(PhongHoc::getNha));
    }

    public void sapXepTheoDienTich() {
        ds.sort(Comparator.comparingDouble(PhongHoc::getDienTich));
    }

    public void sapXepTheoSoBongDen() {
        ds.sort(Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    public boolean capNhatSoMayTinh(String ma, int soMay) {
        PhongHoc p = timPhong(ma);

        if (p instanceof PhongMayTinh && soMay > 0) {
            ((PhongMayTinh) p).setSoMayTinh(soMay);
            return true;
        }
        return false;
    }

    public boolean xoaPhong(String ma, boolean xacNhan) {
        PhongHoc p = timPhong(ma);

        if (p != null && xacNhan) {
            ds.remove(p);
            return true;
        }
        return false;
    }

    public double tinhTongDienTich() {
        double tong = 0;
        for (PhongHoc p : ds) {
            tong += p.getDienTich();
        }
        return tong;
    }

    public void lietKePhongMay60May() {
        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh
                    && ((PhongMayTinh) p).getSoMayTinh() == 60) {
                p.hienThi();
            }
        }
    }
}
