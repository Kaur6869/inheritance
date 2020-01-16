
package inheritence2;


public class class1 {

private double radius ;

public class1(){ // no argument constructor
    this.radius = 2.5;
}

public class1(double radius){ // argument constructor
    this.radius = radius;
}

public double getRadius(){ // get method to read private data member
    return radius;
}

public double areaCircle(){
    return 3.14 * radius * radius;
}

public String toString(){
return "Radius : " + radius + "  " + " Area of Circle " + areaCircle();
}







}
