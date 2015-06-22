package Exercise;

import java.math.BigDecimal;

public class ExerciseOne {

	//Exercise 1.1
	public static void forAdd(BigDecimal n){
		BigDecimal add = new BigDecimal(0);
		BigDecimal mutil = new BigDecimal(1);
		BigDecimal temp = new BigDecimal(1.0);
		BigDecimal div = new BigDecimal(0);
		for(int i = 1; i <= n.intValue(); i++){
			add = add.add(new BigDecimal(i));
			mutil = mutil.multiply(new BigDecimal(i));
			div = div.add(temp.divide(new BigDecimal(i),8, BigDecimal.ROUND_HALF_UP ));
			
		}
		System.out.println(add);
		System.out.println(mutil);
		System.out.println(div);
	}
	
	//Exercise 1.2
	public static void whileAdd(){
		int wsum = 0;
		int w = 1;
		int dsum = 0;
		int d = 1;
		while(wsum < 10000){		
			w++;
			wsum = ((1 + w) * w) /2;
		}
		
		do{
			d++;
			dsum = ((1 + d) * d) / 2;
		}while(dsum < 20000);
			
		System.out.println(w);
		System.out.println(d);
	}
	
	//Exercise 1.3
	public static void array(){
		int[] reverse = {
			2,1,4,2,1,6,4,8,4,2	
		};
		
		for(int i : reverse){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = reverse.length-1; i >= 0; i--){
			System.out.print(reverse[i] + " ");
		}
		System.out.println();
	}
	
	//Exercise 1.4
	public static void hierachy(int n){
		BigDecimal sum = new BigDecimal(0);
		for(int i = 1; i <= n ; i++){
			sum = sum.add(mutil(i)); 
		}
		System.out.println(sum);
	}
	public static BigDecimal mutil(int n){
		BigDecimal result = new BigDecimal(1);
		for(int i = 1; i <=n; i++){
			result = result.multiply(new BigDecimal(i));
		}
		return result;
	}
	
	//Exercise 1.5
	public static void waterLost(){
		int lostday = 0;
		int water = 1000;
		while(water > 50){
			water /= 2;
			lostday++;
		}
		System.out.println(lostday);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forAdd(new BigDecimal(5));
		whileAdd();
		array();
		hierachy(5);
		waterLost();
	}

}
