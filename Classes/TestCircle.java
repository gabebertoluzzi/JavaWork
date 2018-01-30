public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle 1 has a radius of " + c1.getRadius() + " and an area of " + c1.getArea());
        
        // Declare an isntance of class Circle called c2.
        // Construct by invoking the second constructor
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle 2 has a radius of " + c2.getRadius() + " and area of " + c2.getArea());

        // Declare instance of class circle called c3
        // Use 3rd constructor and provide both radius and color
        Circle c3 = new Circle(5.0, "blue");
        // Invoke public methods of c3
        System.out.println("The circle 3 has a radius of " + c3.getRadius() + " and area of " + c3.getArea());

        // Test getColor()
        System.out.println("The color of circle 1 is " + c1.getColor());
        System.out.println("The color of circle 2 is " + c2.getColor());
        System.out.println("The color of circle 3 is " + c3.getColor());

        // Setter method testing
        Circle c4 = new Circle();
        c4.setRadius(7);
        // Print radius via getter
        System.out.println("radius is " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is " + c4.getColor());
        System.out.println(c4.toString());  // Explicit call
        System.out.println(c4);
    }
}