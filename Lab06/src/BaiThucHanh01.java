import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrSinhVien.length; i++) {
            arrSinhVien[i] = sc.nextLine();
        }
        for (String sv : arrSinhVien) {
            System.out.println(sv);
        }
    }
}
