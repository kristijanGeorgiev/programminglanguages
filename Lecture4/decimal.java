package example6;

public class decimal {

	public static void main(String[] args) {
		double area = 0.0;
		double pi  =3.14;
		int r = 0;
		double e;
		double value =2.5;
		double square;
		square=value*value;
		Math.sin(value);
		Math.cos(value);
		Math.tan(value);
		Math.toRadians(value);
		Math.sqrt(value);
		Math.pow(area, value);
		Math.cbrt(value);
		Math.max(area, value);
		Math.min(area, value);
		System.out.println("Sine: " + Math.sin(value));
		System.out.println("Cosine: " + Math.cos(value));
		System.out.println("Tangent: " + Math.tan(value));
		System.out.println("Cotangent: " + Math.toRadians(value));
		System.out.println("Square root: " + Math.sqrt(value));
		System.out.println("Square: " + square);
		area = 3.14*r*r;
		System.out.println("Pi: " + pi);
		System.out.println("Area of circle: " + area);
		System.out.println("Largest: " + Math.max(area, value));
		System.out.println("Smallest: " + Math.min(area, value));
		System.out.println("Cube: " + Math.cbrt(value));
	}

}
