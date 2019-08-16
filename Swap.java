//time taking 40 to 45 minutes

package gedeon;

//import java.io.*;
//import java.math.*;
import java.util.*;


public class Swap {
	
	static int minimumSwaps(int[] arr) {
		int swap=0;
		boolean visited[]  = new boolean [arr.length];
		
		for(int i = 0;i <arr.length; i++){
			int j = i, cycle = 0;

			while(!visited[j]){
				visited[j] = true;
				j = arr[j] - 1;
				cycle++;
			}
         
			if(cycle!=0)
				swap+=cycle-1;

		}
		return swap;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int res = minimumSwaps(arr);
		System.out.println(res);
		scanner.close();
	}




	}


