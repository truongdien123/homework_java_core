import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        int choice;
        do {
            choice = showMenu();
            switch (choice) {
                case 1:
                    nhapDuLieu();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    xoaSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    static ArrayList<Book> lstBook = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Nhap du lieu");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Xoa");
        System.out.println("4. Thoat");
        System.out.println("Vui long nhap tu 1 -> 4");
        return sc.nextInt();
    }

    public static void nhapDuLieu() {
        sc.nextLine();
        System.out.println("So sach muon nhap?");
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Nhap cuon thu "+(i+1));
            Book book = new Book();
            book.nhapDuLieu();
            lstBook.add(book);
        }
        System.out.println("Xin cam on");
    }

    public static void hienThiDanhSach() {
        sc.nextLine();
        System.out.println("So sach trong thu vien");
        for (int i = 0; i < lstBook.size(); i++) {
            Book get = lstBook.get(i);
            System.err.println((i+1)+" "+get.toString());
        }
        System.out.println("------------------------");
    }

    public static void xoaSach() {
        sc.nextLine();
        System.out.println("Nhap so thu tu sach muon xoa");
        int id = sc.nextInt();
        // Sửa logic kiểm tra: id > 0 và id <= size()
        if (id <= lstBook.size() && id > 0) {
            Book removedBook = lstBook.remove(id-1);
            System.out.println("Xoa thanh cong cuon: " + removedBook.toString());
        } else {
            System.err.println("So thu tu khong hop le. Khong tim thay sach de xoa.");
        }
    }


}
