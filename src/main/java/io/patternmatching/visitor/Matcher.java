package io.patternmatching.visitor;

import io.patternmatching.interpreter.Expression;

public class Matcher {

	private Expression[] pattern;
	private Branch[] branches;

	public Matcher(Expression[] pattern, Branch... branches) {
		this.pattern = pattern;
		this.branches = branches;
	}
	
	public int match() {

		BranchVisitor v = new BranchVisitor(pattern);
		int i = 0;
		for(Branch b : branches) {
			
			System.out.println();
			System.out.println("On branch: " + b.toString());
			
			if(v.visit(b)) {
				return i;
			}
			i++;
		}
				
		return -1;
	}
	
}
