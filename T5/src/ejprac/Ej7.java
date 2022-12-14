package ejprac;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int[] nums= new int[10];
		System.out.println("pon");
		//va guardando valor por cada que sube el sube
		//hasta que alcanza el valor de la altura
		for(int sube=0;sube<nums.length;sube++) {
			
			int num=sc.nextInt();
			int bajada=sube;																																																//     nothing //guardar valores que 
		//si el valor de sube es más grande que tal cosa se hace print del numero que pones
		//si el sube es igual al nums lenght, se hace print de el nums[sube] pero va bajando porque el valor ya estará guardado
			/*while(bajada<nums.length||bajada>0) {
				System.out.println(nums[num]);
				bajada--;
			} no */
			
			
		}
		
	}

}
