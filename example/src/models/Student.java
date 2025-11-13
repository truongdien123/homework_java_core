package models;

import java.util.Scanner;

public class Student {
    String id;
    String name;
    int age;

    public void changeId(String id) {
        this.id = id;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien:");
        System.out.println("Nhap id:");
        id = sc.nextLine();
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        age = sc.nextInt();
    }

    public void displayStudent() {
        System.out.println("Thong tin sinh vien:");
        System.out.println("Id sinh vien: "+id);
        System.out.println("Ten sinh vien: "+name);
        System.out.println("Tuoi sinh vien: "+age);
    }
}
