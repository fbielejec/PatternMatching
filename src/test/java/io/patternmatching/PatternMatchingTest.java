package io.patternmatching;

import io.patternmatching.interpreter.AnyExpression;
import io.patternmatching.interpreter.Expression;
import io.patternmatching.interpreter.TerminalExpression;
import io.patternmatching.visitor.Branch;
import io.patternmatching.visitor.Matcher;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PatternMatchingTest extends TestCase {

	public PatternMatchingTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite( PatternMatchingTest.class );
	}

	public void testPatternMatching() {
		Expression T = new TerminalExpression(true);
		Expression F = new TerminalExpression(false);
		Expression _ = new AnyExpression();

		Expression[] pattern = new Expression[] {F, T, F};

		Branch b1 = new Branch(new Expression[] {_, F, T});
		Branch b2 = new Branch(new Expression[] {F, T, _});
		Branch b3 = new Branch(new Expression[] {_, _, F});
		Branch b4 = new Branch(new Expression[] {_, _, T});

		Branch[] branches = new Branch[]{b1, 
				b2, 
				b3, 
				b4
		};

		Matcher m = new Matcher(pattern, branches);

		assertEquals("Branch with index 1 matches the pattern", 1, m.match());
	}

}
