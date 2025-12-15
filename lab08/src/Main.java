import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<GiangVien> list = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("1. Nhap vao thong tin cua giang vien");
            System.out.println("2. Xuat danh sach toan bo giang vien");
            System.out.println("3. Xuat danh sach giang vien co huu");
            System.out.println("4. Xuat danh sach giang vien thinh giang");
            System.out.println("5. Tinh tong so tien luong cua toan bo giang vien");
            System.out.println("6. Tim giang vien co tong luong cao nhat");
            System.out.println("Moi ban chon:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                
            }
        }
    }
}
