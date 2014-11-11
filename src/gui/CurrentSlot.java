package gui;

import java.awt.Color;

public class CurrentSlot {
	private SlotLabel currentSlot = new SlotLabel("hej", this);
	private CurrentLabel currentLabel;
	
	public CurrentSlot(CurrentLabel currentLabel){
		this.currentLabel = currentLabel;
	}
	
	public void setCurrent(SlotLabel newCurrentSlot){
		currentSlot.setBackground(Color.WHITE);
		newCurrentSlot.setBackground(Color.YELLOW);
		currentSlot=newCurrentSlot;
		currentLabel.setCurrentLabel(currentSlot.name());
	}
	public String getCurrentName(){
		return null;
	}
}
