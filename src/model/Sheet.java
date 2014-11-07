package model;

import java.util.Map;
import java.util.Observable;

import expr.Environment;

public class Sheet extends Observable implements Environment {
	private Map<String,Slot> slots;
	@Override
	public double value(String name) {
		return slots.get(name).value(this);
	}

}
