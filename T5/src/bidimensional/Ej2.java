package bidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {
		int i=0,j=0;
		int aux;
		Scanner sc= new Scanner(System.in);
		
		System.out.println();
		int[] [] num= new int[11] [11];
		int multiplicador;
		for(i=1; i<10;i++) {
			for (j=1; i<10;j++) {
				
				num[i][j]=2;
				
				
			}
			num[i][j]=num[j][i];
			aux=num[j][i];
			
			System.out.println(Arrays.toString(num));
			
		}
		
	}

}
