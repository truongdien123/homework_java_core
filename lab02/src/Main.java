import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        System.out.println("Nhap thong tin sinh vien");
//        sv.nhapThongTin();
//        System.out.println("Ten cua sinh vien la: "+sv.name);
//        System.out.println("Dia chi: "+sv.address);
//
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        simpleCalculator.tinhTong();

//        PhuongTrinhB1 phuongTrinhB1 = new PhuongTrinhB1();
//        phuongTrinhB1.nhapDuLieu();
//        phuongTrinhB1.giaiPhuongTrinhB1();

//        DuBaoThoiTiet duBaoThoiTiet = new DuBaoThoiTiet();
//        duBaoThoiTiet.nhapDuLieu();
//        duBaoThoiTiet.hienThiDuBao();
//        TanGai tanGai = new TanGai();
//        tanGai.routine();

//        Person person = new Person();
//        person.input();
//        person.view();
//
//        XeMay xeMay = new XeMay();
//        xeMay.nhapThongTin();
//        xeMay.hienThiThongTin();

//        Student student = new Student();
//        student.nhapThongTin();
//        student.hienThiKetQua();

//        System.out.println("Giai phuong trinh bac hai (ax^2 + bx + c = 0)");
        Scanner sc = new Scanner(System.in);
//        double a;
//        do {
//            System.out.println("Nhap gia tri a:");
//            a = sc.nextDouble();
//            if (a == 0) {
//                System.out.println("Gia tri a khong hop le. Nhap lai");
//            }
//        } while (a == 0);
//        System.out.println("Nhap gia tri b:");
//        double b = sc.nextDouble();
//        System.out.println("Nhap gia tri cua c");
//        double c = sc.nextDouble();
//        double delta = Math.pow(b,2) - 4*a*c;
//        if (delta < 0) {
//            System.out.println("Phuong trinh vo nghiem");
//        } else if (delta == 0) {
//            double nghiemKep = -b/(2*a);
//            System.out.println("Phuong trinh co nghiem kep: "+nghiemKep);
//        } else {
//            double x1 = (-b + Math.sqrt(delta))/(2*a);
//            double x2 = (-b - Math.sqrt(delta))/(2*a);
//            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+x1+" va x2 = "+x2);
//        }

//        System.out.println("Nhap vao so nguyen n:");
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("N la so chan");
//        } else {
//            System.out.println("N la so le");
//        }
//        double x,y,z;
//        do {
//            System.out.println("Nhap vao so x:");
//            x = sc.nextDouble();
//            System.out.println("Nhap vao so y");
//            y = sc.nextDouble();
//            System.out.println("Nhap vao so z");
//            z = sc.nextDouble();
//            if (x == 0 || y == 0 || z == 0) {
//                System.out.println("Ba so x,y,z phai lon hon 0");
//            }
//            if ((x+y)<z || (x+z)<y || (y+z)<x) {
//                System.out.println("Tong cua 2 canh bat ky phai lon hon canh con lai");
//            }
//        } while (x == 0 || y == 0 || z == 0 || ((x+y)<z || (x+z)<y || (y+z)<x));
//        double chuVi = x + y + z;
//        double p = chuVi / 2;
//        double dienTich = Math.sqrt(p*(p - x)*(p - y)*(p - z));
//        System.out.println("Chu vi tam giac: "+chuVi);
//        System.out.println("Dien tich tam giac: "+dienTich);
//        System.out.println("Nhap vao so nguyen g:");
//        int g = sc.nextInt();
//        System.out.println("Nhap vao so nguyen h:");
//        int h = sc.nextInt();
//        System.out.println("Nhap vao so nguyen j:");
//        int j = sc.nextInt();
//        System.out.println("Nhap vao so nguyen k:");
//        int k = sc.nextInt();
//        int r = Math.max(g,h);
//        int t = Math.max(j,k);
//        int q = Math.max(r,t);
//        System.out.println("So nguyen lon nhat: "+q);
//        System.out.println("Nhap vao gia tri thang:");
//        int thang = sc.nextInt();
//        switch (thang) {
//            case 1,3,5,7,8,10,12:
//                System.out.println("Thang nay co 31 ngay");
//                break;
//            case 4,6,9,11:
//                System.out.println("Thang nay co 30 ngay");
//                break;
//            case 2:
//                Random random = new Random();
//                String kiemTraNam = random.nextBoolean() ? "nhuan" : "ko nhuan";
//                if (kiemTraNam.equals("nhuan")) {
//                    System.out.println("Thang co 29 ngay");
//                } else {
//                    System.out.println("Thang co 28 ngay");
//                }
//                break;
//            default:
//                System.out.println("Chua nhap thong tin thang");
//                break;
//        }

        System.out.println("Chao mung den voi tro choi keo bua bao");
        Random random = new Random();
        System.out.println("Ban chon keo, bua hay bao");
        String choice = sc.nextLine();
        String[] resultRandom = new String[3];
        resultRandom[0] = "keo";
        resultRandom[1] = "bua";
        resultRandom[2] = "bao";
        String result = resultRandom[random.nextInt(resultRandom.length)];
        switch (choice) {
            case 
        }
    }
}
