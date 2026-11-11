package baiTap;


public class PhongThiNghiem extends PhongHoc {
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String nha,
                          double dienTich, int soBongDen,
                          boolean coBonRua) {
        super(maPhong, nha, dienTich, soBongDen);
        this.coBonRua = coBonRua;
    }

    @Override
    public boolean datChuan() {
        return datChuanChung() && coBonRua;
    }

    @Override
    public void hienThi() {
        System.out.println(
            "Phong thi nghiem: " + maPhong
            + " | Nha: " + nha
            + " | Dien tich: " + dienTich
            + " | Bong den: " + soBongDen
            + " | Bon rua: " + (coBonRua ? "Co" : "Khong")
            + " | Dat chuan: " + (datChuan() ? "Co" : "Khong")
        );
    }
}
