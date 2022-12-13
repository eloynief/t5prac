package ejprac;

public class Ej2 {

	public static void main(String[] args) {
		
		int[] aleatorio= new int[10];
		int caja=0;
		//crear 
		for (int i=0;i<aleatorio.length;i++) {
			aleatorio[i]=(int)(Math.random()*100+1);
			caja=aleatorio[i]+caja;
			
			System.out.println(aleatorio[i]);
			
		}
		System.out.println("Suma total:" + caja);
	}

}
