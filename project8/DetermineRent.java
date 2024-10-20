import java.util.Scanner;

public class DetermineRent
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        // Declare variables.
        double rent[][] =    {{350, 390, 435}, 
                    {400, 440, 480},
                    {475, 530, 575},
                    {600, 650, 700},
                    {1000, 1075, 1150}}; 
        int floor;   
        int bedroom;
        String floorString;
        String bedroomString;
        int QUIT = 99;
                
        // Work done in the getReady() method
        floorString = JOptionPane.showInputDialog(
                                "Enter floor or 99 to quit: ");
        floor = Integer.parseInt(floorString);
        
        while(floor != QUIT)
        {    
            // Fill in code here to determine rent based on the floor and bedroom.

            System.out.println("Rent is $" + rent[floor][bedroom]);
        }
        // Work done in the finish() method
        System.out.println("End of program");
        System.exit(0);
    } // End of main() method.
} // End of DetermineRent class.

