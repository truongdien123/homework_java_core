package vietnam;

import product.Product;
import thailand.ThaiLandImportPrice;

import java.util.*;

public class GeneralManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        Map<String, Float> salePriceProduct = new HashMap<>();
        int choice;
        do {
            System.out.println("1. Input information for n products are inputed into VietNam");
            System.out.println("2. Input information for n products are inputed into ThaiLand");
            System.out.println("3. Display all product imported in VietNam as well as in ThaiLand");
            System.out.println("4. Sort by the product name ascending and display the list after sorted");
            System.out.println("5. Calculate the product price in VietNam and ThaiLand and display the sale price");
            System.out.println("6. Search by the sale price and display the result searched");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    VietNamImportPrice vn = new VietNamImportPrice();
                    vn.input();
                    listProduct.add(vn);
                    break;
                case 2:
                    ThaiLandImportPrice tl = new ThaiLandImportPrice();
                    tl.input();
                    listProduct.add(tl);
                    break;
                case 3:
                    for (Product p : listProduct) {
                        if (p instanceof VietNamImportPrice vietNamImportPrice) {
                            vietNamImportPrice.display();
                        } else if (p instanceof ThaiLandImportPrice thaiLanImportPrice) {
                            thaiLanImportPrice.display();
                        }
                    }
                    break;
                case 4:
                    listProduct.sort(new Comparator<Product>() {

                        @Override
                        public int compare(Product p1, Product p2) {
                            return p1.getProdName().compareTo(p2.getProdName());
                        }
                    });
                    for (Product p : listProduct) {
                        if (p instanceof VietNamImportPrice vietNamImportPrice) {
                            vietNamImportPrice.display();
                        } else if (p instanceof ThaiLandImportPrice thaiLanImportPrice) {
                            thaiLanImportPrice.display();
                        }
                    }
                    break;
                case 5:
                    for (Product p : listProduct) {
                        if(p instanceof VietNamImportPrice vietNamImportPrice) {
                            float price = vietNamImportPrice.calculateSalePrice();
                            salePriceProduct.put(p.getProdId(), price);
                            System.out.println("Gia cua san pham "+p.getProdName()+": "+price);
                        } else if (p instanceof ThaiLandImportPrice thaiLanImportPrice) {
                            float price = thaiLanImportPrice.calculateSalePrice();
                            salePriceProduct.put(p.getProdId(), price);
                            System.out.println("Gia cua san pham "+p.getProdName()+": "+price);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhap gia cua san pham ma ban muon tim:");
                    float price = sc.nextFloat();
                    boolean flag = false;
                    for (String id : salePriceProduct.keySet()) {
                        float priceOfSet = salePriceProduct.get(id);
                        if (price == priceOfSet) {
                            Optional<Product> foundProduct = listProduct.stream().filter(p -> p.getProdId().equals(id)).findFirst();
                            foundProduct.ifPresent(Product::display);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Khong tim thay san pham voi gia ban nhap");
                    }
                    break;
            }
        } while (choice != 7);

    }
}
