
public class Main {

	public static void main(String[] args) {
		
		
		double x, y;
		x = 3;
		y = 4;
		
		double resultado = 0;
		
		resultado = Math.sqrt(x);
		System.out.println("raiz quadrada de A é: " + resultado);
		
		resultado = Math.pow(x, y);
		System.out.println(x + " elevado a " + y + " : " + resultado);
		
//		BASKHARA
		
		double a = 21,b = 22,c = 4, delta, x1,x2;
		
		delta = Math.pow(b, 2.0) - 4 * a *c;
		
	x1 = (- b - Math.sqrt(delta)) / (2.0 *a);
	x2 = (- b + Math.sqrt(delta)) / (2.0 *a);
	
	System.out.println("x1 " +x1);
	System.out.println("x2 " +x2);
		
		
	}

}
