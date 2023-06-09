import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class RumblePool
{
    private static Dictionary<Integer,String> entrants;
    private static int poolTotal;
    private static Dictionary<String, ArrayList<Integer>> participants;

    public RumblePool()
    {
        entrants = new Hashtable<>();
        poolTotal = 0;
        participants = new Hashtable<>();
    }

    public RumblePool(int entrantNumber,int calcPoolTotal,Dictionary<String,ArrayList<Integer>>participantBase)
    {
        entrants = new Hashtable<>();
        for(int index = 1; index <= entrantNumber; index++)
        {
            entrants.put(index,"");
        }

        poolTotal = calcPoolTotal;

        participants = participantBase;

    }

    public static Dictionary<Integer,String> getEntrants() {return entrants;}
    public static int getPoolTotal(){return poolTotal;}
    public static Dictionary<String,ArrayList<Integer>> getParticipants(){return participants;}

}
