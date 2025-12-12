import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhap so phan tu cac so nguyen cho mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
