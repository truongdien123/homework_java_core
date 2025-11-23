import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        System.out.println(arr.size());

        arr.add("Hello");
        arr.add("World");
        System.out.println(arr.size());
        arr.add(100);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        arr.remove(2);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
