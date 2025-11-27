public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;

    public int shareCode = 0;

    private static final double PI = Math.PI;

    /**
     * Dien tich hinh chu nhat - vuong
     * @param width
     * @param height
     */
    public void tinhDienTich(float width, float height) {
        double dienTich = width * height;
        System.out.println("Dien tich Hinh Chu Nhat/Vuong: "+dienTich);
    }

    /**
     * Dien tich hinh tron
     * @param radius
     */
    public void tinhDienTich(float radius) {
        double dienTich = PI * radius * radius;
        System.out.println("Dien tich Hinh Tron: "+dienTich);
    }

    /**
     * Dien tich hinh tam giac
     * @param height
     * @param bottom
     */
    public void tinhDienTich(float height, double bottom) {
        double dienTich = 0.5 * bottom * height;
        System.out.println("Dien tich Hinh Tam Giac: "+dienTich);
    }

    /**
     * Chu vi hinh chu nhat - vuong
     * @param width
     * @param height
     */
    public void tinhChuVi(float width, float height) {
        double chuVi = 2 * (height + width);
        System.out.println("Chu vi Hinh Chu Nhat/Vuong: "+chuVi);
    }

    /**
     * Chu vi cua hinh tron
     * @param radius
     */
    public void tinhChuVi(float radius) {
        double chuVi = 2 * PI * radius;
        System.out.println("Chu vi Hinh Tron: "+chuVi);
    }

    /**
     * Chu vi tam giac
     * @param edge1
     * @param edge2
     * @param edge3
     */
    public void tinhChuVi(float edge1, float edge2, float edge3) {
        double chuVi = edge1 + edge2 + edge3;
        System.out.println("Chu vi Hinh Tam Giac: "+chuVi);
    }
}
