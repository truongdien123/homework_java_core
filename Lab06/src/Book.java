import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPage;
    private float price;

    public void nhapDuLieu() {
        System.out.println("Nhap du lieu cho sach");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten sach");
        this.bookName = sc.nextLine();
        System.out.println("Nha xuat ban");
        this.nxb = sc.nextLine();
        System.out.println("Nam xuat ban");
        this.yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.println("Tac gia");
        this.author = sc.nextLine();
        System.out.println("So trang");
        this.numOfPage = sc.nextInt();
        sc.nextLine();
        System.out.println("Gia");
        this.price = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", nxb='" + nxb + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", author='" + author + '\'' +
                ", numOfPage=" + numOfPage +
                ", price=" + price +
                '}';
    }
}
