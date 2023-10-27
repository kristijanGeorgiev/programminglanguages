package ex2;

public class egg {
	int category = 0;
	public egg(int c)
	{
		category = c;
	}
	public egg() {
		// TODO Auto-generated constructor stub
	}
	void Egg()
	{
		System.out.println("Each egg has an albumen and a yolk");
	}
   void print()
    {
	   System.out.println("The egg is a nutritional product");
    }
   class ostrich_egg extends egg
   {
	   
	public ostrich_egg(int c) {
		super(c);
		System.out.println("a constructor of ostrich_egg that utilizes the constructor of egg"); 
	}
	  
   }
   class hene_egg extends egg
   {
	   public hene_egg(int c)
	   {
		   super(c);
		   System.out.println("a constructor of hene_egg that utilizes the constructor of egg"); 
	   }
   }
   public int get_category()
   {
	   return category;
   }
   public void set_category(int category)
   {
	   this.category=category;
   }
	public static void main(String[] args) {
		egg e = new egg();
		e.set_category(1);
		System.out.println("For the hen's egg: ");
		System.out.println("The egg is a nutritional product");
		System.out.println("Each egg has an albumen and a yolk");
		System.out.println("The category of this egg is: " + e.get_category());
		e.set_category(2);
		System.out.println("For the ostrich's egg: ");
		System.out.println("The egg is a nutritional product");
		System.out.println("The albumen and yolk of an OSTRICH egg are the largest ");
		System.out.println("The category of this egg is: " + e.get_category());
	}
	private void category(int i) {
		// TODO Auto-generated method stub
		
	}

}
