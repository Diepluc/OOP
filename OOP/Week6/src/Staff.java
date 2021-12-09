public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * ke thua.
     * @param name ten
     * @param address dia chi
     * @param school lop
     * @param pay tien
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    /**
     * tra ve chuoi.
     *
     * @return tra ve chuoi
     */
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + getSchool() + ",pay=" + getPay() + "]";
    }
}
