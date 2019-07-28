import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args) throws FileNotFoundException {

        System.out.println ("Symulacja!");


        Simulation simulation = new Simulation();

        ArrayList<Item> phase1Items;
        ArrayList<Item> phase2Items;
        phase1Items = simulation.loadItems(1);
        phase2Items = simulation.loadItems(2);


    }

}