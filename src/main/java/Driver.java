import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        flyweight();
        proxy();
    }
    public static void proxy() {

    }
    public static void flyweight() {
        CharacterFactory factory = new CharacterFactory();
        CharProperty prop1 = new CharProperty("Arial", "Red", 12);
        CharProperty prop2 = new CharProperty("Calibri", "Blue", 13);
        CharProperty prop3 = new CharProperty("Verdana", "Black", 14);
        CharProperty prop4 = new CharProperty("Verdana", "Red", 15);
        Document doc = new Document();
        doc.addCharacter('H', prop1);
        doc.addCharacter('e', prop2);
        doc.addCharacter('l', prop3);
        doc.addCharacter('l', prop4);
        doc.addCharacter('o', prop1);
        doc.addCharacter('W', prop2);
        doc.addCharacter('o', prop3);
        doc.addCharacter('r', prop4);
        doc.addCharacter('l', prop1);
        doc.addCharacter('d', prop2);
        doc.addCharacter('C', prop3);
        doc.addCharacter('S', prop4);
        doc.addCharacter('5', prop1);
        doc.addCharacter('8', prop2);
        doc.addCharacter('0', prop3);
        doc.addCharacter('0', prop4);

        // calling save method
        save("file.txt", doc);
        load("file.txt");
    }
    public static void save(String file, Document doc) {
        try {
            FileWriter myWriter = new FileWriter(file);
            for(Characters character: doc.getContents()) {
                myWriter.write(character.getVal());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving.");
            e.printStackTrace();
        }
    }
    public static void load(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving while loading");
            e.printStackTrace();
        }
    }
}
