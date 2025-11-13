import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TanGai {
    int choice;
    String result;

    public void routine() {
        System.out.println("Chao mung den voi chuong trinh tan gai");
        Scanner sc = new Scanner(System.in);
        result = random("xinh", "xau");
        System.out.println("Co gai nay co ngoai hinh: "+result);
        if (result.equals("xau")) {
            System.out.println("Xem xet dieu kien");
            result = random("giau", "ngheo");
            System.out.println("Co gai nay: "+result);
            if (result.equals("giau")) {
                System.out.println("Ban gai la phu ba");
                System.out.println("Nham mat yeu lun");
                return;
            } else {
                System.out.println("Ban da nhuong cho thang tro cung phong va ban van FA");
                return;
            }
        }
        result = random("chua co ny", "co ny");
        System.out.println("Co gai nay hien tai: "+result);
        if(result.equals("co ny")) {
            showOption("tan luon ban trai", "tu bo");
            System.out.println("Moi ban lua chon:");
            choice = sc.nextInt();
            if (choice == 2) {
                System.out.println("Ban da quyet dinh FA, cam on ban da tham gia");
                return;
            } else {
                System.out.println("Hao han");
            }
        }
        showOption("tan", "ko tan");
        System.out.println("Moi ban lua chon:");
        choice = sc.nextInt();
        if (choice == 2) {
            System.out.println("Ban da bo lo 1 nguoi. Chuc mung ban quay lai hoi FA");
            return;
        }
        result = random("yes", "no");
        System.out.println("Co gai da "+(result.equals("yes") ? "dong y" : "tu choi")+" lam ban gai cua ban");
        if (result.equals("no")) {
            System.out.println("Ban da bi tu choi. Chuc mung ban van FA");
        } else {
            System.out.println("Hai nguoi di an va di choi");
        }
    }

    private String random(String item1, String item2) {
        Random rd = new Random();
        return rd.nextBoolean() ? item1 : item2;
    }

    private void showOption(String option1, String option2) {
        System.out.println("1."+option1);
        System.out.println("2."+option2);
    }
}
