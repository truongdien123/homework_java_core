import java.util.Arrays;
import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] arrSoHoKhau;

    public int showMenu() {
        System.out.println("==================MENU================");
        System.out.println("1. Khai bao so ho khau");
        System.out.println("2. Danh sach so ho khau");
        System.out.println("3. Tim nguoi");
        System.out.println("4. Vui long nhap tu 1 --> 3");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void khaiBaoSHK() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Khai bao so ho khau]");
        System.err.println("Nhap so ho can khai bao:");
        arrSoHoKhau = new SoHoKhau[sc.nextInt()];
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            System.out.println("Nhap so nhan khau ho thu "+(i+1));
            arrSoHoKhau[i] = new SoHoKhau(sc.nextInt());
            arrSoHoKhau[i].nhapDuLieu();
        }
        System.out.println("Cam on");
    }

    public void danhSachSHK() {
        System.out.println("[Danh sach so ho khau]");
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            arrSoHoKhau[i].hienThiDuLieu();
        }
    }

    public void timNguoi() {
        System.out.println("[Tim nguoi]");
        System.out.println("Nhap ho va ten ban muon tim:");
        Scanner sc = new Scanner(System.in);
        String hoVaTen = sc.nextLine();
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            SoHoKhau soHoKhau = arrSoHoKhau[i];
            for (int j = 0; j < soHoKhau.getArrThanhVien().length; j++) {
                HoKhau hoKhau = soHoKhau.getArrThanhVien()[i];
                if (hoKhau.getHoTen().equalsIgnoreCase(hoVaTen)) {
                    hoKhau.hienThiTT();
                }
            }
        }
    }

    public static void main(String[] args) {
        int chonLua = 0;
        QuanLyHoKhau quanLyHoKhau = new QuanLyHoKhau();
        do {
            chonLua = quanLyHoKhau.showMenu();
            switch (chonLua) {
                case 1:
                    quanLyHoKhau.khaiBaoSHK();
                    break;
                case 2:
                    quanLyHoKhau.danhSachSHK();
                    break;
                case 3:
                    quanLyHoKhau.timNguoi();
                    break;
            }
        } while (chonLua > 0 && chonLua <= 3);
        System.out.println("Chuong trinh ket thuc. Xin chao va hen gap lai!");
    }
}
