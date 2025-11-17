import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        int a = sc.nextInt();
        System.out.println("Nhap vao so b:");
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("ucln: khong xac dinh hoac bang 0");
            System.out.println("bcnn bang 0");
        } else {
            int ucln = timUcln(a,b);
            int bcnn = timBcnn(a,b);
            System.out.println("Uoc chung lon nhat: "+ucln);
            System.out.println("Boi chung nho nhat: "+bcnn);
        }

    }

    public static int timUcln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int timBcnn(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long tich = (long) a * b;
        return (int) (tich / timUcln(a,b));
    }
}
