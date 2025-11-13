import models.Student;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.changeId("sv01");
        sv.changeName("devmaster");
        sv.changeAge(20);
        sv.displayStudent();

    }
}
