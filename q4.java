import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter to city: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from city to via city (miles): ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance from via city to final city (miles): ");
        double viaToFinalCity = input.nextDouble();
        System.out.print("Enter time from city to via city (minutes): ");
        double timeFromToVia = input.nextDouble();
        System.out.print("Enter time from via city to final city (minutes): ");
        double timeViaToFinalCity = input.nextDouble();
        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.60934;
        double totalTimeMinutes = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTimeMinutes + " minutes");
        input.close();
    }
}
