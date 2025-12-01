package product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product() {
    }

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham");
        System.out.println("Nhap id san pham:");
        prodId = sc.nextLine();
        System.out.println("Nhap ten cua san pham:");
        prodName = sc.nextLine();
        System.out.println("Nhap ten hang san xuat:");
        manufacturer = sc.nextLine();
        System.out.println("Nhap gia nguoi cung cap san pham:");
        producerPrice = sc.nextFloat();
    }

    public void display() {
        System.out.println("Id cua san pham: "+prodId);
        System.out.println("Ten cua san pham: "+prodName);
        System.out.println("Ten hang san xuat: "+manufacturer);
        System.out.println("Gia nguoi cung cap san pham: "+producerPrice);
    }

    public float calculateSalePrice() {
        return (float) (producerPrice + 0.05 * producerPrice);
    }
}
