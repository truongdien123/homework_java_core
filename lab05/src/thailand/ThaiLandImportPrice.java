package thailand;

import product.Product;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice() {
    }

    public ThaiLandImportPrice(float taxImported, float importPriceSupport) {
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice) {
        super(prodId, prodName, manufacturer, producerPrice);
    }

    @Override
    public String getProdId() {
        return super.getProdId();
    }

    @Override
    public void setProdId(String prodId) {
        super.setProdId(prodId);
    }

    @Override
    public String getProdName() {
        return super.getProdName();
    }

    @Override
    public void setProdName(String prodName) {
        super.setProdName(prodName);
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public float getProducerPrice() {
        return super.getProducerPrice();
    }

    @Override
    public void setProducerPrice(float producerPrice) {
        super.setProducerPrice(producerPrice);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thue nhap khau:");
        taxImported = sc.nextFloat();
        System.out.println("Nhap gia ho tro thue nhap khau:");
        importPriceSupport = sc.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thue nhap khau: "+taxImported);
        System.out.println("Gia ho tro nhap khau"+importPriceSupport);
        System.out.println("----------------------------");
    }

    @Override
    public float calculateSalePrice() {
        return (float) (this.getProducerPrice() + taxImported * this.getProducerPrice() - importPriceSupport * this.getProducerPrice() + 0.1 * (this.getProducerPrice() + taxImported * this.getProducerPrice() - importPriceSupport * this.getProducerPrice()));
    }
}
