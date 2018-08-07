package io.patternmatching.interpreter;

public class TerminalExpression implements Expression {

	public boolean value;

	public TerminalExpression(boolean value) {
		this.value = value;
	}

	@Override
	public boolean matches(Expression context) {

		if(context instanceof TerminalExpression) {
			return ((TerminalExpression) context).value == this.value;
		}

		return context.matches(this);
	}

}
