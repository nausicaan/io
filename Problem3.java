import java.util.Scanner;

public class Problem3
{
    public void run()
    {
        //Variable declaration
        Scanner kb = new Scanner(System.in);
        final double GRAVITY = 9.8;
        final double ZERO = 0.0;
        final double THREE_QUARTER = 0.75;
        double initialVelocity;
        double launchAngle;
        double launchAngleRad;
        double timeOfFlight;   
        double maximumHeight;
        double horizontalRange;
        
        
        //Prompt for user imput
        System.out.println("\nPlease enter the initial velocity (in meters/sec):");
        initialVelocity = kb.nextDouble();
        System.out.println("Please enter the angle of launch (in degrees):");
        launchAngle = kb.nextDouble();
        
        
        //Calculations
        launchAngleRad = Math.toRadians(launchAngle);
        timeOfFlight = ((2.0 * initialVelocity) * Math.sin(launchAngleRad)) / GRAVITY;
        maximumHeight = Math.pow(initialVelocity,2) * Math.pow(Math.sin(launchAngleRad),2) / (2.0 * GRAVITY);
        horizontalRange = Math.pow(initialVelocity,2) * Math.sin(2.0 * launchAngleRad) / GRAVITY;
                
        
        //Output report to user
        System.out.format("%nInitial Velocity: %7.1f meters/sec%n", initialVelocity);
        System.out.format("Angle of Launch: %8.1f degrees%n", launchAngle);
        
        System.out.format("%nTime of Flight: %9.1f secs%n", timeOfFlight);
        System.out.format("Maximum Height: %10.1f meters%n", maximumHeight);
        System.out.format("Horizontal Range: %8.1f meters%n", horizontalRange);
        
        System.out.println("\nProjectile Flight Path Coordinates:\n");
    
        System.out.format("Beginning Time:\t     (%.0f,", horizontalRange * ZERO);
        System.out.format(" %1.0f)%n", maximumHeight * ZERO);
        
        System.out.format("One Quarter Time:    (%.1f,", horizontalRange * 0.25);
        System.out.format(" %5.1f)%n", maximumHeight * THREE_QUARTER);
        
        System.out.format("One Half Time:\t     (%.1f,", horizontalRange * 0.50);
        System.out.format(" %5.1f)%n", maximumHeight);
        
        System.out.format("Three Quarter Time:  (%.1f,", horizontalRange * THREE_QUARTER);
        System.out.format(" %5.1f)%n", maximumHeight * THREE_QUARTER);
                      
        System.out.format("Full Time:\t     (%.1f,", horizontalRange);
        System.out.format(" %1.0f)", maximumHeight * ZERO);    
    }
}
