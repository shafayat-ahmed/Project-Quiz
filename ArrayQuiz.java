//Simple Array example to store and retrieve from 100 numbers
import java.util.Random;
public class ArrayQuiz {

	public static void main(String[] args){ 
		Random rand = new Random();
		
		int[] a= new int[100];
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(100)+1;
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	}

}
