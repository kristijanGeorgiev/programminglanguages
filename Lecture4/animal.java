package ex3;

public class animal {
	public String name;
	public animal()
	{
		name="";
	}
	public animal(String n)
	{
		name=n;
	}
	public void onomatopea()
	{
		System.out.println("There is no onomatopea for " + name);
	}
	static class dog extends animal
	{
		public void onomatopea()
		{
			System.out.println("wouf");
		}
	}
	static class lion extends animal
	{
		public void onomatopea()
		{
			System.out.println("roar");
		}
	}
	static class frog extends animal
	{
		public void onomatopea()
		{
			System.out.println("kre kre");
		}
	}
	
	public static void main(String[] args) {
		animal[] animals = new animal[6];
		int i;
		animals[0] = new dog();
		for(i=0; i<6; i++)
		{
			animals[i].onomatopea();
		}
       System.out.println("The onomatopea for Simba is " );
	} 
}
