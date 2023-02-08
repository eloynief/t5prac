package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public int man(int t[]) {
		// TODO Auto-generated method stub
		//while que el valor sea mayor que algo ese algo cambia de valor a ese numero
		Scanner sc= new Scanner(System.in);
		int valor = 0;
		int num=0;
		for(int i=0;i<t.length;i++) {
			//
			t[num]=sc.nextInt();
			//mientras que el valor puesto en la tabla es mayor que el valor, hace esto
			if(t[num]>valor) {
				valor=t[num];
			}
		System.out.println(valor);
		}
		return valor;
	}
	
	public static void main(String[] args) {
		int num;
		
		man(num);
		
	}
	

}
