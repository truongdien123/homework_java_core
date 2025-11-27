import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        System.out.println("Nhap nhiet do can chuyen doi");
        Scanner sc = new Scanner(System.in);
        float nhietDo = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhiet do ban vua nhap la: (bam C hoac F)");
        char type = sc.nextLine().charAt(0);
        ConvertTemperature convert = new ConvertTemperature();
        switch (type) {
            case 'C':
                convert.convert(nhietDo, true);
                break;
            case 'F':
                convert.convert(nhietDo, false);
                break;
        }
    }
}
