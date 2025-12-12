import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
