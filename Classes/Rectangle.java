public class Rectangle {
    // Private variables
    private float length;
    private float width;

    // 1st constructor with default length and width
    public Rectangle() {
        this.length = 1.0f;
        this.length = 1.0f;
    }

    // 2nd constructor with given length and width
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public float getLength() {
        return length;
    }

    // Setter for length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter for width
    public float getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(float width) {
        this.width = width;
    }

    // Getter for rectangle's Area
    public float getArea() {
        return length * width;
    }

    // Getter for rectangle's Perimeter
    public float getPerimeter() {
        return (length*2) + (width*2);
    }

    // toString thingy
    // Rectangle[length=length,width=width]
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

}