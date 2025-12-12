import java.util.Scanner;

public class Flower {
    private String flowerId;
    private String flowerName;
    private String color;
    private int kindOfFlower;

    public Flower() {
    }

    public Flower(String flowerId, String flowerName, String color, int kindOfFlower) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(String flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public void input(Scanner sc) {
        System.out.println("Nhap thong tin cua hoa");
        System.out.println("Nhap id cua hoa:");
        flowerId = sc.nextLine();
        System.out.println("Nhap ten cua hoa:");
        flowerName = sc.nextLine();
        System.out.println("Nhap mau cua hoa:");
        color = sc.nextLine();
        System.out.println("Nhap loai hoa:");
        kindOfFlower = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Flower{" +
                "flowerId='" + flowerId + '\'' +
                ", flowerName='" + flowerName + '\'' +
                ", color='" + color + '\'' +
                ", kindOfFlower=" + kindOfFlower +
                '}');
    }
}
