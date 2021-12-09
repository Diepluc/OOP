public class Solution {
    private int numerator;
    private int denominator;

    /**
     * khoi tao phan so.
     *
     * @param numerator   tu so
     * @param denominator mau so
     */
    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * cai dat mau so.
     *
     * @param denominator tra ve gia tri mau
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * tim uoc chung lon nhat.
     *
     * @param a bien a
     * @param b bien b
     * @return tra ve gcd
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            if (a < 0) {
                a = -a;
            }
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * rut gon phan so.
     *
     * @return rut gon
     */
    public Solution reduce() {
        int numGcd = gcd(numerator, denominator);
        if (this.denominator == 0) {
            return new Solution(numerator, denominator);
        }
        this.numerator = this.numerator / numGcd;
        this.denominator = this.denominator / numGcd;
        Solution solution = new Solution(numerator, denominator);
        return solution;
    }

    /**
     * tong hai phan so.
     *
     * @param sol phan so
     * @return tra ve tong
     */
    public Solution add(Solution sol) {
        if (this.denominator == 0 || sol.getDenominator() == 0) {
            return reduce();
        }
        this.numerator = numerator * sol.getDenominator() + denominator * sol.getNumerator();
        this.denominator = denominator * sol.getDenominator();
        return reduce();
    }

    /**
     * hieu hai phan so.
     *
     * @param sol phan so
     * @return tra ve hieu
     */
    public Solution subtract(Solution sol) {
        if (this.denominator == 0 || sol.getDenominator() == 0) {
            return reduce();
        }
        this.numerator = numerator * sol.getDenominator() - denominator * sol.getNumerator();
        this.denominator = denominator * sol.getDenominator();
        return reduce();
    }

    /**
     * nhan hai phan so.
     *
     * @param sol phan so
     * @return tra ve phep nhan
     */
    public Solution multiply(Solution sol) {
        if (this.denominator == 0 || sol.getDenominator() == 0) {
            return reduce();
        }
        this.numerator = numerator * sol.getNumerator();
        this.denominator = denominator * sol.getDenominator();
        return reduce();
    }

    /**
     * chia hai phan so.
     *
     * @param sol phan so
     * @return tra ve phep chia
     */
    public Solution divide(Solution sol) {
        if (this.denominator == 0 || sol.getNumerator() == 0
                || sol.getDenominator() == 0) {
            return reduce();
        }
        this.numerator = numerator * sol.getDenominator();
        this.denominator = denominator * sol.getNumerator();
        return reduce();
    }

    /**
     * so sanh hai phan so.
     *
     * @param obj so sanh hai doi tuong
     * @return tra ve ket qua
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            Solution sol = new Solution(numerator, denominator);
            sol = reduce();
            if (this.numerator == other.getNumerator()
                    && this.denominator == other.getDenominator()
                    && this.denominator != 0) {
                return true;
            }
        }
        return false;
    }

}
