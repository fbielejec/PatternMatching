package io.patternmatching.visitor;

import io.patternmatching.interpreter.Expression;

public class BranchVisitor implements Visitor {

	Expression[] pattern;	

	public BranchVisitor(Expression[] pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean visit(Branch branch) {

		if(branch.getPattern().length != this.pattern.length) {
			throw new RuntimeException("Patterns should be of equal length");
		}

		for(int i = 0; i < pattern.length; i++) {

			System.out.println();			
			System.out.println("pattern " + pattern[i].toString() + " branch " + branch.getPattern()[i].toString() + " matches? " + pattern[i].matches(branch.getPattern()[i]));

			if(!pattern[i].matches(branch.getPattern()[i])) {
				return false;
			}

		}

		return true;
	} 

}
