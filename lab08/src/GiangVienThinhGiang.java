import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien{
    private String coQuanLamViec;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }

    public GiangVienThinhGiang(String tenGiangVien, String email, String diaChi, String dienThoai, int soGioGiangDay, String coQuanLamViec) {
        super(tenGiangVien, email, diaChi, dienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    public void setCoQuanLamViec(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co quan lam viec cua giang vien:");
        coQuanLamViec = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Co quan lam viec cua giang vien: "+coQuanLamViec);
    }
}
