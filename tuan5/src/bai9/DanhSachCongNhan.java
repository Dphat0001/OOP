package bai9;

public class DanhSachCongNhan {
    private CongNhan[] dscn;
    private int count;

    public DanhSachCongNhan(int n){
        this.dscn = new CongNhan[n];
        this.count = 0;
    }

    public boolean themCN(CongNhan cn){
        if (cn == null || count >= dscn.length){
            return false;
        }
        dscn[count] = cn;
        count ++;
        return true;
    }

    public void inDSCN(){
        if (count == 0){
            System.out.println("Danh sách công nhân hiện đang trống!");
            return;
        } else {
            System.out.println("Danh Sách Công Nhân: ");
            for (int i = 0; i < count; i++) {
                System.out.println(dscn[i].toString());
            }
        }
    }

    public int tinhSLCN(){
        return count;
    }

    public void xuatTren200(){
        boolean coCongNhan = false;

        System.out.println("--- CÔNG NHÂN LÀM TRÊN 200 SẢN PHẨM ---");
        for (int i = 0; i < count; i++){
            if (dscn[i].getmSoSP() > 200){
                System.out.println(dscn[i].toString());
                coCongNhan = true;
            }
        }
        if (!coCongNhan){
            System.out.println("Không có công nhân nào làm trên 200 sản phẩm.");
        }
    }

    public void sapXepGiamDanTheoSoSP(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (dscn[i].getmSoSP() < dscn[j].getmSoSP()){
                    CongNhan temp = dscn[i];
                    dscn[i] = dscn[j];
                    dscn[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách công nhân giảm dần theo số sản phẩm.");
    }
}