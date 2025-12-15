package maytinh.dell;

import maytinh.Maytinh;

import java.util.Objects;
import java.util.Scanner;

public class Dell extends Maytinh {
    int warranty;

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thoi gian bao hanh cua may tinh:");
        warranty = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh cua may tinh Dell: "+warranty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dell dell = (Dell) o;
        return warranty == dell.warranty;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(warranty);
    }
}
