public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] arrNhanVien = new NhanVien[3];

        arrNhanVien[0] = new NhanVien();
        arrNhanVien[0].name = "Nam";
        arrNhanVien[0].cnt++;

        arrNhanVien[1] = new NhanVien();
        arrNhanVien[1].name = "Nhan";
        arrNhanVien[1].cnt++;

        arrNhanVien[2] = new NhanVien();
        arrNhanVien[2].name = "Thuy";
        arrNhanVien[2].cnt++;

        for (NhanVien nv : arrNhanVien) {
            System.out.println(nv.name+" -> CNT "+nv.cnt);
        }
    }
}
