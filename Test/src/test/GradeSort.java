package test;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String getName(){
		return name;
	}
	
	public int getScore(){
		return score;
	}
	
	public String toString(){
		return getName() +" " + getScore();
	}
}

class ScoreSorting{
	Map<String, Integer> scoreSort = new HashMap<String, Integer>();
//	Map<String, Integer> treeSort = new TreeMap<String, Integer>();
	public void sort(Student []stu){
		for(Student s : stu){
			scoreSort.put(s.getName(), s.getScore());
//			treeSort.put(s.getName(), s.getScore());
		}
		List<Map.Entry<String, Integer>> list = 
				new ArrayList<Map.Entry<String, Integer>>(scoreSort.entrySet());
		
		Comparator<Map.Entry<String, Integer>> comparator =  
				new Comparator<Map.Entry<String, Integer>>(){

					public int compare(Map.Entry<String, Integer> com1,
							Map.Entry<String, Integer> com2) {
						return com2.getValue().compareTo(com1.getValue());
					}
			
		};
		
		Collections.sort(list,  comparator);
		System.out.println(list);
//		System.out.println(treeSort);
	}
}

public class GradeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreSorting scoresort = new ScoreSorting();
		Student[] st = { 
		        new Student("¨ÌµY",60),
		        new Student("»«©Ôµn",70),
		        new Student("Ä¼Æ{¬W",50),
		        new Student("±i´f©f",90),
		        new Student("·¨¥àµY",85)		 
		        };

		scoresort.sort(st);
		
		for(Student str: st){
			System.out.println(str);
		}
		
	}
}
