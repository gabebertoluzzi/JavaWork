public class Circle {
   
    // Private variables
    private double radius;
    private String color;


    
    // the default constructor with no argument
    // It sets the radius and color to their default values
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // 3rd constructor with given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    // A public method for retreiving the color
    public String getColor() {
        return color;
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter for instance variable color
    public void setColor(String color) {
        this.color = color;
    }


    // Return a description of this instance in the form of 
    // Circle[radius=r,color=c]
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}