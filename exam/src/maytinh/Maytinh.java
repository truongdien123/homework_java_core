package maytinh;

import java.util.Scanner;

public class Maytinh implements IMaytinh{
    protected String code;
    protected String name;
    protected double price;

    public Maytinh() {
    }

    public Maytinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ma cua may tinh:");
            code = sc.nextLine();
            System.out.println("Nhap vao ten cua may tinh:");
            name = sc.nextLine();
            System.out.println("Nhap vao gia cua may tinh:");
            price = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Thong tin ban dang nhap khong hop le: "+e.getMessage());
        }
    }

    @Override
    public void displayInfor() {
        System.out.println("Ma cua may tinh: "+code);
        System.out.println("Ten cua may tinh: "+name);
        System.out.println("Gia cua may tinh: "+price);
    }

    @Override
    public void changeInfor() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ma cua may tinh:");
            code = sc.nextLine();
            System.out.println("Nhap vao ten cua may tinh:");
            name = sc.nextLine();
            System.out.println("Nhap vao gia cua may tinh:");
            price = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Thong tin ban dang nhap khong hop le: "+e.getMessage());
        }
    }
}
