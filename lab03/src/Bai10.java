import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
            System.out.println("Day la so hoan hao");
        } else {
            System.out.println("Day khong phai la so hoan hao");
        }
    }
}
