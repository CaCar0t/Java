public class Testeverything {

    static class Square {
        final double width;
        final double length;

        public Square(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double squareArea() {
            return width * length;
        }

        public double squareCircumArea() {
            return (2 * width) + (2 * length);
        }
    }

    public static void main(String[] args) {
        double width = 3.9;
        double length = 16.2;

        Square rectangle = new Square(width, length);

        System.out.println(rectangle.squareArea());
        System.out.println(rectangle.squareCircumArea());
    }
}
