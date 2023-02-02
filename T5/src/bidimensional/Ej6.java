package bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		//
		int[][] nums= new int[6][10];
		int minx=Integer.MAX_VALUE;
		int maxx=0;
		int miny=Integer.MAX_VALUE;
		int maxy=0;
		//crear variables
		int i=0, j=0, sumafila=0;
		int randomx=0;
		int randomy=0;
		
		//para crear los valores en esto
		for(i=0; i<6;i++) {
			//
			randomx=(int)(Math.random()*1000+1);
			for (j=0; j<10;j++) {
				randomy=(int)(Math.random()*1000+1);
				//el valor random
				nums[i][j]=randomy;
				//cada vez que el numero sea mas pequeño, la x y la y minimas
				// cambian a la i y j respectivamente
				if(randomy<miny) {
					miny=randomy;
				}
				if(randomy>maxy) {
					maxy=randomy;
				}
				
			}
			if(randomx<minx) {
				minx=randomx;
			}
			if(randomx>maxx) {
				maxx=randomx;
			}
			
		}
		//para esto se usa deep to string
		System.out.println(Arrays.deepToString(nums));
		System.out.println("Los de y");
		System.out.println(maxy);
		System.out.println(miny);
		System.out.println("Los de x");
		System.out.println(maxx);
		System.out.println(minx);
		//crear el min
		//crear el max
		//crea variable para el minimo y el maximo
	}

}
