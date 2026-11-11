package hoangDucPhat25675211;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      QuanLyKhachHang ql = new QuanLyKhachHang();

      KhachHang kh1 = new KhachHangVN("VN01", "Nguyen Van An", LocalDate.of(2026, 9, 10), 150.0, 2000.0, "Sinh hoat", 100.0);
      KhachHang kh2 = new KhachHangVN("VN02", "Tran Thi Binh", LocalDate.of(2026, 9, 15), 80.0, 2000.0, "Kinh doanh", 100.0);
      KhachHang kh3 = new KhachHangNuocNgoai("NN01", "John Smith", LocalDate.of(2026, 9, 20), 200.0, 3000.0, "My");

      ql.themNhieu(kh1, kh2, kh3);

      System.out.println("===== DANH SACH KHACH HANG =====");
      ql.duyet(System.out::println);

      double[] tongTien = {0};
      ql.duyet(kh -> tongTien[0] += kh.thanhTien());

      System.out.printf("%nTong tien tat ca hoa don: %,.0f VND%n", tongTien[0]);
   }
}