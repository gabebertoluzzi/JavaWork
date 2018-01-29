public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("the circle has a radius of " + c1.getRadius() + " and an area of " + c1.getArea());
        
        // Declare an isntance of class Circle called c2.
        // Construct by invoking the second constructor
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has a radius of " + c2.getRadius() + " and area of " + c2.getArea());
    }
}