package ejprac;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacer el nextint
		//se van guardando los valores
		//si uno de esos valores es mayor que el max o menor que el min se sustituyen
		//despues de todo
		Scanner sc= new Scanner(System.in);
		int[] nums= new int[10];
		int max=1/*valor más pequeño*/,min=900/*valor más grande*/;
		
		for(int valor=0;valor<nums.length;valor++) {
			int num=sc.nextInt();
		
			/*for(int value:nums) {
				System.out.println(value);
			}
			*/
			if(num>max){
			max=num;
			}
			if(num<min){
			min=num;
			}
			
			
		}
	}

}
