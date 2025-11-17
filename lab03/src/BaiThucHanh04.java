public class BaiThucHanh04 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i <= 1000; i++) {
            if (i%3==0 && count < 11) {
                System.out.println(i);
                count++;
            }
            if (count==11) {
                break;
            }
        }
    }
}
