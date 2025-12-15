package maytinh.dell;

import maytinh.Maytinh;
import maytinh.apple.Apple;

import java.util.*;

public class MipComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Maytinh> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int choice = 0;
        int countDell = 0;
        int countApple = 0;
        do {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Moi ban lua chon:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Nhap toi thieu 3 may tinh dell va 3 may tinh apple");
                        Dell dell = new Dell();
                        dell.inputInfor();
                        list.add(dell);
                        Apple apple = new Apple();
                        apple.inputInfor();
                        list.add(apple);
//                        List<Dell> dellList = new ArrayList<>();
//                        List<Apple> appleList = new ArrayList<>();

                        for (Maytinh mt : list) {
                            if (mt instanceof Dell) {
//                                dellList.add((Dell) mt);
                                countDell++;
                            } else if (mt instanceof Apple){
//                                appleList.add((Apple) mt);
                                countApple++;
                            }
                        }
                    } while (countDell < 3 && countApple < 3);
                    break;
                case 2:
                    for (Maytinh mt : list) {
                        if (mt instanceof Dell dell) {
                            dell.displayInfor();
                        } else if (mt instanceof Apple apple) {
                            apple.displayInfor();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sach truoc khi sap xep");
                    for (Maytinh mt : list) {
                        if (mt instanceof Dell dell) {
                            dell.displayInfor();
                        } else if (mt instanceof Apple apple) {
                            apple.displayInfor();
                        }
                    }
                    System.out.println("Danh sach sau khi sap xep");
//                    List<Object> listAfterSorted = new ArrayList<>();
//                    for (Maytinh mt : list) {
//                        if (mt instanceof Dell dell) {
//                            listAfterSorted.add(dell);
//                        } else if (mt instanceof Apple apple) {
//                            listAfterSorted.add(apple);
//                        }
//                    }
//                    for (String code : map.keySet()) {
//                        if (map)
//                    }
                    Collections.sort(list, Comparator.comparing(Maytinh::hashCode));
                    for (Maytinh mt : list) {
                        if (mt instanceof Dell dell) {
                            dell.displayInfor();
                        } else if (mt instanceof Apple apple) {
                            apple.displayInfor();
                        }
                    }
                    break;
                case 4:
                    for (Maytinh mt : list) {
                        if (mt instanceof Apple apple) {
                            if (apple.getName().contains("apple")) {
                                apple.displayInfor();
                            }
                        }
                    }
                    break;
            }
        } while (choice != 5);
    }
}
