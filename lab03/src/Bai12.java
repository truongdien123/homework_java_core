import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so tu nhien n:");
        int n = sc.nextInt();
        List<Integer> fibos = new ArrayList<>();
        fibos.add(0);
        fibos.add(1);
        for (int i = 1; i <= n; i++) {
            if (i == (fibos.getLast() + fibos.get(fibos.lastIndexOf(fibos.getLast())-1))) {
                fibos.add(i);
            }
        }
        for (Integer i : fibos) {
            System.out.print(i+",");
        }
    }
}
