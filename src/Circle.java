public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    @Override
    public double getPrimaryProperty() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + radius);
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                if (Math.pow(j - radius, 2) + Math.pow(i - radius, 2) <= Math.pow(radius, 2)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
