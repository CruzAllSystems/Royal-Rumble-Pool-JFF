import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Helpers
{
    public static RumblePool initializeRumblePool(Scanner reader)
    {
        String[] entrantNumberXNumberCost = reader.nextLine().split(",");
        int entrantNumber = Integer.parseInt(entrantNumberXNumberCost[0]);
        int numberCost = Integer.parseInt(entrantNumberXNumberCost[1]);
        int poolTotal = 0;
        Dictionary<String, ArrayList<Integer>> participants = new Hashtable<>();

        while(reader.hasNextLine())
        {
            String[] participantXNumbersPurchased = reader.nextLine().split(",");
            int numbersPurchased = Integer.parseInt(participantXNumbersPurchased[1]);
            String participantName = participantXNumbersPurchased[0];
            poolTotal += numbersPurchased * numberCost;
            ArrayList<Integer> participantsNumbers = new ArrayList<Integer>();
            for(int index = 1; index <= numbersPurchased; index++)
            {
                int selectedNumber = (int)(Math.random()*entrantNumber) + 1;
                if(participantsNumbers.contains(selectedNumber))
                {
                    index--;
                    continue;
                }
                participantsNumbers.add(selectedNumber);
            }
            participants.put(participantName,participantsNumbers);

        }

        RumblePool returnPool = new RumblePool(entrantNumber,poolTotal,participants);
        return returnPool;

    }
}
