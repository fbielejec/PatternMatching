package io.patternmatching.visitor;

import io.patternmatching.interpreter.Expression;

public class Branch implements Visitable {

	Expression[] pattern;

 	public Branch(Expression[] pattern) {
 		this.pattern = pattern;
	}

	public Expression[] getPattern() {
		return pattern;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
