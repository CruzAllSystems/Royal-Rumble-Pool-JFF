import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoyalRumblePool
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File rumbleFile = new File("RumbleReader.txt");
        Scanner rumbleReader = new Scanner(rumbleFile);
        RumblePool pool = Helpers.initializeRumblePool(rumbleReader);
    }

}
