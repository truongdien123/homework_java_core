package vietnam;

import product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public VietNamImportPrice() {
    }

    public VietNamImportPrice(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thue nhap khau cua Viet Nam");
        taxImported = sc.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thue nhap khau: "+taxImported);
        System.out.println("----------------------------");
    }

    @Override
    public float calculateSalePrice() {
        return (float) (this.getProducerPrice() + taxImported * this.getProducerPrice() + 0.1 * (this.getProducerPrice() + taxImported * this.getProducerPrice()));
    }
}
