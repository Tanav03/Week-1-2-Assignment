import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        int perimeter = scanner.nextInt();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        scanner.close();
    }
}
