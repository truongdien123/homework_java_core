import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;

    public void input() {
        System.out.println("Nhap thong tin nhan vien");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap tien luong:");
        salary = sc.nextDouble();
    }

    public void view() {
        System.out.println("Thong tin nhan vien");
        System.out.println("Ten cua nhan vien: "+name);
        System.out.println("Dia chi nhan vien: "+address);
        System.out.println("Luong cua nhan vien: "+salary);
    }
}
