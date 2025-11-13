import java.util.Scanner;

public class XeMay {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin xe may");
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap thong tin nha san xuat:");
        nhaSanXuat = sc.nextLine();
        System.out.println("Nhap so luong banh xe:");
        soLuongBanhXe = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Thong tin cua xe may");
        System.out.println("Ten cua xe may: "+ten);
        System.out.println("Nha san xuat cua xe may: "+nhaSanXuat);
        System.out.println("So luong banh xe: "+soLuongBanhXe);
    }
}
