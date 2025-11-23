import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giaiThua = 1;
        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                giaiThua *= i;
            }
        }
        System.out.println("Ket qua: "+giaiThua);
    }
}
