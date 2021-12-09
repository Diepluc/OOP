public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return "(" + left + " - " + right + ")";
    }

    /**
     * tru.
     */
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
