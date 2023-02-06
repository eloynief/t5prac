package funciones;

import java.util.Scanner;

public class Mainej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while que el valor sea mayor que algo ese algo cambia de valor a ese numero
		Scanner sc= new Scanner(System.in);
		int[] tabla= new int [5];
		int valor = 0;
		int num=0;
		System.out.println("introduce");
		for(int i=0;i<tabla.length;i++) {
		//
		tabla[num]=sc.nextInt();
		//mientras que el valor puesto en la tabla es mayor que el valor, hace esto
			if(tabla[num]>valor) {
				valor=tabla[num];
			}
		System.out.println(valor);
		}
	}

}
