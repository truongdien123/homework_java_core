public class MainClass {
    public static void main(String[] args) {
        final MainClass objFinal = new MainClass();
        objFinal.display(22.7f);
    }

    final float PI = 3.14f;

    public void display(float pi) {
        float PI = pi;
        System.out.println("The value of PI is:"+PI);
    }
}
