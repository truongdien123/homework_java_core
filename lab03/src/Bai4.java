import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("N khong phai so nguyen to");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("N la so nguyen to");
            } else {
                System.out.println("N khong phai so nguyen to");
            }
        }
    }
}
