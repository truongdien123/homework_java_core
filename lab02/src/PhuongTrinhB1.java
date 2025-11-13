import java.util.Scanner;

public class PhuongTrinhB1 {
    int soA, soB, soC;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so a:");
            soA = sc.nextInt();
            if (soA == 0) {
                System.out.println("Vui long nhap lai so a (a khac 0):");
            }
        } while (soA == 0);
        System.out.println("Nhap vao so b:");
        soB = sc.nextInt();
        System.out.println("Nhap vao so c:");
        soC = sc.nextInt();
    }

    public void giaiPhuongTrinhB1() {
        double nghiem = (double) ((soC-soB)/soA);
        System.out.println("Nghiem cua phuong trinh bac nhat: "+nghiem);
    }
}
