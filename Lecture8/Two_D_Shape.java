package ex1;

public interface Two_D_Shape {
         double pi=3.14;
         void parameters();
         float area();
         float perimeter();
         public interface Three_D_Shape{
        	 float volume();
         }
}

public class triangle implements Two_D_Shape
{
	int a;
	int b;
	int c;
	int height;
	triangle(int a, int b, int c, int height)
	{
		a=a;
		b=b;
		c=c;
		height=height;
	}
	void print()
	{
		System.out.println("A new triangle is created");
	}
	boolean rectangular()
	{
		if(a*a+b*b==c*c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class sphere implements Two_D_Shape
{
	int radius;
	sphere(int i)
	{
		radius=0;
	}
	void print()
	{
		System.out.println("A new sphere has been created");
	}
public static void main(String [] args)
{
	triangle t1 = new triangle(3,5,6,3);
	sphere s1 = new sphere(4);
	triangle t2 = new triangle(8,2,10,16);
	sphere s2 = new sphere(7);
  }
}
