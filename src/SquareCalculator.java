//WORKBOOK 1, 2A
import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // ask user to enter the width and the height
        System.out.println("Enter the width = ");
        double width = reader.nextDouble();
        System.out.println("Enter the height = ");
        double height = reader.nextDouble();

        // printout these details
        System.out.println("Rectangle width = " + width);
        System.out.println("Rectangle height = " + height);

        double perimeter = 2 *( width + height);
        System.out.println("Rectangle perimeter = " + perimeter);

        // declare double variable called area, calculate area = width * height
        double area = width * height;
        System.out.println("Rectangle area = " + area);


    }
}
