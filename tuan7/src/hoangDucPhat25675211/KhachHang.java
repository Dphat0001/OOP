package hoangDucPhat25675211;

import java.time.LocalDate;
import java.util.Objects;

public abstract class KhachHang {
   protected String maKhachHang;
   protected String hoTen;
   protected LocalDate ngayLapHoaDon;
   protected double soKW;
   protected double donGia;

   public KhachHang() {
   }

   public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
      this.maKhachHang = maKhachHang;
      this.hoTen = hoTen;
      this.ngayLapHoaDon = ngayLapHoaDon;
      this.soKW = soKW;
      this.donGia = donGia;
   }

   public String getMaKhachHang() {
      return this.maKhachHang;
   }

   public void setMaKhachHang(String maKhachHang) {
      this.maKhachHang = maKhachHang;
   }

   public String getHoTen() {
      return this.hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public LocalDate getNgayLapHoaDon() {
      return this.ngayLapHoaDon;
   }

   public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
      this.ngayLapHoaDon = ngayLapHoaDon;
   }

   public double getSoKW() {
      return this.soKW;
   }

   public void setSoKW(double soKW) {
      this.soKW = soKW;
   }

   public double getDonGia() {
      return this.donGia;
   }

   public void setDonGia(double donGia) {
      this.donGia = donGia;
   }

   public abstract double thanhTien();

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      KhachHang khachHang = (KhachHang) o;
      return Objects.equals(maKhachHang, khachHang.maKhachHang);
   }

   @Override
   public int hashCode() {
      return Objects.hash(maKhachHang);
   }

   @Override
   public String toString() {
      return String.format("%s | %s | Ngay: %s | TT: %,.0f VND", 
            this.maKhachHang, this.hoTen, this.ngayLapHoaDon, this.thanhTien());
   }
}
