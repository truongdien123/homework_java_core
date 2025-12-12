import java.util.Scanner;

public class Rectangle extends Shape{
    float width;
    float height;
    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong:");
        width = sc.nextFloat();
        System.out.println("Nhap chieu cao:");
        height = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = width*height;
        System.out.printf("Dien tich tu giac la:%.2f",area);
    }
}
