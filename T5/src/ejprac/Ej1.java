package ejprac;

public class Ej1 {

	public static void main(String[] args) {
		
		int[] aleatorio= new int[10];
		
		
		//crear 
		for (int i=0;i<aleatorio.length;i++) {
			/*crea el numero al azar*/
			aleatorio[i]=(int)(Math.random()*100+1);
			//print del mensaje
			System.out.println(aleatorio[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
