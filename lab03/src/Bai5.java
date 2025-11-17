import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao H cua tam giac: ");
        int h = sc.nextInt();
        sc.close();

        veTamGiacCanRong(h);
    }

    public static void veTamGiacCanRong(int h) {
        // Vòng lặp ngoài kiểm soát số hàng (từ 1 đến H)
        for (int i = 1; i <= h; i++) {

            // 1. In Khoảng trắng dẫn đầu (để căn giữa)
            // Số lượng khoảng trắng là H - i
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            // 2. In các ký tự * và Khoảng trắng bên trong
            if (i == 1) {
                // Hàng đầu tiên chỉ in 1 dấu *
                System.out.print("*");
            } else if (i == h) {
                // Hàng cuối cùng (Đáy tam giác)
                // Số lượng dấu * là 2 * H - 1
                for (int j = 1; j <= 2 * h - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // Các hàng ở giữa

                // In dấu * bên trái
                System.out.print("*");

                // In khoảng trắng bên trong (Tâm rỗng)
                // Số lượng khoảng trắng là 2 * i - 3
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                // In dấu * bên phải
                System.out.print("*");
            }

            // Xuống dòng để bắt đầu hàng mới
            System.out.println();
        }
    }
}
