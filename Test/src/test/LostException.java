package test;


class Lost extends Exception{
	
}
public class LostException{

	public static void main(String[] args) throws Lost {
		// TODO Auto-generated method stub
		try{
			System.out.println("Lost money");
			throw new Lost(); 
		}catch(Lost e){
			System.out.println("Can't help");
			e.printStackTrace();
		}finally{
			//always close connection here
			System.err.println("Die!");
		}
	}

}

//RuntimeException, it always detects whether there are some bugs
//when program runs, we can throw it by myself
//if we find there are some bugs.