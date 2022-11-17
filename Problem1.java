import java.util.Scanner;

public class Problem1
{
   
    public void run()
    {
        //Variable declaration
        Scanner kb = new Scanner (System.in);
        final double SECSINMINUTE = 60.0;
        final double SECSINHOUR = 3600.0;
        double totalSeconds;
        double hours;
        double roundedHours;
        double minutes;
        double roundedMinutes;
        double seconds;
        
        
        //Prompt for user imput
        System.out.println("Please enter the total number of seconds to convert");
        totalSeconds = kb.nextDouble();
        
        
        //Calculations
        hours = totalSeconds / SECSINHOUR;
        roundedHours = Math.floor(hours);
        minutes = totalSeconds / SECSINMINUTE - (roundedHours * SECSINMINUTE);
        roundedMinutes = Math.floor(minutes);
        seconds = totalSeconds - (roundedHours * SECSINHOUR) - (roundedMinutes * SECSINMINUTE);
        
        
        //Output results to user
        System.out.format("Total number of seconds: %7.0f%n", totalSeconds);
        System.out.println("\nThis is equivalent to:");
        System.out.format("\tnumber of hours: %5.0f", roundedHours);
        System.out.format("%n\tnumber of minutes: %3.0f", roundedMinutes);
        System.out.format("%n\tnumber of seconds: %3.0f%n", seconds);
    }
}
