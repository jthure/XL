package gui;

import java.awt.Color;
import javax.swing.JTextField;

public class Editor extends JTextField {
	CurrentSlot currentSlot;
    public Editor(CurrentSlot currentSlot) {
    	this.currentSlot=currentSlot;
        setBackground(Color.WHITE);
    }
    private void putSlot(){
    	String key= currentSlot.getCurrentName();
    	String value= getText();
    	
    }
}