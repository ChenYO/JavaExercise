package Extend;

import java.io.UnsupportedEncodingException;


public class FindOut {

	public int find(Human[] obj, Human human){
		int pos = 0;
		for(int i = 0; i < obj.length; i++){
			if(human.getName().equals(obj[i].getName())){
				pos = i+1;
			}
		}
		System.out.println("Find no person!");
		return pos;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Human[] obj = {
				new Human("½²¨ÌµY"),
				new Human("»«©Ôµn"),
				new Human("­Û´µµá"),
			    new Human("»¯¥É¬W"),
				new Human("·¨©ÓµY")
		};
		
		FindOut fo = new FindOut();
		int pos = fo.find(obj, new Human("»«©Ôµn"));
		System.out.println(pos);
		
		//Encode
		System.out.println("test".getBytes("Big5"));
		//Decode
		System.out.println(new String("test".getBytes("UTF-8"),"UTF-8"));
	}

}
