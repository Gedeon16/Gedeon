package gedeon;
import java.util.Scanner;

public class Timetable {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n = s.nextInt();
		
		for(int i =1; i <= 10; i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}

	}

}
