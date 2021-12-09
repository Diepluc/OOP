public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString() {
        return "(" + expression.toString() + ")" + " ^ 2";
    }

    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
