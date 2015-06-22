package Extend;


interface Attack{
	void fire();
}
class Aircraft{
	public void takeoff(){
		System.out.println("Aircraft takeoff");
	}
	
	public void land(){
		System.out.println("Aircraft land");
	}
}

class Flight extends Aircraft implements Attack{
	public void fire(){
		System.out.println("Flight attack!");
	}
}

class Car{
	public void forward(){
		System.out.println("Car goes forward");
	}
	
	public void back(){
		System.out.println("Car goes  back");
	}
}

class Tank extends Car implements Attack{
	public void fire(){
		System.out.println("Tank attack!");
	}
}

public class MainProcess {

	public static void process(Attack attack){
		attack.fire();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flash01 = new Flight();
		Flight flash02 = new Flight();
		Tank tank = new Tank();
		
		process(flash01);
		process(flash02);
		process(tank);
		
	}

}
