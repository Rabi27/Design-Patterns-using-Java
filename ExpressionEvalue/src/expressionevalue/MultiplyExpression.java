/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionevalue;

/**
 *
 * @author Rabi Siddique
 */
public class MultiplyExpression implements AbstractExpression {

	AbstractExpression leftExpression;
	AbstractExpression rightExpresion;

	public MultiplyExpression(AbstractExpression leftExpression,
			AbstractExpression rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {

		return leftExpression.interpret() * rightExpresion.interpret();
	}

}