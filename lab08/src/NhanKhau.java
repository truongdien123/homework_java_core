import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;

    public NhanKhau() {
    }

    public NhanKhau(String hoTen, String ngaySinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh (Nam/Nu)");
        String gender = sc.nextLine();
        if (gender.equalsIgnoreCase("nam")) {
                gioiTinh = true;
        } else {
            gioiTinh = false;
        }
    }

    public void hienThiTT() {
        System.out.println("NhanKhau{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}');
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
