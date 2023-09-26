import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        // Create a GregorianCalendar instance for the specified year and month
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        
        // Get the number of days in the specified month
        int numDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        // Get the day of the week for the first day of the month (0 - Sunday, 1 - Monday, ..., 6 - Saturday)
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Display the calendar header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces for the first day of the month
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        
        // Print the days of the month
        for (int day = 1; day <= numDaysInMonth; day++) {
            // Add leading zero for single-digit days
            if (day < 10) {
                System.out.print(" ");
            }
            System.out.print(day + "  ");
            
            // Move to the next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            
            // Check if we need to wrap to the next line
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(); // Start a new line for the next week
            }
        }
        
        scanner.close();
    }
}