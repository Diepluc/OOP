public class Addition extends BinaryExpression {

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return "(" + left + " + " + right + ")";
    }

    /**
     * cong.
     */
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

}
