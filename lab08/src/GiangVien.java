import java.util.Scanner;

public class GiangVien {
    private String tenGiangVien;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int soGioGiangDay;

    public GiangVien() {
    }

    public GiangVien(String tenGiangVien, String email, String diaChi, String dienThoai, int soGioGiangDay) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public void setSoGioGiangDay(int soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Nhap thong tin giang vien]");
        System.out.println("Nhap ten giang vien:");
        tenGiangVien = sc.nextLine();
        System.out.println("Nhap email giang vien:");
        email = sc.nextLine();
        System.out.println("Nhap dia chi giang vien:");
        diaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai giang vien:");
        dienThoai = sc.nextLine();
        System.out.println("Nhap so gio giang day cua giang vien:");
        soGioGiangDay = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Ten cua giang vien: "+tenGiangVien);
        System.out.println("Email cua giang vien: "+email);
        System.out.println("Dia chi cua giang vien: "+diaChi);
        System.out.println("So dien thoai cua giang vien: "+dienThoai);
        System.out.println("So gio giang day cua giang vien: "+soGioGiangDay);
    }
}
