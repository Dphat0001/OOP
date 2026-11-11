
package baiTap;

public class Main {
    public static void main(String[] args) {
        QuanLyPhongHoc ql = new QuanLyPhongHoc();

        // 1. Them cac phong hoc
        System.out.println("===== THEM PHONG HOC =====");

        ql.themPhong(
            new PhongLyThuyet("LT01", "A", 60, 40, true)
        );

        ql.themPhong(
            new PhongLyThuyet("LT02", "B", 45, 30, false)
        );

        ql.themPhong(
            new PhongMayTinh("MT01", "C", 90, 40, 60)
        );

        ql.themPhong(
            new PhongMayTinh("MT02", "A", 60, 40, 30)
        );

        ql.themPhong(
            new PhongThiNghiem("TN01", "B", 50, 30, true)
        );

        // Kiem tra them phong trung ma
        ql.themPhong(
            new PhongLyThuyet("LT01", "D", 40, 25, true)
        );

        // 2. Hien thi danh sach phong
        System.out.println("\n===== DANH SACH PHONG HOC =====");
        ql.hienThiDanhSach();

        // 3. Tim phong theo ma
        System.out.println("\n===== TIM PHONG LT01 =====");
        PhongHoc p = ql.timPhong("LT01");

        if (p != null) {
            p.hienThi();
        } else {
            System.out.println("Khong tim thay phong!");
        }

        // 4. Liet ke phong dat chuan
        System.out.println("\n===== PHONG DAT CHUAN =====");
        for (String ma : new String[]{"LT01", "LT02", "MT01",
                                      "MT02", "TN01"}) {
            p = ql.timPhong(ma);
            if (p != null && p.datChuan()) {
                p.hienThi();
            }
        }

        // 5. Sap xep theo nha
        System.out.println("\n===== SAP XEP THEO NHA =====");
        ql.sapXepTheoNha();
        ql.hienThiDanhSach();

        // 6. Sap xep theo dien tich
        System.out.println("\n===== SAP XEP THEO DIEN TICH =====");
        ql.sapXepTheoDienTich();
        ql.hienThiDanhSach();

        // 7. Sap xep theo so bong den
        System.out.println("\n===== SAP XEP THEO SO BONG DEN =====");
        ql.sapXepTheoSoBongDen();
        ql.hienThiDanhSach();

        // 8. Cap nhat so may tinh
        System.out.println("\n===== CAP NHAT SO MAY TINH =====");
        if (ql.capNhatSoMayTinh("MT01", 40)) {
            System.out.println("Cap nhat thanh cong!");
        } else {
            System.out.println("Cap nhat that bai!");
        }

        // 9. Tinh tong dien tich
        System.out.println("\n===== TONG DIEN TICH =====");
        System.out.println(
            "Tong dien tich: " + ql.tinhTongDienTich() + " m2"
        );

        // 10. Liet ke phong may co 60 may tinh
        System.out.println("\n===== PHONG MAY CO 60 MAY =====");
        ql.lietKePhongMay60May();

        // 11. Xoa phong co xac nhan
        System.out.println("\n===== XOA PHONG LT02 =====");
        if (ql.xoaPhong("LT02", true)) {
            System.out.println("Xoa phong thanh cong!");
        } else {
            System.out.println("Xoa phong that bai!");
        }

        // 12. Hien thi danh sach sau khi xoa
        System.out.println("\n===== DANH SACH SAU KHI XOA =====");
        ql.hienThiDanhSach();
    }
}
