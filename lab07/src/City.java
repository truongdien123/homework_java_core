import java.util.Scanner;

public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;

    public City() {
    }

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cua thanh pho");
        System.out.println("Nhap id cua thanh pho:");
        cityId = sc.nextLine();
        System.out.println("Nhap ten cua thanh pho:");
        cityName = sc.nextLine();
        System.out.println("Nhap quoc gia:");
        country = sc.nextLine();
        System.out.println("Nhap dien tich:");
        area = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThi() {
        System.out.println("City{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country='" + country + '\'' +
                ", area=" + area +
                '}');
    }
}
