import models.Student;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.changeId("sv01");
        sv.changeName("devmaster");
        sv.changeAge(20);
        sv.displayStudent();

        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.subtract(1, 2);
        calculator.multiply(1, 2);
        calculator.divide(1, 2);

        int[] arr1;
        int[] arr2 = new int[10];
        int[] arr3 = {10,20,30,40,50};
        float[] arr4 = new float[10];

        arr2[0] = 100;
        arr2[1] = 200;

        System.out.println("arr[0]: "+arr2[0]);
        System.out.println("arr[1]: "+arr2[1]);

        System.out.println("Danh sach cac phan tu trong mang");
        for (int j : arr3) {
            System.out.printf("%4d", j);
        }

        int[][] arr5 = new int[][]{
                {11,2,3},
                {4,55,6},
                {7,8,99}
        };
        System.out.println("\n arr5[0][0]: "+arr5[0][0]);
        System.out.println(" arr5[1][2]: "+arr5[1][2]);

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.printf("%4d",arr5[i][j]);
            }
            System.out.println("\n");
        }
    }
}
