import luatdoanhnghiep.khoinhanuoc.tienluong.TienLuong;

public class NhanVien {
    public static void main(String[] args) {
        int tham_nien_cong_tac = 8;
        double luong = TienLuong.luongCoBan(TienLuong.BAC_CAO_DANG, tham_nien_cong_tac);
        System.out.println("Luong cua nhan vien: "+luong);
        System.out.println("Phi bao hiem: "+TienLuong.soTienBaoHiem(luong));

    }
}
