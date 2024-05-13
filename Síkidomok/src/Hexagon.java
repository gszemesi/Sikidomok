/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Hatszög osztály - Száramaztatott osztály a Shape-ből
 * @author Szemesi Gábor
 */
public class Hexagon extends Shape {

    private double side_length;

    public Hexagon(double x, double y, double side_length) {
        super(x, y);
        this.side_length = side_length;
    }

    @Override
    /**
     * Kiszámolja a síkidom befoglaló téglalapjának területét.
     * ((√3)/2*oldal hosszúság*2)^2
     */
    public double bounding_rectangle() {
        return Math.pow(((Math.sqrt(3) / 2) * side_length) * 2,2);
    }

    public String toString() {
        return "Hatszog{" + "x=" + getX() + ", y=" + getY() + ", oldalanak hossza=" + side_length + ", befoglalo teglalapjanak terulete=" + bounding_rectangle() + '}';
    }
}
