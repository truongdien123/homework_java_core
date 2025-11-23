import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (checkPerfectNum(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkPerfectNum(int n) {
        List<Integer> danhSachUoc = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                danhSachUoc.add(i);
            }
        }
        int tong = 0;
        for (Integer i : danhSachUoc) {
            tong += i;
        }
        if (tong == n) {
            return true;
        } else {
            return false;
        }
    }
}
