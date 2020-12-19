/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionevalue;

import java.util.Stack;

/**
 *
 * @author Rabi Siddique
 */
public class ExpressionEvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		String tokenString = "4 3 2 - 1 + *";
		Stack stack = new Stack();
                int result = 0;

		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList) {
			if (isOperator(s)) {
				AbstractExpression rightExpression = (NumberExpression) stack.pop();
				AbstractExpression leftExpression = (NumberExpression) stack.pop();
				AbstractExpression operator = getOperatorInstance(s, leftExpression,rightExpression);
				result = operator.interpret();
				stack.push(new NumberExpression(result));
                               
			} else {
				AbstractExpression i = new NumberExpression(s);
				stack.push(i);
			}
                       
		}
                System.out.println("Result:"+result);
                
    }  

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}

	public static AbstractExpression getOperatorInstance(String s, AbstractExpression left,
			AbstractExpression right) {
		switch (s) {
		case "+":
			return new SumExpression(left, right);
		case "-":
			return new SubstractExpression(left, right);
		case "*":
			return new MultiplyExpression(left, right);
		}
		return null;
	}

    
}
