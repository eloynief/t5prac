package copypasteof;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[]= new int [15];
		//
		int a[]=new int [15];
		int b[];
		int resta=1,resta2=1, guardar=0;
		System.out.println("Introduzca 5 numeros por el teclado: ");
		Scanner sc= new Scanner(System.in);
		//crear los 15 valores que queremos poner
		for (int i=0; i<tabla.length;i++) {
			int num=sc.nextInt();
			tabla[i]=num;
			
			if(i>4) {
				guardar=tabla[tabla.length-resta];
				a[resta2]=guardar;
				resta++;
				resta2++;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
