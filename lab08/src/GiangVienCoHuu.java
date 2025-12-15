import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private double luongThoaThuan;
    private int gioQuyDinh;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(double luongThoaThuan, int gioQuyDinh) {
        this.luongThoaThuan = luongThoaThuan;
        this.gioQuyDinh = gioQuyDinh;
    }

    public GiangVienCoHuu(String tenGiangVien, String email, String diaChi, String dienThoai, int soGioGiangDay, double luongThoaThuan, int gioQuyDinh) {
        super(tenGiangVien, email, diaChi, dienThoai, soGioGiangDay);
        this.luongThoaThuan = luongThoaThuan;
        this.gioQuyDinh = gioQuyDinh;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(double luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public int getGioQuyDinh() {
        return gioQuyDinh;
    }

    public void setGioQuyDinh(int gioQuyDinh) {
        this.gioQuyDinh = gioQuyDinh;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong thoa thuan cua giang vien:");
        luongThoaThuan = sc.nextDouble();
        System.out.println("Nhap gio quy dinh cua giang vien:");
        gioQuyDinh = sc.nextInt();
        sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Luong thoa thuan cua giang vien: "+luongThoaThuan);
        System.out.println("Gio Quy Dinh cua giang vien: "+gioQuyDinh);
    }

    public double tinhLuong() {
        double luong = 0;
        if (gioQuyDinh > 40) {
            luong = luongThoaThuan * gioQuyDinh + (200000*(gioQuyDinh - 40));
        } else {
            luong = luongThoaThuan * gioQuyDinh;
        }
        return luong;
    }
}
