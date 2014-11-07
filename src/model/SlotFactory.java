package model;

import java.io.IOException;

import expr.Expr;
import expr.ExprParser;

public class SlotFactory {
	
	public static Slot build(String content){
		if(content.startsWith("#")){
			return new TextSlot(content.substring(1));
		}
		else{
			ExprParser exprParser = new ExprParser();
			Expr expr=null;
			try {
				expr = exprParser.build(content);
			} catch (IOException e) {
				System.out.println("Failed to build expression: "+e.getMessage());
				e.printStackTrace();
			}
			return new ExprSlot(expr);
		}
	}
}
