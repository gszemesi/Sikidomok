
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *Síkidomok összefoglaló osztálya. Egy ArrayListben tárolja a síkidomokat.
 * Az osztály kezelei a beolvasást, az eredmény kiszámolását és a síkidomok kitörlését.
 * @author Szemesi Gábor
 */
public class Shapes {

    private final ArrayList<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }

    /**
     * A megadott fájlból beolvassa az adatokat és léterehozza a megadott
     * típusokat, amit a shapes ArrayList tárol el.
     *
     * @param filename Fájl neve.
     */
    public void read(String filename) throws FileNotFoundException, InvalidInputException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        int tmp = sc.nextInt();
        while (sc.hasNext()) {
            Shape shape;
            switch (sc.next()) {
                case "kör":
                    shape = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    break;
                case "háromszög":
                    shape = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    break;
                case "négyzet":
                    shape = new Square(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    break;
                case "hatszög":
                    shape = new Hexagon(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    break;
                default:
                    throw new InvalidInputException();
            }
            shapes.add(shape);
        }
    }

    /**
     * Végig megy az ArrayListen és a bounding_rectangle függvény segítségével
     * kiírja a legnagyobb befoglaló téglalap területét. Ha nincs ilyen, akkor
     * „Nincs sikidom!” üzenettel tér vissza.
     */
    public void result() {
        if (shapes.size() == 0) {
            System.out.println("Nincs sikidom!");
        } else {
            Shape shape = shapes.get(0);
            for (int i = 1; i < shapes.size(); i++) {
                if (shape.bounding_rectangle() < shapes.get(i).bounding_rectangle()) {
                    shape = shapes.get(i);
                }
            }
            System.out.println(shape);
        }

    }

    /**
     * Kitörli az összes síkidomot.
     */
    public void clear() {
        shapes.clear();
    }
}
