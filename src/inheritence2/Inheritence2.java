
package inheritence2;
import java.util.Scanner;

public class Inheritence2 {

   
    public static void main(String[] args) {
     // this class tells use of constructor and "Super" property
       
     //  System.out.println("Enter Radius : ");  we gave value in constructor rather
     Scanner k = new Scanner(System.in);
     System.out.print("Enter value for Radius : ");
     double r = k.nextDouble();
     System.out.print("Enter value for Height : ");
     double h = k.nextDouble();
     
     class2 three = new class2(r,h); // calling argument constructor
     System.out.println(three.toString());
     
     
      class1 one = new class1();  // to call no argument constructor
      System.out.println("Area of circle  : " + one.areaCircle());
      System.out.println(one.toString()); // this also works but will confuse between both classes
       
       class2 two = new class2();   // to call no argument constructor
       System.out.println("Height of cylinder : " + two.getHeight());
       System.out.println("Area of cylinder : " + two.areaCylinder());
       System.out.println("Radius of cirlce : " + two.getRadius());
        
       System.out.println(two.toString());
       
    }
    
}
