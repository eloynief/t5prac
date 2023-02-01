package bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		//
		int[][] nums= new int[6][10];
		int min=Integer.MAX_VALUE;
		int max=0;
		//crear variables
		int i=0, j=0, sumafila=0;
		
		//para crear los valores en esto
		for(i=0; i<6;i++) {
			//
			for (j=0; j<10;j++) {
				
				//el valor random
				nums[i][j]=(int) (Math.random()*1000+1);
				//cada vez que el numero sea mas pequeño, la x y la y minimas
				// cambian a la i y j respectivamente
				
			}
			
		}
		//para esto se usa deep to string
		System.out.println(Arrays.deepToString(nums));
		
		//crear el min
		//crear el max
		//crea variable para el minimo y el maximo
	}

}
