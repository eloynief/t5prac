package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//la tabla de 20
		int[] nums= new int[20];
		//valor que estara puesto en la tabla y aumentara
		int valor=0;
		//el valor random
		int num=0;
		
		/* 
		//el int que busca los valores en la tabla
		int res=Arrays.binarySearch(nums, valor);
		*/
		
		//generacion de valores en el for
		for (int i=0; i<nums.length;i++) {
			//crear valor random
			num=(int)(Math.random()*100+1);
			nums[i]=num;
			//System.out.println(num);
		}
		System.out.println(Arrays.toString(nums));
		
		//
		while (valor<nums.length){
			//si el int que escoge uno de los valores de la tabla, la tabla se hace más pequeña
			
			
			//si es par
			if(nums[valor]%2==0) {
				valor++;
			}
			//si es impar
			else {
				//copia todos los valores de la tabla nums a la misma tabla nums
				System.arraycopy(nums, valor+1, nums, valor, nums.length-valor-1);
				nums=Arrays.copyOf(nums, nums.length-1);
				
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
