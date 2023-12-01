package ex2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class student {
      String name;
      String phonenum;
      int indexnum;
      transient int recordnum;
      student()
      {
    	  name="";
    	  phonenum="";
    	  indexnum=0;
    	  recordnum=0;
      }
      student(String name, String phonenum, int indexnum, int recordnum)
      {
    	  this.name=name;
    	  this.phonenum=phonenum;
    	  this.indexnum=indexnum;
    	  this.recordnum=recordnum;
      }
}
class studentfilestream {

    public static void printData(student object1) {
        System.out.println("name = " + object1.name);
        System.out.println("phonenum = " + object1.phonenum);
        System.out.println("indexnum = " + object1.indexnum);
        System.out.println("recordnum = " + object1.recordnum);
    }
	private String name;
	private String phonenum;
	private String indexnum;
	private String recordnum;
public void readfromfile(String filename)
{
	System.out.println("The name is: " + name);
	System.out.println("The phonenum is: " + phonenum);
	System.out.println("The indexnum is: " + indexnum);
	System.out.println("The recordnum is: " + recordnum);
}
public void writetofile(String filename)
{
	System.out.println("The name of the student " + name);
	System.out.println("The phonenum is: " + phonenum);
	System.out.println("The indexnum is: " + indexnum);
	System.out.println("The recordnum is: " + recordnum);
}
public static void main(String [] args)
{
	student object = new student("Kristijan", "076 22 19 15 ", 5422, 3128);
    String filename = "test.txt";
    try
    {
    	FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(object);
        out.close();
        file.close();
        System.out.println("Object has been serialized " + "Data before Deserialization.");
        printData(object);
        object.recordnum = 2000;
    }
    catch(Exception e)
    {
    	System.out.println("IOException is caught");
    }
    try
    {
    	FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        object = (student) in.readObject();
        in.close();
        file.close();
        System.out.println("Object has been deserialized "+ "Data after Deserialization.");
        printData(object);
    }
    catch(IOException e)
    {
    	System.out.println("IOException is caught");
    }
    catch(Exception e)
    {
    	System.out.println("ClassNotFoundException" + " is caught");
    }
  }
}