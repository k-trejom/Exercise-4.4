import java.util.Scanner;

public class AreaOfHex {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side");
        double side = input.nextDouble();
        double area = (6 * side * side) / (4 * Math.Tan(Math.PI / 6));
        System.out.println("The area of the hexagon is" + area);
    }
}