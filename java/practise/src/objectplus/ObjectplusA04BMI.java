package objectplus;
import java.util.Scanner;
public class ObjectplusA04BMI {
	public static void main(String[]args){
	BMI a=new BMI("HT",18,1.76,74);
	System.out.println(a.getstatus());
	}
	
}
class BMI{
	private String name;
	private int age;
	private double weight;
	private double height;
	private static final double hehe=0;
	
	public BMI(String name,int age,double height,double weight){
		this.age=age;
		this.height=height;
		this.name=name;
		this.weight=weight;
	}
	public BMI(String name,double height,double weight){
		this.height=height;
		this.name=name;
		this.weight=weight;
	}
	public double getBMI(){
		return Math.round((this.weight/(this.height*this.height))*100)/100.0;
	}
	public String getstatus(){
		double m=getBMI();
		if(m<16)
			return "seriously underweight!!";
		else if(m<18)
			return "underweight!";
		else if(m<24)
			return "normal weight";
		else if(m<29)
			return "overweight!";
		else if(m<35)
			return "seriously overweight!!";
		else
			return "gravely overweight!!!";
	}
	public double getweight(){
		return this.weight;
	}
	public double getheight(){
		return this.height;
	}
	public String getname(){
		return this.name;
	}
	public int getage(){
		return this.age;
	}
}