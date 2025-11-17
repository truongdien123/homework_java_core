import java.util.List;

public class Student {
    String id;
    String ten;
    int tuoi;
    double diem;

    public void findStudent(String id, List<Student> studentList) {
        for (Student student: studentList) {
            if (student.id.equals(id)) {
                System.out.println(student.id);
                System.out.println(student.ten);
                System.out.println(student.tuoi);
                System.out.println(student.diem);
                break;
            }
        }
    }

    public void displayStudents(Student student) {
        System.out.println(student.id);
        System.out.println(student.ten);
        System.out.println(student.tuoi);
        System.out.println(student.diem);
    }

    public void highestScoreStudent(List<Student> studentList) {
        double maxScore = 0;
        for (Student student : studentList) {
            if (student.diem > diem) {
                maxScore = student.diem;
            }
        }

    }
}
