import java.util.*;

public class DemoLoop {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        for (char i = 'A'; i <= 'Z'; i++) {
//            System.out.println(i);
//        }
////        finder69();
//        drawTriangle();
        List<Student> studentList = new ArrayList<>();
        int choice;
        do {
            choice  = viewMenu();
            Student student = new Student();
            switch (choice) {
                case 1:
                    System.out.println("Nhap id:");
                    student.id = sc.nextLine();
                    System.out.println("Nhap ten:");
                    student.ten = sc.nextLine();
                    System.out.println("Nhap tuoi:");
                    student.tuoi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap diem:");
                    student.diem = sc.nextDouble();
                    sc.nextLine();
                    studentList.add(student);
                    break;
                case 2:
                    studentList.forEach(student::displayStudents);
                    break;
                case 3:
                    System.out.println("Nhap id sinh vien ban muon tim:");
                    String id = sc.nextLine();
                    student.findStudent(id, studentList);
                    break;
                case 4:
                    Optional<Student> highestScoreStudent = studentList.stream().max(Comparator.comparingDouble(st -> st.diem));
                    highestScoreStudent.ifPresent(student::displayStudents);
                    break;
                default:
                    break;
            }
        } while (choice != 5);
    }

    public static void finder69() {
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            if (i == 69) {
                System.out.println(i);
                System.out.println("O re ka - tim thay roi");
            }
        }
    }

    public static void drawTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int viewMenu() {
        System.out.println("=========MENU===========");
        System.out.println("1. Nhap thong tin sinh vien.");
        System.out.println("2. Hien thi thong tin sinh vien.");
        System.out.println("3. Tim kiem sinh vien.");
        System.out.println("4. Sinh vien xuat sac nhat.");
        System.out.println("5. Thoat.");
        System.out.println("Moi nhap tu 1 --> 5");
        System.out.println("------------------------------");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
}
