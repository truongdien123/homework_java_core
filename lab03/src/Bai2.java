import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong: "+tong);
    }
}
