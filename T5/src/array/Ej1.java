package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el numero n:");
		int n=sc.nextInt();
		int[] nums= new int[n];
		
		
		
			System.out.println("Escribe uno de los números de m: ");
			int m=sc.nextInt();
			Arrays.fill(nums, m);
			System.out.println(Arrays.toString(nums));
		
		
		
	}

}
