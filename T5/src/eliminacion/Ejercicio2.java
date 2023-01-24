package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// la tabla de 20
		int[] nums = new int[10];
		// valor que estara puesto en la tabla y aumentara
		int valor = 0;
		// el valor random
		int num = 0;
		String opcion;

		/*
		 * //el int que busca los valores en la tabla int res=Arrays.binarySearch(nums,
		 * valor);
		 */
		System.out.println("elige");
		// generacion de valores en el for
		for (int i = 0; i < nums.length; i++) {
			// crear valor random
			num = (int) (Math.random() * 100 + 1);
			nums[i] = num;
			// System.out.println(num);
		}

		opcion = sc.next();

		//
		while (valor < nums.length) {
			// si el int que escoge uno de los valores de la tabla, la tabla se hace más
			// pequeña

			if (opcion == "a") {
				System.out.println(Arrays.toString(nums));
			} 
			else if (opcion == "b") {
				System.arraycopy(nums, valor + 1, nums, valor, nums.length - valor - 1);
				nums = Arrays.copyOf(nums, nums.length - 1);
			} 
			else if (opcion == "c") {
				break;
			}

		}
		System.out.println("salistes System.out.println(Arrays.toString(nums));");
	}

}
