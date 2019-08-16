///time taken 30minutes

package gedeon;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n = 0, m = 0, p = 1;
		
		System.out.println("Fibonacci ");
		
		for (int e = 1; e <= 100; e++)
		{
			n = m;
			m = p;
			p = n + m;
			
			System.out.println( n+ "");
		}
	   
	}

}
