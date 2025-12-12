import java.util.Scanner;

public class Triangle extends Shape{
    float height;
    float bottom;
    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        height = sc.nextFloat();
        System.out.println("Nhap canh day:");
        bottom = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (bottom*height)/2;
        System.out.printf("Dien tich tam giac la:%.2f",area);
    }
}
