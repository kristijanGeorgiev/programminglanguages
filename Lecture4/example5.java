package example5;

public class example5 {

	public static void main(String[] args) {
		String s = "Computer";
		System.out.println("Original: " + s);
		System.out.println("in small letters: " + s.toLowerCase());
		System.out.println("in capital letters: " + s.toUpperCase());
		System.out.println("Length: " + s.length());
		System.out.println("First letter: " + s.charAt(0));
		System.out.println("Last letter: " + s.charAt(s.length()-1));
		System.out.println("Middle letter: " + s.charAt(s.length()/2));
		System.out.println("Middle letter: " + s.replace("e","o"));
		System.out.println("Middle letter: " + s.replace("Compu","Calcula"));

	}

}
