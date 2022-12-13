package ejprac;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] nums= new int[8];
		System.out.println("So");
		for(int sube=0;sube<nums.length;sube++) {
			int num=sc.nextInt();
			if (num%2==1) {
				System.out.println("Es impar");
			}
			else {
				System.out.println("Es par");
			}
			}
		
		
	}
}
