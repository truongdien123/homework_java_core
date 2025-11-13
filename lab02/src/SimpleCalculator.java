import java.util.Scanner;

public class SimpleCalculator {

    public void tinhTong() {
        int soA, soB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so hang a:");
        soA = sc.nextInt();
        System.out.println("Moi nhap so hang b:");
        soB = sc.nextInt();
        System.out.println("Ket qua: "+soA+"+"+soB+"="+(soA+soB));

    }
}
