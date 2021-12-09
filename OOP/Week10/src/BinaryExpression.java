public abstract class BinaryExpression extends Expression {
    Expression left;
    Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract String toString();

    public abstract double evaluate();
}
