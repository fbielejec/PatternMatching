package io.patternmatching.interpreter;

public interface Expression {
	public boolean matches(Expression context);
}
