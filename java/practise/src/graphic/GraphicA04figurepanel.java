package graphic;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
public class GraphicA04figurepanel {
	public static void main(String[]args){
		JFrame a=new JFrame();
		FigurePanel n=new FigurePanel(3,true);
		a.add(n);
		a.setDefaultCloseOperation(1);
		a.setSize(400,400);
		a.setLocationRelativeTo(null);
		a.setVisible(true);
	}
}
class FigurePanel extends JPanel{
	public static final int LINE=1;
	public static final int RECTANGLE=2;
	public static final int ROUND_RECTANGLE=3;
	public static final int OVAL=4;
	private int type;
	private boolean filled;
	
	public FigurePanel(){
		this(1,false);
	}
	public FigurePanel(int i){
		this(i,false);
	}
	public FigurePanel(int i,boolean b){
		this.filled=b;
		this.type=i;
	}
	
	public int getType(){
		return this.type;
	}
	public void setType(int i){
		this.type=i;
		repaint();
	}
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean b){
		this.filled=b;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		
		int w =this.getWidth();
		int h=this.getHeight();
		
		switch(this.type){
		case LINE:
			g.setColor(new java.awt.Color(3));
			g.drawLine(10, 10, w-10, h-10);
			g.drawLine(w-10, 10,10, w-10);
			break;
		case RECTANGLE:
			if(!filled)
			g.drawRect((int)(0.1*w),(int)(0.1*h),(int)(0.8*w),(int)(0.8*h));
			else{
				g.setColor(new java.awt.Color(3));
				g.fillRect((int)(0.1*w),(int)(0.1*h), (int)(0.8*w),(int)(0.8*h));
			}
		case ROUND_RECTANGLE:
			if(filled){
				g.setColor(new java.awt.Color(3));
				g.fillRoundRect((int)(0.1*w),(int)(0.1*h),(int)(0.8*w),(int)(0.8*h),(int)(0.1*w), (int)(0.1*h));
			}
			else
			g.drawRoundRect((int)(0.1*w),(int)(0.1*h),(int)(0.8*w),(int)(0.8*h), (int)(0.1*w), (int)(0.1*h));
		case OVAL:
			if(filled){
				g.setColor(new java.awt.Color(3));
				g.fillRoundRect((int)(0.1*w),(int)(0.1*h),(int)(0.8*w),(int)(0.8*h), (int)(0.1*w), (int)(0.1*h));
			}
			else
			g.drawRoundRect((int)(0.1*w),(int)(0.1*h),(int)(0.8*w),(int)(0.8*h), (int)(0.1*w), (int)(0.1*h));
	}
	}
}