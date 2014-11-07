package model;

import expr.Environment;
import expr.Expr;

public class ExprSlot implements Slot {
	Expr expr;
	
	public ExprSlot(Expr expr){
		this.expr=expr;
	}
	
	@Override
	public double value(Environment env) {

		return expr.value(env);
	}

}
