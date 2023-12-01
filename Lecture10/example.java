package ex1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class example {
     int transientint;
     int staticint;
     String name;
     int age;
     example()
     {
    	 transientint=0;
    	 staticint=0;
    	 name="";
    	 age=0;
     }
     example(String name, int age, int transientint, int staticint) {
         this.name = name;
         this.age = age;
         this.transientint = transientint;
         this.staticint = staticint;
     }
}
class serialexample {

    public static void printData(example object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("transientInt = " + object1.transientint);
        System.out.println("staticInt = " + object1.staticint);
    }
 public static void main(String [] args)
 {
	 example object = new example("Name", 20, 2, 1000);
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
         object.staticint = 2000;
     }
     catch(Exception e)
     {
    	 System.out.println("IOException is caught");
     }
     try
     {
    	 FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
         object = (example) in.readObject();
         in.close();
         file.close();
         System.out.println("Object has been deserialized "+ "Data after Deserialization.");
         printData(object);
     }
     catch(IOException e)
     {
    	 System.out.println("IOException is caught");
     }
     catch (ClassNotFoundException e)
     {
    	 System.out.println("ClassNotFoundException" + " is caught");
     }
   }
 }
