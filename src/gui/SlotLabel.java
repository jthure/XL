package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer{
	private String name;
	CurrentSlot currentSlot;
    public SlotLabel(String name,CurrentSlot currentSlot) {
        super("                    ", Color.WHITE, RIGHT);
        this.name=name;
        this.currentSlot=currentSlot;
        addMouseListener(this);
    }
    

	@Override
	public void mouseClicked(MouseEvent arg0) {
		currentSlot.setCurrent(this);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	public String name(){
		return name;
	}
}