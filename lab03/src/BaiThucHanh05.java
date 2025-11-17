public class BaiThucHanh05 {

    public static void main(String[] args) {
        number4Text(15);
    }

    public static void docSo(double soThapPhan) {
        if (soThapPhan < 20) {
            phatAmSo((int) soThapPhan);
        } else if (soThapPhan >= 20 && soThapPhan < 100) {
            phatAmSo((int) soThapPhan/10);
            System.out.println("muoi");
        }
    }

    public static void number4Text(double number) {
        double phanDu = number;
        do {
            phanDu = number % 10;
            double thapPhan = number - phanDu;
//            System.out.println("phan du: "+phanDu);
//            System.out.println("thap phan: "+thapPhan);
            docSo(thapPhan);
        }while (phanDu > 10);
        if (phanDu > 0) {
            System.out.println(" ");
            phatAmSo((int) phanDu);
            System.out.println();
        }
    }

    public static void phatAmSo(int so) {
        switch (so) {
            case 0:
                System.out.println("khong");
                break;
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9:
                System.out.println("chin");
                break;
            default:
                System.out.println("so ko hop le");
                break;
        }
    }
}
