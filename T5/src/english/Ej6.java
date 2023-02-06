package english;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//e
		int i=0;
		//f
		int j=0;
		Scanner sc= new Scanner(System.in);
		
//e)
		
		
		System.out.println();
		//e
		int[] numi= new int[10];
		//f
		int[] numj= new int[10];
		int[] nummult = new int[10];
		int multiply=0;
		//e
		for(i=0; i<10;i++) {
			//we introduce every value on the table
				numi[i]=sc.nextInt();
			
		}
		//array print
		System.out.println(Arrays.toString(numi));
		
		
		
//f) 
		for(j=0; j<10;j++) {
			numj[j]=sc.nextInt();
			
			
			
			//we use multiply to equal the value of the number array and
			//plus its own value to increase everytime we put a number
			//the other array equals to that value so we don't need to modify
			//the existent array
			multiply=numj[j]+multiply;
			nummult[j]=multiply;
		}
		System.out.println(Arrays.toString(nummult));
	
	
		
	}

}
