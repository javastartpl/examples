
public class MathExample {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		// 3.141592653589793
		System.out.println(Math.E);
		// 2.718281828459045
		double sin = Math.sin(Math.PI/2);
		System.out.println(sin);
		// 1.0

		double a = 5.6;
		int b = (int) a;
		long round = Math.round(a);
		System.out.println(b);
		// 5
		System.out.println(round);
		// 6
		
		double minus = -10;
		double abs = Math.abs(minus);
		System.out.println(abs);
		// 10.0
		
		double power = Math.pow(2, 4);
		System.out.println(power);
		// 16.0 (2^4)
		System.out.println(Math.sqrt(power));
		// 4.0 (pierwiastek kwadratowy z 16)
	}
}
