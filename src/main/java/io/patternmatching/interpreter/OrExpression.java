package io.patternmatching.interpreter;

public class OrExpression implements Expression {

	private Expression expr1;
	private Expression expr2;

	public OrExpression(Expression expr1, Expression expr2) { 
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean matches(Expression context) {
		return expr1.matches(context) || expr2.matches(context);
	}

}
