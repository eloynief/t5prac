package copypasteof;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int tabla[]= new int [20];
		//variables
		int pares[];
		int impares[];
		int ordentabla[]=new int [20];
		int par=0;
		int impar=0;
		
		//pedir mensaje
		System.out.println("los 20 numeros: ");
		//para ponerle los valores a la tabla principal
		for (int i=0; i<tabla.length;i++) {
			//crear valor random
			int num=(int)(Math.random()*100+1);
			tabla[i]=num;
			System.out.println(num);
			//si el numero salido num de la tabla es par
			if (num%2==0){
				//pares[par]=num;
				par++;
				
			}
			//si el numero num es impar
			if (num%2==1){
//				impares[impar]=num;
				impar++;
			}
			
		}
		pares = new int[];
		
		
		
		//print de la tabla par(no necesario)
		System.out.println(Arrays.toString(pares));
		//tabla impar(no necesario)
		System.out.println(Arrays.toString(impares));
		System.out.println(Arrays.toString(tabla));
	}

}
