import java.util.Scanner;

public class PemilihanHariDenganIf11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan day number: ");
        int dayNumber = scanner.nextInt();

        String dayName, dayType;

        if (dayNumber == 1) {
            dayName = "monday";
            dayType = "weekday";
        } else if (dayNumber == 2) {
            dayName = "tuesday";
            dayType = "weekday";
        } else if (dayNumber == 3) {
            dayName = "wednesday";
            dayType = "weekday";
        } else if (dayNumber == 4) {
            dayName = "thursday";
            dayType = "weekday";
        } else if (dayNumber == 5) {
            dayName = "friday";
            dayType = "weekday";
        } else if (dayNumber == 6) {
            dayName = "saturday";
            dayType = "weekend";
        } else if (dayNumber == 7) {
            dayName = "sunday";
            dayType = "weekend";
        } else {
            dayName = "Input tidak valid.";
            dayType = ""; 
        }

        System.out.print(dayName + " is a " + dayType);
        }
}
