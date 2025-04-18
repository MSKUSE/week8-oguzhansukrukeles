public class Rectangle extends Shape {
    int sideA = 0, sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A " + sideA + " Side B " + sideB);
    }

    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.sideA == rectangle.sideA && this.sideB == rectangle.sideB && this.getColor().equals(rectangle.getColor())) {
            return true;
        }
    }

}