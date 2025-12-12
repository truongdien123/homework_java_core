import java.util.*;

public class FlowerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Flower> list = new ArrayList<>();
        char choice;
        do {
            System.out.println("a. Nhap thong tin n loai hoa");
            System.out.println("b. Hien thi thong tin vua nhap");
            System.out.println("c. Sap xep danh sach tang dan theo ten hoa");
            System.out.println("d. Tim kiem theo flowerID");
            System.out.println("e. Hien thi tat ca cac loai hoa co mau trang");
            System.out.println("f. Thoat");
            System.out.println("Moi ban chon:");
            choice = sc.nextLine().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("Nhap so loai hoa ban muon tao:");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Loai hoa thu "+(i+1));
                        Flower flower = new Flower();
                        flower.input(sc);
                        list.add(flower);
                    }
                    System.out.println("Cam on ban da nhap");
                    break;
                case 'b':
                    for (Flower flower : list) {
                        flower.display();
                    }
                    break;
                case 'c':
                    list.sort(Comparator.comparing(Flower::getFlowerName));
                    for (Flower flower : list) {
                        flower.display();
                    }
                    break;
                case 'd':
                    System.out.println("Nhap id cua hoa ma ban muon tim:");
                    String id = sc.nextLine();
                    Optional<Flower> flower = list.stream().filter(fl -> fl.getFlowerId().equals(id)).findFirst();
                    if (flower.isPresent()) {
                        flower.get().display();
                    } else {
                        System.out.println("Id hoa ban nhap khong ton tai");
                    }
                    break;
                case 'e':
                    int count = 0;
                    for (Flower flower1: list) {
                        if (flower1.getColor().equals("trang")) {
                            flower1.display();
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Khong co loai hoa nao mau trang trong danh sach");
                    }
                    break;
            }
        } while (choice != 'f');
    }
}
