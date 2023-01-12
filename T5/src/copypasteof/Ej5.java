package copypasteof;

import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {
		int tabla[]= new int [10];
		//variables
		int a[]=new int [10];
		int b[]=new int [10];
		int ordentabla[]=new int [10];
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
				a[par]=num;
				par++;
			}
			//si el numero num es impar
			if (num%2==1){
				b[impar]=num;
				impar++;
			}
			
		}
		//print de la tabla par(no necesario)
		System.out.println(Arrays.toString(a));
		//tabla impar(no necesario)
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(tabla));
	}

}