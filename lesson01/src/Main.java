import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, this is my first application");
        System.out.println("Nhap so nguyen tu ban phim");
        int n = sc.nextInt();
        System.out.println("Gia tri so nguyen n: "+n);
        System.out.println("-------------------- ");
        int m = sc.nextInt();
        System.out.println("Gia tri so nguyen m: "+m);
        System.out.println("-------------------- ");
        String j = sc.nextLine();
        System.out.println("Chuoi la: "+j);
        System.out.println("-------------------- ");
        int v = n + m;
        System.out.println("Gia tri tong n va m: "+v);
        System.out.println("-------------------- ");
        System.out.println("Nhap so nguyen n1:");
        int n1 = sc.nextInt();
        System.out.println("Nhap so nguyen m1:");
        int m1 = sc.nextInt();
        System.out.println("Nhap so thuc n2:");
        float n2 = sc.nextFloat();
        System.out.println("Nhap so thuc m2:");
        float m2 = sc.nextFloat();
        int tongHaiSoNguyen = n1 + m1;
        float tongHaiSoThuc = n2 + m2;
        float tongN1VaN2 = n1 + n2;
        System.out.println("Tong cua 2 so nguyen: "+tongHaiSoNguyen);
        System.out.println("Tong cua 2 so thuc: "+tongHaiSoThuc);
        System.out.println("Tong cua n1 va n2: "+tongN1VaN2);
        System.out.println("-------------------- ");
        System.out.println("Nhap vao so nguyen x:");
        int x = sc.nextInt();
        System.out.println("Nhap vao so nguyen y:");
        int y = sc.nextInt();
        System.out.println("Max: "+Math.max(x,y));
        System.out.println("Min: "+Math.min(x,y));
        System.out.println("-------------------- ");
        System.out.println("Nhap vao so nguyen d:");
        int d = sc.nextInt();
        System.out.println("Nhap vao so nguyen e:");
        int e = sc.nextInt();
        System.out.println("Nhap vao so nguyen f:");
        int f = sc.nextInt();
        System.out.println("Max: "+Math.max((Math.max(d,e)), f));
        System.out.println("Min: "+Math.min((Math.min(d,e)), f));
        System.out.println("-------------------- ");
        System.out.println("Phuong trinh bac nhat (ax+b=0)");
        double a;
        do {
            System.out.println("Nhap vao gia tri a (a khac 0):");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.println("Nhap vao gia tri b:");
        double b = sc.nextDouble();
        System.out.println("Nghiem phuong trinh bac nhat: "+(-b/a));
        System.out.println("-------------------- ");
        System.out.println("Phuong trinh bac hai (ax^2 + bx + c = 0)");
        double u;
        do {
            System.out.println("Nhap vao gia tri a (a khac 0):");
            u = sc.nextDouble();
        } while (u == 0);
        System.out.println("Nhap vao gia tri b:");
        double i = sc.nextDouble();
        System.out.println("Nhap vao gia tri c:");
        double o = sc.nextDouble();
        double delta = Math.pow(i,2) - 4*u*o;
        if(delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+(-i/(2*u)));
        } else {
            double x1 = (-i+Math.sqrt(delta))/(2*u);
            double x2 = (-i-Math.sqrt(delta))/(2*u);
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+x1+"; x2 = "+x2);
        }
        //
        SinhVien sv = new SinhVien();

        System.out.println("Nhap ten sinh vien");
        sv.setTen(sc.nextLine());
        System.out.println("Nhap tuoi sinh vien");
        sv.setTuoi(sc.nextInt());
        System.out.println("Nhap diem ly thuyet sinh vien");
        sv.setDiemLyThuyet(sc.nextDouble());
        System.out.println("Nhap diem thuc hanh sinh vien");
        sv.setDiemThucHanh(sc.nextDouble());
        double diemTrungBinh = (sv.getDiemLyThuyet() + sv.getDiemThucHanh()) / 2;
        System.out.println("Sinh vien: "+sv.getTen()+" - tuoi: "+sv.getTuoi());
        System.out.println("Diem trung binh: "+diemTrungBinh);
    }
}
