public class TestRectangle {
    public static void main(String[] args) {
        // Declare all rectangle instances
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0f, 7.0f);


        // Invoke public methods/getters
        // r1
        System.out.println("The rectangle 'r1' has a length " + r1.getLength() + " and width " + r1.getWidth());
        System.out.println("The area of 'r1' is " + r1.getArea() + " and perimeter of " + r2.getPerimeter());
        // r2
        System.out.println("The rectangle 'r2' has a length " + r2.getLength() + " and width " + r2.getWidth());
        System.out.println("The area of 'r2' is " + r2.getArea() + " and perimeter of " + r2.getPerimeter());

        // Test getters

        // Test setters
        r1.setLength(2.0f);
        r1.setWidth(2.0f);
        r2.setLength(10.0f);
        r2.setWidth(14.0f);
        System.out.println("r1 AFTER SETTERS, length: " + r1.getLength() + ", width: " + r1.getWidth());
        System.out.println("r2 AFTER SETTERS, length: " + r2.getLength() + ", width: " + r2.getWidth());

        // Test toString()
        // explicit call
        System.out.println("Explicit r1: " + r1.toString());
        System.out.println("Explicit r2: " + r2.toString());
        // implicit calls
        System.out.println("implicit r1: " + r1);
        System.out.println("implicit r2: " + r2);
    }

}