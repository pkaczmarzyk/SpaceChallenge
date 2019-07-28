import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {


    public ArrayList<Item> loadItems (int phase) throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<Item>();

        try {
            String fileName;
            if (phase == 1)
                fileName = "phase-1.txt";
            else
                fileName = "phase-2.txt";
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() > 0) {
                    String [] data = line.split("=");
                    Item item = new Item(data[0], Integer.parseInt(data[1]));
                    items.add (item);
                }
            }

        } catch (FileNotFoundException e) {
            throw e;
        }

        return  items;
    }


    public ArrayList<Rocket> loadU1 (List<Item> items) {

        Rocket rocket = new U1();
        ArrayList<Rocket> listU1;
        listU1 = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {

            if (rocket.canCarry(items.get(i))) {
                rocket.carry(items.get(i));
            }
            else {
                listU1.add (rocket);
                rocket = new U1();
                rocket.carry(items.get(i));
            }

            if (i == items.size())
                listU1.add (rocket);
        }

        return listU1;
    }


    public ArrayList<Rocket> loadU2 (List<Item> items) {

        Rocket rocket = new U2();
        ArrayList<Rocket> listU2;
        listU2 = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {

            if (rocket.canCarry(items.get(i))) {
                rocket.carry(items.get(i));
            }
            else {
                listU2.add (rocket);
                rocket = new U2();
                rocket.carry(items.get(i));
            }

            if (i == items.size())
                listU2.add (rocket);
        }

        return listU2;
    }


    public void runSimulation(ArrayList<Rocket> rockets) {

        for (Rocket rocket : rockets) {

            //

        }
    }


}
