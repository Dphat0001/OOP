package hoangDucPhat25675211;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class QuanLyKhachHang implements KhachHangDS {
   private List<KhachHang> ls;

   public QuanLyKhachHang() {
      ls = new ArrayList<>();
   }

   @Override
   public Boolean themKH(KhachHang kh) {
      if (ls.contains(kh)) {
         return false;
      }
      return ls.add(kh);
   }

   @Override
   public Boolean CapNhat(String ma, double gia) {
      for (KhachHang kh : ls) {
         if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
            kh.setDonGia(gia);
            return true;
         }
      }
      return false;
   }

   @Override
   public Boolean XoaMa(String ma) {
      for (int i = 0; i < ls.size(); i++) {
         if (ls.get(i).getMaKhachHang().equalsIgnoreCase(ma)) {
            ls.remove(i);
            return true;
         }
      }
      return false;
   }

   public void sapxep() {
      Collections.sort(ls, new Comparator<KhachHang>() {
         @Override
         public int compare(KhachHang o1, KhachHang o2) {
            return o1.getMaKhachHang().compareToIgnoreCase(o2.getMaKhachHang());
         }
      });
   }

   public void themNhieu(KhachHang... ds) {
      for (KhachHang kh : ds) {
         themKH(kh);
      }
   }

   public void duyet(Consumer<KhachHang> hanhDong) {
      for (KhachHang kh : ls) {
         hanhDong.accept(kh);
      }
   }

   public long dem(Predicate<KhachHang> dieuKien) {
      long dem = 0;
      for (KhachHang kh : ls) {
         if (dieuKien.test(kh)) {
            dem++;
         }
      }
      return dem;
   }
}