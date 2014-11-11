package model;

import expr.Environment;
import expr.Expr;

public class ExprSlot implements Slot {
	Expr expr;
	private boolean calculated;
	
	public ExprSlot(Expr expr){
		this.expr=expr;
	}
	
	@Override
	public double value(Environment env) throws XLCircularException {
		if(calculated){
			throw new XLCircularException();
		}
		calculated=true;
		double value = expr.value(env);
		calculated=false;
		return value;
	}

}
