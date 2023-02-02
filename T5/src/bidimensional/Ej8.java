package bidimensional;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums= new int[5][5];
		//
		int[][] nums2= new int[5][5];
		int i=0;
		int j=0;
		int igual=0;
		int random=0;
		for(i=0; i<6;i++) {
			//primero ponemos los valores a la tabla
			for (j=0; j<10;j++) {
				
				//el valor random
				nums[i][j]=(int)(Math.random()*10+1);
				random=nums[i][j];
				if(nums[i][j]==nums[j][i]) {
					
				}
				
			}
			
		}
		//luego vemos los valores de la tabla para compararlos y si son iguales
		//pone que es simetrico en esa parte
		
		
	}

}
