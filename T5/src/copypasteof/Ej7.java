package copypasteof;
import java.util.Scanner;
import java.util.Arrays;

public class Ej7 {
/*		// crear valor random
			tabla[i] = num;
			num++;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[10];
		int num = 0,valor=0;
		String letra;
		Scanner sc= new Scanner(System.in);
		System.out.println("seleccione una opción: ");
		letra=sc.next();
		while(letra.equals("b")) {
			for(;valor<tabla.length;) {
				num=sc.nextInt();
				valor=sc.nextInt();
				}
			}
		System.out.println(Arrays.toString(tabla));
		}

}
