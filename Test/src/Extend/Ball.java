package Extend;
import Exercise.ExerciseFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ball {

	int num;
	int num2;
	
	public Ball(int x){
		num = x;
		num2 = 4;
	}
	
	public int getNum(){
		return num2;
	}
	public String toString(){
		return this.num+ " ";
	}
	
	public boolean equals(Ball b){
		return this.num == b.num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(5);
		Ball ball2 = new Ball(10);
		Ball ball3 = new Ball(5);
		System.out.println(ball.equals(ball2));
		System.out.println(ball.equals(ball3));
		System.out.println(ball);
		System.out.println(ball2);
		
		List<Human> list = new ArrayList<Human>();
//		list.add("Tom");
//		list.add("Chen");
//		list.add(new Ball(5));
//		Ball ba = (Ball) list.get(2);
//		System.out.println(list.get(0));
//		System.out.println(ba.getNum());
		list.add(new Human("Ryan"));
		list.add(new Human("Scott"));
		list.add(new Human("John"));
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getName());
		}
		
		Set set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		Map m = new HashMap();
		m.put("I28883", "Ryan");
		m.put("I2311", "Susan");
		m.put("I28831", new Human("Tom"));
		Iterator it = m.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();			
			
			if(m.get(key) instanceof Human){
				Human h = (Human)m.get(key);
				System.out.println(h.getName());
			}else{
				String str = (String) m.get(key);
				System.out.println(str);
			}
			
			
		}
	}

}
