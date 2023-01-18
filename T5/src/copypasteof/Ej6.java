package copypasteof;

import java.util.Arrays;

public class Ej6 {
//done
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[100];
		int tablainv[] = new int[100];
		int num = 1;
		int numinv=1;
		// pedir mensaje
		System.out.println("los 20 numeros: ");
		// para ponerle los valores a la tabla principal
		for (int i = 0; i < tabla.length; i++) {
		// crear valor random
		tabla[i] = num;
		num++;
		}
		for (int j =99; j>=0; j--) {
		tablainv[j] = numinv;
		numinv++;
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tablainv));
	}

}
