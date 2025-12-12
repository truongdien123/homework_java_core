import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cac so nguyen cho mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        // Bắt đầu từ phần tử thứ hai (index 1), vì arr[0] đã được coi là mảng đã sắp xếp
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Phần tử cần chèn (Key)
            int j = i - 1;    // Vị trí cuối cùng của mảng đã sắp xếp

            // Di chuyển các phần tử của mảng đã sắp xếp (arr[0..i-1]),
            // lớn hơn key, sang một vị trí sau vị trí hiện tại của chúng.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Chèn key vào vị trí đúng
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
