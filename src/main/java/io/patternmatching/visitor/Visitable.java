package io.patternmatching.visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}
