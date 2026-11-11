package hoangDucPhat25675211;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang {
   private String doiTuong;
   private double dinhMuc;

   public KhachHangVN() {
   }

   public KhachHangVN(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia, String doiTuong, double dinhMuc) {
      super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
      this.doiTuong = doiTuong;
      this.dinhMuc = dinhMuc;
   }

   public String getDoiTuong() {
      return this.doiTuong;
   }

   public void setDoiTuong(String doiTuong) {
      this.doiTuong = doiTuong;
   }

   public double getDinhMuc() {
      return this.dinhMuc;
   }

   public void setDinhMuc(double dinhMuc) {
      this.dinhMuc = dinhMuc;
   }

   @Override
   public double thanhTien() {
      if (this.soKW <= this.dinhMuc) {
         return this.soKW * this.donGia;
      } else {
         return (this.dinhMuc * this.donGia) + ((this.soKW - this.dinhMuc) * this.donGia * 2.5);
      }
   }
}