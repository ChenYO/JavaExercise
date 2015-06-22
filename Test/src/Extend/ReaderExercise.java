package Extend;
import java.io.*;
public class ReaderExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Using FileInputStream
			FileInputStream f = new FileInputStream("file/Test.txt");
			DataInputStream di = new DataInputStream(f);
			System.out.println(di.readLine());
			f.close();
			
			FileInputStream f2 = new FileInputStream("file/Test.txt");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int ch = 0;
			while((ch = f2.read()) != -1){
				bos.write(ch);
			}
			
			byte[] data = bos.toByteArray();
			String str = new String(data);
			System.out.println(str);
			
			f2.close();
			bos.close();
			
			//Using FileReader
			FileReader file = new FileReader("file/Test.txt");
			BufferedReader br = new BufferedReader(file);
			
			while(br.ready()){
				System.out.println(br.readLine());
			}
			
			file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
