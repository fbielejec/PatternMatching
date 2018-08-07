package io.patternmatching.interpreter;

public class AnyExpression implements Expression {

	@Override
	public boolean matches(Expression context) {
		return true;
	}

}
