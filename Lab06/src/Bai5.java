import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cac so nguyen cho mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        findPrimeNum(arr);
    }

    static void findPrimeNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                printPrimeNum(arr[i]);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimeNum(int num) {
        System.out.print(num+" ");
    }
}
