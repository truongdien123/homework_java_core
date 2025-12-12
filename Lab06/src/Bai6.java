import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cac so nguyen cho mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        findPerfectNum(arr);
    }

    static void findPerfectNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPerFect(arr[i])) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    static boolean isPerFect(int num) {
        int tong = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                tong += i;
            }
        }
        return num == tong;
    }
}
