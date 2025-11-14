import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println("Nhap thong tin sinh vien");
        sv.nhapThongTin();
        System.out.println("Ten cua sinh vien la: "+sv.name);
        System.out.println("Dia chi: "+sv.address);

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.tinhTong();

        PhuongTrinhB1 phuongTrinhB1 = new PhuongTrinhB1();
        phuongTrinhB1.nhapDuLieu();
        phuongTrinhB1.giaiPhuongTrinhB1();

        DuBaoThoiTiet duBaoThoiTiet = new DuBaoThoiTiet();
        duBaoThoiTiet.nhapDuLieu();
        duBaoThoiTiet.hienThiDuBao();
        TanGai tanGai = new TanGai();
        tanGai.routine();

        Person person = new Person();
        person.input();
        person.view();

        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();

        Student student = new Student();
        student.nhapThongTin();
        student.hienThiKetQua();

        System.out.println("Giai phuong trinh bac hai (ax^2 + bx + c = 0)");
        Scanner sc = new Scanner(System.in);
        double a;
        do {
            System.out.println("Nhap gia tri a:");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("Gia tri a khong hop le. Nhap lai");
            }
        } while (a == 0);
        System.out.println("Nhap gia tri b:");
        double b = sc.nextDouble();
        System.out.println("Nhap gia tri cua c");
        double c = sc.nextDouble();
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double nghiemKep = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep: "+nghiemKep);
        } else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+x1+" va x2 = "+x2);
        }

        System.out.println("Nhap vao so nguyen n:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("N la so chan");
        } else {
            System.out.println("N la so le");
        }
        double x,y,z;
        do {
            System.out.println("Nhap vao so x:");
            x = sc.nextDouble();
            System.out.println("Nhap vao so y");
            y = sc.nextDouble();
            System.out.println("Nhap vao so z");
            z = sc.nextDouble();
            if (x == 0 || y == 0 || z == 0) {
                System.out.println("Ba so x,y,z phai lon hon 0");
            }
            if ((x+y)<z || (x+z)<y || (y+z)<x) {
                System.out.println("Tong cua 2 canh bat ky phai lon hon canh con lai");
            }
        } while (x == 0 || y == 0 || z == 0 || ((x+y)<z || (x+z)<y || (y+z)<x));
        double chuVi = x + y + z;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p*(p - x)*(p - y)*(p - z));
        System.out.println("Chu vi tam giac: "+chuVi);
        System.out.println("Dien tich tam giac: "+dienTich);
        System.out.println("Nhap vao so nguyen g:");
        int g = sc.nextInt();
        System.out.println("Nhap vao so nguyen h:");
        int h = sc.nextInt();
        System.out.println("Nhap vao so nguyen j:");
        int j = sc.nextInt();
        System.out.println("Nhap vao so nguyen k:");
        int k = sc.nextInt();
        int r = Math.max(g,h);
        int t = Math.max(j,k);
        int q = Math.max(r,t);
        System.out.println("So nguyen lon nhat: "+q);
        System.out.println("Nhap vao gia tri thang:");
        int thang = sc.nextInt();
        switch (thang) {
            case 1,3,5,7,8,10,12:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 4,6,9,11:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 2:
                Random random = new Random();
                String kiemTraNam = random.nextBoolean() ? "nhuan" : "ko nhuan";
                if (kiemTraNam.equals("nhuan")) {
                    System.out.println("Thang co 29 ngay");
                } else {
                    System.out.println("Thang co 28 ngay");
                }
                break;
            default:
                System.out.println("Chua nhap thong tin thang");
                break;
        }

        System.out.println("Chao mung den voi tro choi keo bua bao");
        Random random = new Random();
        System.out.println("Ban chon keo, bua hay bao");
        String choice = sc.nextLine();
        String[] resultRandom = new String[3];
        resultRandom[0] = "keo";
        resultRandom[1] = "bua";
        resultRandom[2] = "bao";
        String result = resultRandom[random.nextInt(resultRandom.length)];
        System.out.println("Ket qua random cua he thong: "+result);
        switch (choice) {
            case "keo":
                switch (result) {
                    case "bua":
                        System.out.println("Ban da thua");
                        break;
                    case "keo":
                        System.out.println("Hoa nhau");
                        break;
                    case "bao":
                        System.out.println("Ban da thang");
                        break;
                    default:
                        System.out.println("...");
                        break;
                }
                break;
            case "bua":
                switch (result) {
                    case "bua":
                        System.out.println("Hoa nhau");
                        break;
                    case "keo":
                        System.out.println("Ban da thang");
                        break;
                    case "bao":
                        System.out.println("Ban da thua");
                        break;
                    default:
                        System.out.println("...");
                        break;
                }
                break;
            case "bao":
                switch (result) {
                    case "bua":
                        System.out.println("Ban da thang");
                        break;
                    case "keo":
                        System.out.println("Ban da thua");
                        break;
                    case "bao":
                        System.out.println("Hoa nhau");
                        break;
                    default:
                        System.out.println("...");
                        break;
                }
                break;
            default:
                System.out.println("...");
                break;
        }
        System.out.println("Nhap vao 1 ki tu");
        char kiTu = sc.nextLine().toLowerCase().charAt(0);
        switch (kiTu) {
            case 'r':
                System.out.println("RED");
                break;
            case 'g':
                System.out.println("GREEN");
                break;
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
                break;
        }
        System.out.println("Nhap vao gia tri p:");
        double p = sc.nextDouble();
        System.out.println("Nhap vao gia tri l:");
        double l = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap vao bieu thuc:");
        char bieuThuc = sc.nextLine().charAt(0);
        switch (bieuThuc) {
            case '+':
                System.out.println("Ket qua: "+(p+l));
                break;
            case '-':
                System.out.println("Ket qua: "+(p-l));
                break;
            case '*':
                System.out.println("Ket qua: "+(p*l));
                break;
            case '/':
                while (l == 0) {
                    System.out.println("l phai khac 0, nhap lai gia tri l:");
                    l = sc.nextDouble();
                }
                System.out.println("Ket qua: "+(p/l));
                break;
            default:
                System.out.println("...");
                break;
        }
        System.out.println("Nhap vao diem 3 mon");
        System.out.println("Mon toan:");
        double toan = sc.nextDouble();
        System.out.println("Mon ly:");
        double ly = sc.nextDouble();
        System.out.println("Mon hoa:");
        double hoa = sc.nextDouble();
        double tongDiem = toan + ly + hoa;
        if (tongDiem >= 15 && toan >= 4 && ly >= 4 && hoa >= 4) {
            System.out.println("Dau");
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Hoc deu cac mon");
            } else {
                System.out.println("Hoc chua deu cac mon");
            }
        } else {
            System.out.println("Thi hong");
        }
        System.out.println("Nhap vao so gio lam:");
        double gioLam = sc.nextDouble();
        System.out.println("Nhap vao luong:");
        double luongGioLam = sc.nextDouble();
        double luongCoBan = 0;
        double luongOT = 0;
        if (gioLam > 40) {
            luongCoBan = luongGioLam * 40;
            double ot = gioLam - 40;
            luongOT = ot * luongGioLam * 1.5;
        } else {
            luongCoBan = luongGioLam * gioLam;
        }
        double tongLuong = luongCoBan + luongOT;
        System.out.println("Tien luong: "+tongLuong);
        // --- 1. Khai báo hằng số và mức giá ---
        final double THUE_BAO = 1000;
        final double DINH_MUC_KW = 50;
        final double GIA_DINH_MUC = 230;

        // Mức giá cho phần vượt định mức (Tính luỹ tiến theo tổng số KW vượt)
        final double GIA_VUOT_1 = 480; // Cho 50KW đầu tiên vượt định mức
        final double GIA_VUOT_2 = 700; // Cho 50KW tiếp theo vượt định mức
        final double GIA_VUOT_3 = 900; // Cho phần còn lại

        // --- 2. Nhập chỉ số ---
        System.out.println("--- Chuong trinh Tinh Tien Dien ---");
        System.out.print("Nhap vao chi so dien cu (KW): ");
        double chiSoCu = sc.nextDouble();

        System.out.print("Nhap vao chi so dien moi (KW): ");
        double chiSoMoi = sc.nextDouble();

        // --- Kiem tra dieu kien chi so ---
        if (chiSoMoi < chiSoCu) {
            System.out.println("Loi: Chi so moi khong duoc nho hon chi so cu. Vui long kiem tra lai.");
            return;
        }

        // --- 3. Tính toán tổng KW tiêu thụ ---
        double tongKW = chiSoMoi - chiSoCu;

        // --- 4. Tính Tiền Trả Định Mức ---
        double tienTraDinhMuc = 0;
        double kwVuot = 0;

        if (tongKW <= DINH_MUC_KW) {
            // Trường hợp 1: Tiêu thụ trong định mức
            tienTraDinhMuc = tongKW * GIA_DINH_MUC;
        } else {
            // Trường hợp 2: Tiêu thụ vượt định mức
            tienTraDinhMuc = DINH_MUC_KW * GIA_DINH_MUC;
            kwVuot = tongKW - DINH_MUC_KW;
        }

        // --- 5. Tính Tiền Trả Vượt Định Mức (Tính theo bậc thang luỹ tiến) ---
        double tienTraVuotDinhMuc = 0;
        double kwConLai = kwVuot;

        // Bậc 2: Phần vượt <= 50KW đầu tiên (Giá 480)
        if (kwConLai > 0) {
            double kwBac2 = Math.min(kwConLai, 50);
            tienTraVuotDinhMuc += kwBac2 * GIA_VUOT_1;
            kwConLai -= kwBac2;
        }

        // Bậc 3: Phần vượt > 50KW va < 100KW tiep theo (Giá 700)
        if (kwConLai > 0) {
            double kwBac3 = Math.min(kwConLai, 50);
            tienTraVuotDinhMuc += kwBac3 * GIA_VUOT_2;
            kwConLai -= kwBac3;
        }

        // Bậc 4: Phần vượt >= 100KW (Giá 900) - Giả định theo đề bài mâu thuẫn
        if (kwConLai > 0) {
            double kwBac4 = kwConLai;
            tienTraVuotDinhMuc += kwBac4 * GIA_VUOT_3;
        }

        // --- 6. Tính Tổng Tiền Phải Trả ---
        double tongTienPhaiTra = THUE_BAO + tienTraDinhMuc + tienTraVuotDinhMuc;

        // --- 7. In kết quả ---
        System.out.println("\n--- Chi Tiet Hoa Don ---");
        System.out.println("Chi so cu: " + (int)chiSoCu + " KW");
        System.out.println("Chi so moi: " + (int)chiSoMoi + " KW");
        System.out.println("Tong so KW tieu thu: " + (int)tongKW + " KW");
        System.out.println("---------------------------------");
        System.out.println("Tong tien thue bao dien ke: " + (int)THUE_BAO + " dong");
        System.out.println("Tien tra dinh muc (" + (int)DINH_MUC_KW + " KW @ " + (int)GIA_DINH_MUC + "d): " + (int)tienTraDinhMuc + " dong");
        System.out.println("Tien tra vuot dinh muc (" + (int)kwVuot + " KW): " + (int)tienTraVuotDinhMuc + " dong");
        System.out.println("=================================");
        System.out.println("** TONG TIEN PHAI TRA: " + (int)tongTienPhaiTra + " dong **");
    }
}
