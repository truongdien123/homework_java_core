import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cua khach hang");
        System.out.println("Id cua khach hang:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten cua khach hang");
        name = sc.nextLine();
        System.out.println("Dia chi cua khach hang");
        address = sc.nextLine();
        System.out.println("Tuoi cua khach hang");
        age = sc.nextInt();
        System.out.println("Luong cua khach hang");
        salary = sc.nextDouble();
        System.out.println("Cam on ban da nhap thong tin");
    }

    public void input(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public void viewData() {
        System.out.println("Thong tin cua khach hang");
        System.out.println("Customer {"+"id="+id+", name="+name+", address="+address+", age="+age+", salary="+salary+"}");
    }

    public double calSalary(int bonus) {
        return salary + salary * (bonus / 100);
    }

    public double calSalary(double bonus) {
        return salary + bonus;
    }
}
