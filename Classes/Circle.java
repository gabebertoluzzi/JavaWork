public class Circle {
    // Getting work started.  
    // Java is up and running on computer.
    // Success on first commit as well
    private double radius;
    private String color;

    // the default constructor with no argument
    // It sets the radius and color to their default values
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

}