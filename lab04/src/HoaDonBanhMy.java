public class HoaDonBanhMy {
    String maHoaDon;
    String ngayLapHoaDon;
    String tenKhachHang;
    String diaChiKhach;
    int soLuongBanh;
    double giaBan;
    double tongTienHang;
    double tienKhuyenMai;
    double tongTien;

    public void tinhTienKmai(int soLuongBanh) {
        if (soLuongBanh >= 100) {
            tienKhuyenMai = tongTienHang * 0.2;
        } else if (soLuongBanh >= 10) {
            tienKhuyenMai = giaBan * 0.1;
        }
    }
}
