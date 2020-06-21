package solid.lesson2_OCP.shape_ocp_solution;

public class AreaCalculator {
    public double areaCalc(Shape... shapes) {
        double totalArea = 0;

        for(var shape : shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }
}

class Test {
    public static void main(String[] args) {
        var areaCalc = new AreaCalculator();
        areaCalc.areaCalc(new Circle(34), new Rectangle(23,124), new Circle(34), new Rectangle(23,124));
    }
}
