import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Cuoi tuan ban muon lam gi?");
            System.out.println("1. Di hoc java");
            System.out.println("2. Di choi cong vien ngam gau");
            System.out.println("3. Di (ve) nha nghi");
            System.out.println("4. Ra song Hong tam tien");
            System.out.println("5. Ngu ca ngay");
            System.out.println("6. Thoat");
            System.out.println("Moi ban lua chon");
            n = sc.nextInt();
            switch (n) {
                case 1,2,3,4,5:
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
