package Exercise;

abstract class Series{
	protected int curItem;
	protected int firstItem;
	
	public Series(){
		firstItem = 0;
	}
	
	protected int first(){
		curItem = firstItem;
		return curItem;
	}
	
	protected abstract int next();
	
	protected void print(int index){
		System.out.print(firstItem + " ");
		for(int i = 1; i < index; i++){
			System.out.print(next() + " ");
		}
		System.out.println();
	}
}

//单畉计
class AP extends Series{

	protected int diff;
	
	public AP(){
		firstItem = 0;
		diff = 1;
		curItem = first();
	}
	
	public AP(int first){
		firstItem = first;
		diff = 1;
		curItem = first();
	}
	
	public AP(int first, int diff){
		firstItem = first;
		this.diff = diff;
		curItem = first();
	}
	@Override
	protected int next() {
		curItem = curItem + diff;
		return curItem;
	}
	
}

//单ゑ计
class GS extends Series{
	protected int diff;
	public GS(){
		firstItem = 1;
		diff = 1;
		curItem = first();
	}
	
	public GS(int first){
		firstItem = first;
		diff = 1;
		curItem = first();
	}
	
	public GS(int first, int diff){
		firstItem = first;
		this.diff = diff;
		curItem = first();
	}
	@Override
	protected int next() {
		curItem = curItem * diff;
		return curItem;
	}
	
}

//禣ん计
class Fibonacii extends Series{
	protected int next, prev = 0;
	
	public Fibonacii(){
		firstItem = 1;
		next = 1;
	}
	
	protected int first(){
		curItem = firstItem;
		return curItem;
	}
	
	@Override
	protected int next() {
		curItem = prev + next;
		prev = next;
		next = curItem;
		return curItem;
	}
	
}
public class ExerciseFour {

	public static void main(String[] args) {
		AP ap = new AP();
		AP ap2 = new AP(5);
		AP ap3 = new AP(3, 2);
		System.out.println("单畉计");
		ap.print(6);
		ap2.print(6);
		ap3.print(6);
		
		GS gs = new GS();
		GS gs2 = new GS(5);
		GS gs3 = new GS(3, 2);
		System.out.println("单ゑ计");
		gs.print(6);
		gs2.print(6);
		gs3.print(6);
		
		Fibonacii fi = new Fibonacii();
		System.out.println("禣ん计");
		fi.print(10);
		
	}

}
