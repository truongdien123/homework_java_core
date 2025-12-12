import java.util.*;

public class ManagerCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<City> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("1. Nhap thong tin n thanh pho");
            System.out.println("2. Hien thi thong tin vua nhap");
            System.out.println("3. Sap xep thong tin tang dan theo ten nuoc");
            System.out.println("4. Tim kiem thong tin theo cityId");
            System.out.println("5. Thoat");
            System.out.println("Moi ban chon:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so thanh pho ban muon nhap:");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thanh pho thu "+i+1);
                        City city = new City();
                        city.nhap();
                        list.add(city);
                    }
                    System.out.println("Cam on ban da nhap");
                    break;
                case 2:
                    for (City city : list) {
                        city.hienThi();
                    }
                    break;
                case 3:
                    list.sort(Comparator.comparing(City::getCountry));
                    for (City city : list) {
                        city.hienThi();
                    }
                    break;
                case 4:
                    System.out.println("Nhap id thanh pho ma ban muon tim:");
                    String id = sc.nextLine();
                    Optional<City> city = list.stream().filter(ct -> ct.getCityId().equals(id)).findFirst();
                    if (city.isPresent()) {
                        city.get().hienThi();
                    } else {
                        System.out.println("Id ma ban muon tim ko ton tai");
                    }
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
    }
}
