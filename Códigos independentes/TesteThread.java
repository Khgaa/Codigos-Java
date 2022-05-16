package CodigosIndependentes;

public class TesteThread {

	public static void main(String[] args) {
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
	private static void imprimir(String t) {
		
		System.out.println("Thread = " + t);
		

	}
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			for(int cont = 0; cont<10;cont++) {
				imprimir("T1 -" + cont);
			}
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			for(int cont = 0;  cont<10;cont++) {
				imprimir("T2 -" + cont);
			}
		
	}

};
}