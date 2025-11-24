import java.util.Scanner;

public class QuanLyHoaDon {

    public void nhap(HoaDonBanhMy obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hoa don");
        System.out.println("Ma hoa don:");
        obj.maHoaDon = sc.nextLine();
        System.out.println("Ngay lap hoa don:");
        obj.ngayLapHoaDon = sc.nextLine();
        System.out.println("Ten khach hang:");
        obj.tenKhachHang = sc.nextLine();
        System.out.println("Dia chi khach:");
        obj.diaChiKhach = sc.nextLine();
        System.out.println("So luong banh can giao:");
        obj.soLuongBanh = sc.nextInt();
        System.out.println("Gia ban 1 chiec banh:");
        obj.giaBan = sc.nextDouble();
        obj.tongTienHang = obj.giaBan * obj.soLuongBanh;
        obj.tinhTienKmai(obj.soLuongBanh);
        obj.tongTien = obj.tongTienHang - obj.tienKhuyenMai;
        System.out.println("Cam on ban da nhap thong tin hoa don");
    }

    public void in(HoaDonBanhMy obj) {
        System.out.println("HoaDonBanhMy{" +
                "maHoaDon='" + obj.maHoaDon + '\'' +
                ", ngayLapHoaDon='" + obj.ngayLapHoaDon + '\'' +
                ", tenKhachHang='" + obj.tenKhachHang + '\'' +
                ", diaChiKhach='" + obj.diaChiKhach + '\'' +
                ", soLuongBanh=" + obj.soLuongBanh +
                ", giaBan=" + obj.giaBan +
                ", tongTienHang=" + obj.tongTienHang +
                ", tienKhuyenMai=" + obj.tienKhuyenMai +
                ", tongTien=" + obj.tongTien +
                '}');
    }
}
