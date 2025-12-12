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

    public void 
}
