import models.Student;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.changeId("sv01");
        sv.changeName("devmaster");
        sv.changeAge(20);
        sv.displayStudent();

        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.subtract(1,2);
        calculator.multiply(1,2);
        calculator.divide(1,2);

    }
}
