public class SinhVien {
    private int rollNo;
    private String name;
    private String address;
    private float mark;

    public SinhVien() {
    }

    /**
     * @param rollNo
     * @param name
     */
    public SinhVien(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     *
     * @param rollNo
     * @param address
     * @param name
     */
    public SinhVien(int rollNo, String address, String name) {
        this.rollNo = rollNo;
        this.address = address;
        this.name = name;
    }

    /**
     *
     * @param rollNo
     * @param name
     * @param address
     * @param mark
     */
    public SinhVien(int rollNo, String name, String address, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
