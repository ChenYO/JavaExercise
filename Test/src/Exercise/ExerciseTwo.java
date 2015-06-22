package Exercise;

public class ExerciseTwo {

	//Exercise 2.1
	public static boolean isLeapYear(int year){
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400) ==0){
			System.out.println("It's leap year");
			return true;
		}else{
			System.out.println("It's not leap year");
			return false;
		}
	}
	
	//Exercise 2.2
	public static void leapYearCalculate(int year){
		int leapyears = 0;
		if(year < 2015){
			for(int i = year; i <= 2015; i++){
				if(isLeapYear(i)){
					leapyears++;
				}
			}
		}else{
			for(int i = year; i >= 2015; i--){
				if(isLeapYear(i)){
					leapyears++;
				}
			}
		}
		
		System.out.println(leapyears);
	}
	
	//Exercise 2.3
	public static boolean isTriangle(int x ,int y, int z){
		if(((x + y) <= z) || ((x + z) <= y) || ((y + z) <= x)){
			System.out.println("It's not triangle");
			return false;
		}
		System.out.println("It's triangle");
		return true;
	}
	
	//Exercise 2.4
	public static boolean isPrime(int n){
		if(n < 2){
			System.out.println("It's not prime");
			return false;
		}else{
			int diviser = 0;
			for(int i = 2; i < n; i++){
				if((n % i) == 0){
					diviser++;
				}
			}
			if(diviser > 1){
				System.out.println("It's not prime");
				return false;
			}else{
				System.out.println("It's prime");
				return true;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isLeapYear(2015);
		isLeapYear(1980);
		isLeapYear(2000);
		leapYearCalculate(1980);
		isTriangle(2, 3, 4);
		isPrime(131);
	}

}
