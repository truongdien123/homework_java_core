import java.util.Scanner;

public class CustomerManager {
    public static void main(String[] args) {
        Customer nhanVien = new Customer();
        nhanVien.input();
        nhanVien.viewData();
        CustomerManager manager = new CustomerManager();
        manager.inputCustomer();
        Customer testCon = new Customer(3, "Shin Dong Hiep", "Gam Cau", 19, 350000);
    }

    Customer globalCus = new Customer();

    public void inputCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten:");
        String name = sc.nextLine();
        System.out.println("Tuoi:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Dia chi:");
        String address = sc.nextLine();
        System.out.println("Luong:");
        double salary = sc.nextDouble();

        globalCus.input(id, name, address, age, salary);
    }
}
