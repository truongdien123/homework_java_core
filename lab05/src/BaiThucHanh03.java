public class BaiThucHanh03 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setRollNo(1);
        sv1.setName("Nam");
        sv1.setAddress("Quy Nhon");
        sv1.setMark(7);
        System.out.println("Roll No sv 1: "+sv1.getRollNo());
        System.out.println("Name sv 1: "+sv1.getName());
        System.out.println("Address sv 1: "+sv1.getAddress());
        System.out.println("Mark sv 1: "+sv1.getMark());

        SinhVien sv2 = new SinhVien(2, "Tuan");
        System.out.println("Roll No sv 2: "+sv2.getRollNo());
        System.out.println("Name sv 2: "+sv2.getName());
        System.out.println("Address sv 2: "+sv2.getAddress());
        System.out.println("Mark sv 2: "+sv2.getMark());

        SinhVien sv3 = new SinhVien(3, "Ha Nam", "Long");
        System.out.println("Roll No sv 3: "+sv3.getRollNo());
        System.out.println("Name sv 3: "+sv3.getName());
        System.out.println("Address sv 3: "+sv3.getAddress());
        System.out.println("Mark sv 3: "+sv3.getMark());

        SinhVien sv4 = new SinhVien(4, "Tri", "Da Nang", 7.8f);
        System.out.println("Roll No sv 4: "+sv4.getRollNo());
        System.out.println("Name sv 4: "+sv4.getName());
        System.out.println("Address sv 4: "+sv4.getAddress());
        System.out.println("Mark sv 4: "+sv4.getMark());
    }
}
