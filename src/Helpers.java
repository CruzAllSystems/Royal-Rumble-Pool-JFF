import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Helpers
{
    public static RumblePool initializeRumblePool(Scanner reader)
    {
        String[] entrantNumberXNumberCost = reader.nextLine().split("$");
        int entrantNumber = Integer.parseInt(entrantNumberXNumberCost[0]);
        int numberCost = Integer.parseInt(entrantNumberXNumberCost[1]);
        int poolTotal = 0;

        int totalNumbersPurchased = 0;
        ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
        Dictionary<String, ArrayList<Integer>> participants = new Hashtable<>();

        while(reader.hasNextLine())
        {
            String[] participantXNumbersPurchased = reader.nextLine().split(",");
            poolTotal += (Integer.parseInt(participantXNumbersPurchased[1]) * numberCost);
            String participantName = participantXNumbersPurchased[0];
            ArrayList<Integer> participantsNumbers = new ArrayList<Integer>();
            int selectedNumber = (int)(Math.random()*entrantNumber) + 1;

        }

        RumblePool returnPool = new RumblePool();
        return returnPool;

    }
}
