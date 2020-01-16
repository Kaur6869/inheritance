
package inheritence2;


public class class2 extends class1{  // class2 is subclass and class1 is superclass
   
    
    private double height;
    
    public class2(){  // no argument constructor.. whtever constructor we have in superclass, in subclass it should match
        super () ; // to call superclass no argument constructor
        this.height = 5.5;
    }
    
    public class2(double radius, double height){
    super (radius);    // calls super class argument constructor
    this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double areaCylinder(){
        return (2 * 3.14 * getRadius() * height ) + (2 * areaCircle());
    } // even though class2 is subclass it could not access anything from class1 wch is private .... we need to call them in order to use in any class
      //  no matter they are super or sub class..........
    
      public String toString(){ // to call super class method super.toString
        return super.toString() + " Height : " + height + "  " + " Area of Cylinder" + areaCylinder();
    }
}
