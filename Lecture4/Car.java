package ex1;

public class Car {
	private String type;
	int no_seats;
	String fuel;
	String body_color;
	Car()
	{
		type="";
		no_seats=0;
		fuel="";
		body_color="";
	}
	Car (String type, int seats, String fuel, String body_color)
	{
		this.type=type;
		this.no_seats=no_seats;
		this.fuel=fuel;
		this.body_color=body_color;
	}
	public String get_type()
	{
		return type;
	}
	public void set_type(String type)
	{
		this.type=type;
	}
	public int get_no_seats()
	{
		return no_seats;
	}
	public void set_no_seats(int no_seats)
	{
		this.no_seats=no_seats;
	}
	public String get_fuel()
	{
		return fuel;
	}
	public void set_fuel(String fuel)
	{
		this.fuel=fuel;
	}
	public String get_body_color()
	{
		return body_color;
	}
	public void set_body_color(String body_color)
	{
		this.body_color=body_color;
	}
	public static void main(String[] args) {
		Car A = new Car();
		A.set_type("Mercedes");
		System.out.println("The type of the car is: " + A.get_type());
		A.set_no_seats(128);
		System.out.println("The car has number of " + A.get_no_seats());
		A.set_fuel("Gasoline");
		System.out.println("The Car has fuel of: " + A.get_fuel());
		A.set_body_color("Pinky");
		System.out.println("His body_color is: " + A.get_body_color());
	}

}
