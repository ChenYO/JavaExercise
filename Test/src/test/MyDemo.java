package test;

import java.math.BigDecimal;
import java.util.*;

class Test{
	static {System.out.println("1");}
	{
		System.out.println("3");
	}
	private int x = getValue();
	public Test(){
		System.out.println("5");
	}
	
	public int getValue(){
		System.out.println("7");
		return 1;
	}
}
public class MyDemo extends Test{
	
	static{System.out.println("2");}
	{
		System.out.println("6");
	}
	private int x = super.getValue();
	public MyDemo(){
		System.out.println("8");
	}
	
	public int getValue(){
		System.out.println("4");
		return 1;
	}
	public static void testMe(int i){
		System.out.println(i);

		System.out.println(i);
	}
	
	 void testMe(String s){
		System.out.println(s);
	}
	public static void testMe(int i ,String s){
		System.out.println(i + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDemo demo = new MyDemo();

	}

}
