package bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//
		int[][] nums= new int[4][5];
		//crear variables
		int i=0, j=0, sumafila=0;
		System.out.println("e");
		for(i=0; i<4;i++) {
			//primero ponemos los valores a la tabla
			for (j=0; j<5;j++) {
				
				//el valor random
				nums[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println(Arrays.deepToString(nums));
		
	}

}
