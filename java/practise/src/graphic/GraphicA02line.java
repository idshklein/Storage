package graphic;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
public class GraphicA02line {
	public static void main(String[]args){
	JFrame a=new JFrame();
	a.add(new tr());
	a.setDefaultCloseOperation(1);
	a.setSize(200,200);
	a.setVisible(true);
	a.setLocationRelativeTo(null);
	}
}
class tr extends JPanel{
	protected void paintComponent(Graphics a){
		super.paintComponent(a);
		a.drawLine(1,1,55,55);
		a.drawString("shit",1,99);
	}
}