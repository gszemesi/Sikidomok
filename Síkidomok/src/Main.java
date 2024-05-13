
import java.io.FileNotFoundException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Main osztály.
 * Kivétel kezelés mellet meghívja a shapes read() metodúsát, majd a shapes result() és shapes clear() metódust.
 * @author Szemesi Gábor
 */
public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        try {
            shapes.read("data.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch (InvalidInputException ex) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }

        shapes.result();
        shapes.clear();
    }
}
