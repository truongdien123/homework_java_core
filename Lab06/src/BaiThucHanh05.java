public class BaiThucHanh05 {
    void yeuCau1() {
        String vietnam = "Viet Nam";
        System.out.println("concat() = "+vietnam.concat(" Cong hoa XHCN"));
    }

    void yeuCau2() {
        String baoViet = "Tong Cty Bao hiem Bao Viet (Bao hiem Bao Viet - Baoviet"+" Insurance) la Cty thanh vien duoc Tap doan Tai chinh - Bao hiem"+" Bao Viet dau tu 100 von.";
        System.out.println("length() = "+baoViet.length());
        baoViet = baoViet.replaceAll("Cty", "Cong Ty");
        System.out.println("replaceAll() = "+baoViet);
    }

    void yeuCau3() {
        String baoViet = "Tong Cty Bao hiem Bao Viet (Bao hiem Bao Viet - Baoviet "+"Insurance) la Cty thanh vien duoc Tap doan Tai chinh - Bao hiem"+" Bao Viet dau tu 100 von";
        System.out.println("toUpperCase() = "+baoViet.toUpperCase());
        System.out.println("toLowerCase() = "+baoViet.toLowerCase());
    }

    void yeuCau4() {
        String baoViet = "Tong Cty Bao hiem Bao Viet (Bao hiem Bao Viet - Baoviet "+"Insurance) la Cty thanh vien duoc Tap doan Tai chinh - Bao hiem"+" Bao Viet dau tu 100 von";
        System.out.println("lastIndexOf() = "+baoViet.lastIndexOf("Bao Viet"));
    }

    void yeuCau5() {
        String baoViet = "Tong Cty Bao hiem Bao Viet (Bao hiem Bao Viet - Baoviet "+"Insurance) la Cty thanh vien duoc Tap doan Tai chinh - Bao hiem"+" Bao Viet dau tu 100 von";
        String[] arrBaoViet = baoViet.split(" ");
        for (int i = 0; i < arrBaoViet.length; i++) {
            String arrBaoViet1 = arrBaoViet[i];
            if ((i%2) == 0) {
                System.out.println("\t"+arrBaoViet1);
            } else {
                System.out.println(arrBaoViet1);
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh05 bth5 = new BaiThucHanh05();
        bth5.yeuCau1();
        bth5.yeuCau2();
        bth5.yeuCau3();
        bth5.yeuCau4();
        bth5.yeuCau5();
    }
}
