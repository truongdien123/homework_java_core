import java.util.Scanner;

public class HoKhau extends NhanKhau{
    private String diaChi;
    private String noiCongTac;

    public HoKhau() {
    }

    public HoKhau(String diaChi, String noiCongTac) {
        this.diaChi = diaChi;
        this.noiCongTac = noiCongTac;
    }

    public HoKhau(String hoTen, String ngaySinh, boolean gioiTinh, String diaChi, String noiCongTac) {
        super(hoTen, ngaySinh, gioiTinh);
        this.diaChi = diaChi;
        this.noiCongTac = noiCongTac;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia chi thuong tru");
        diaChi = sc.nextLine();
        System.out.println("Nhap noi cong tac");
        noiCongTac = sc.nextLine();
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println("HoKhau{" +
                "diaChi='" + diaChi + '\'' +
                ", noiCongTac='" + noiCongTac + '\'' +
                '}');
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }
}
