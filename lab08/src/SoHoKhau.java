import java.util.ArrayList;
import java.util.List;

public class SoHoKhau {
    private int soNhanKhau;
    private HoKhau[] arrThanhVien;

    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        arrThanhVien = new HoKhau[soNhanKhau];
    }

    public void nhapDuLieu() {
        for (int i = 0; i < arrThanhVien.length; i++) {
            arrThanhVien[i] = new HoKhau();
            arrThanhVien[i].nhapThongTin();
        }
    }

    public void hienThiDuLieu() {
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("Nhap TT thanh vien thu "+ (i+1));
            HoKhau thanhVien = arrThanhVien[i];
            thanhVien.hienThiTT();
        }
    }

    public int getSoNhanKhau() {
        return soNhanKhau;
    }

    public void setSoNhanKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
    }

    public HoKhau[] getArrThanhVien() {
        return arrThanhVien;
    }

    public void setArrThanhVien(HoKhau[] arrThanhVien) {
        this.arrThanhVien = arrThanhVien;
    }
}
