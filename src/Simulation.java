import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems (String fileName) {

        ArrayList<Item> items = new ArrayList<Item>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() > 0) {
                    int position = line.indexOf('=');
                    if (position > 0 ) {
                        String name = line.substring(0, position);
                        int weight = Integer.parseInt(line.substring(position + 1));

                        // dodaj Item
                        Item item = new Item(name, weight);

                        items.add (item);
                    }
                }
            }

        } catch (FileNotFoundException e) {

        }

        return  items;

    }



}
