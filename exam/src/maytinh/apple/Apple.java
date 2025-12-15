package maytinh.apple;

import maytinh.Maytinh;

import java.util.Objects;
import java.util.Scanner;

public class Apple extends Maytinh {
    int warranty;

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thoi gian bao hanh:");
        warranty = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh cua may tinh apple: "+warranty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return warranty == apple.warranty;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(warranty);
    }
}
