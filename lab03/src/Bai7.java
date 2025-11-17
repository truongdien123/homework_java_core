import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri n (n > 0):");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                tong += i;
            }
        }
        System.out.println("Tong: "+tong);
        int tongBinhPhuong = (int) Math.pow(tong,2);
        System.out.println("Tong binh phuong: "+tongBinhPhuong);
        double trungBinhCong = 0;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += i;
        }
        trungBinhCong = (double) temp / n;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i > trungBinhCong) {
                System.out.println(i);
            }
        }
    }
}
