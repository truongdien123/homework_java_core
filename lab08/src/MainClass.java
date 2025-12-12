import java.util.Scanner;

public class MainClass {
    public int showMenu() {
        System.out.println("================MENU===============");
        System.out.println("1. Tinh dien tich hinh tron");
        System.out.println("2. Tinh dien tich hinh tu giac");
        System.out.println("3. Tinh dien tich hinh tam giac");
        System.out.println("Vui long chon tu 1-->3");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void tinhDienTich(Shape hinh) {
        hinh.inputData();
        hinh.calArea();
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
        int luaChon = 0;
        do {
            luaChon = main.showMenu();
            switch (luaChon) {
                case 1:
                    main.tinhDienTich(new Circle());
                    break;
                case 2:
                    main.tinhDienTich(new Rectangle());
                    break;
                case 3:
                    main.tinhDienTich(new Triangle());
                    break;
            }
        } while (luaChon > 0 && luaChon <= 3);
        System.out.println("Chuong trinh ket thuc, chao tam biet");
    }
}
