import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu rong (so hang): ");
        int chieuRong = sc.nextInt();

        System.out.print("Nhap chieu dai (so cot): ");
        int chieuDai = sc.nextInt();

        sc.close();

        // Đảm bảo kích thước tối thiểu để có thể vẽ viền
        if (chieuRong < 1 || chieuDai < 1) {
            System.out.println("Kich thuoc phai lon hon 0.");
            return;
        }

        veHinhChuNhatRong(chieuRong, chieuDai);
    }

    public static void veHinhChuNhatRong(int rows, int cols) {
        // Vòng lặp ngoài: Kiểm soát các hàng (từ 1 đến rows)
        for (int i = 1; i <= rows; i++) {

            // Vòng lặp trong: Kiểm soát các cột (từ 1 đến cols)
            for (int j = 1; j <= cols; j++) {

                // Điều kiện để in dấu '*':
                // 1. Hàng đầu tiên (i == 1)
                // 2. Hàng cuối cùng (i == rows)
                // 3. Cột đầu tiên (j == 1)
                // 4. Cột cuối cùng (j == cols)
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    // Nếu không phải là viền, in khoảng trắng để tạo phần rỗng
                    System.out.print(" ");
                }
            }
            // Xuống dòng sau khi kết thúc một hàng
            System.out.println();
        }
    }
}
