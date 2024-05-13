/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Síkidom osztály.
 * Nem példányosítható osztály. Kör, háromszög, négyzet, hatszög ősosztálya. Általánosságban eltárolja x és y kordinátát.
 * Továbbá van egy bounding_rectangle() metódusa,ami származtatott osztályokban felül van definiálva
 * @author Szemesi Gábor
 */
public class Shape {

    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    /**
     * Kiszámolja a síkidom befoglaló téglalapjának területét.
     * Ebben az osztályban -1-el térv vissza. Származtatott osztályokban felül van definiálva.
     */
    public double bounding_rectangle() {
        return -1;
    }
}
