public class CircleCalculator {
    public static void main(String[] args) {
        // 1. declare variable circleRadius, assign the value of 12.0
            double circleRadius = 12.0;
        // 2. declare variable circleDiameter, calculate circleDiameter = 2 * circleRadius
            double circleDiameter = (2* circleRadius );
            System.out.println("Circle Diameter = " + circleDiameter);
        // 4. declare variable circleArea, calculate circleArea = 3.14 * circleRadius * circleRadius
            double circleArea=(3.14*circleRadius*circleRadius);
            System.out.println("Circle Area = "+ circleArea);

        // 6. declare variable circleCircumference, calculate circleCircumference = 2 * 3.14 * circleRadius 
            double circleCircumference = 2 * 3.14 * circleRadius;

        // 7. Print circle circumference
        System.out.println("Circle Circumference = " + circleCircumference);
    }
}
