import java.util.Scanner;

public class SinhVien {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    double lePhiThi;
    char gioiTinh;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap so lan thi:");
        soLanThi = sc.nextInt();
    }
}
