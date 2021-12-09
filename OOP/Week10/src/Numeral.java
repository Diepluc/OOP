public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {
        value = 0;
    }

    /**
     * tString.
     */
    public String toString() {
        if (value == (int) value) {
            return String.valueOf((int) value);
        }
        return String.valueOf(value);
    }

    /**
     * binh phuong.
     */
    public double evaluate() {
        return value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
