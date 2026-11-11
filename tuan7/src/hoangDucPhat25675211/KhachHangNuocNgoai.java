package hoangDucPhat25675211;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang {
   private String quocTinh;

   public KhachHangNuocNgoai() {
   }

   public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia, String quocTinh) {
      super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
      this.quocTinh = quocTinh;
   }

   public String getQuocTinh() {
      return this.quocTinh;
   }

   public void setQuocTinh(String quocTinh) {
      this.quocTinh = quocTinh;
   }

   @Override
   public double thanhTien() {
      return this.getDonGia() * this.getSoKW();
   }
}