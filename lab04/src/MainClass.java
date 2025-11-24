public class MainClass {
    public static void main(String[] args) {
        Customer cust_1 = new Customer();
        Customer cust_2 = new Customer();
        System.out.println("Nhap du lieu khach hang 1:");
        cust_1.input();
        System.out.println("Nhap du lieu khach hang 2:");
        cust_2.input();

        cust_1.viewData();
        cust_2.viewData();

        System.out.println("Tien luong cua khach hang 1:"+cust_1.calSalary(15));
        System.out.println("Tien luong cua khach hang 2:"+cust_2.calSalary(690000));
    }
}
