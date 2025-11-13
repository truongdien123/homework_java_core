import java.util.Scanner;

public class Student {
    String ten;
    String maSinhVien;
    double diemLyThuyet;
    double diemThucHanh;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien");
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap ma sinh vien:");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap diem ly thuyet:");
        diemLyThuyet = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh:");
        diemThucHanh = sc.nextDouble();
    }

    public void hienThiKetQua() {
        if (diemLyThuyet < 4) {
            System.out.println("Thi lai ly thuyet");
            return;
        } else if (diemThucHanh < 4) {
            System.out.println("Thi lai thuc hanh");
            return;
        }
        double diemTrungBinh = (diemLyThuyet + diemThucHanh)/2;
        if (diemTrungBinh < 4) {
            System.out.println("Sinh vien phai hoc lai");
        } else if (diemTrungBinh >= 4 && diemTrungBinh <= 7) {
            System.out.println("Sinh vien dat mon Java");
        } else {
            System.out.println("Sinh vien xuat sac mon Java");
        }
    }
}
