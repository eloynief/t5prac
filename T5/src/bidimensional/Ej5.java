package bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//
		int[][] nums= new int[6][5];
		
		//crear variables
		int i=0, j=0, sumafila=0;
		
		//para crear los valores en esto
		for(i=0; i<6;i++) {
			//
			for (j=0; j<5;j++) {
				
				//el valor random
				nums[i][j]=(int) (Math.random()*100+1);
				
				
			}
			
		}
		//para esto se usa deep to string
		System.out.println(Arrays.deepToString(nums));
	}

}
