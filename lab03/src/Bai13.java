import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so n:");
        int n = sc.nextInt();
        phanTich(n);
    }

    public static void phanTich(int n) {
        int temp = n;
        boolean firstFactor = true;

        int count = 0;
        while (temp % 2 == 0) {
            count++;
            temp /= 2;
        }
        if (count > 0) {
            inThuaSo(2, count);
            firstFactor = false;
        }
        for (int i = 3; i * i <= temp; i+=2) {
            count = 0;
            while (temp % i == 0) {
                count++;
                temp /= i;
            }
            if (count > 0) {
                if (!firstFactor) {
                    System.out.print("*");
                }
                inThuaSo(i, count);
                firstFactor = false;
            }
        }
        if (temp > 1) {
            if (!firstFactor) {
                System.out.print("*");
            }
            inThuaSo(temp, 1);
        }
        System.out.println();
    }

    private static void inThuaSo(int base, int exponent) {
        if (exponent == 1) {
            System.out.print(base);
        } else {
            System.out.print(base+"^"+exponent);
        }
    }
}
