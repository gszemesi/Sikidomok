/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Háromszög osztály - Száramaztatott osztály a Shape-ből 
 * @author Szemesi Gábor
 */
public class Triangle extends Shape {

    private double side_length;

    public Triangle(double x, double y, double side_length) {
        super(x, y);
        this.side_length = side_length;
    }

    @Override
     /**
     * Kiszámolja a síkidom befoglaló téglalapjának területét.
     * ((√3)/2*oldal hosszúság)*oldal hosszúság)
     */
    public double bounding_rectangle() {
        return ((Math.sqrt(3) / 2) * side_length) * side_length;
    }

    public String toString() {
        return "Haromszog{" + "x=" + getX() + ", y=" + getY() + ", oldalanak hossza=" + side_length + ", befoglalo teglalapjanak terulete=" + bounding_rectangle() + '}';
    }
}
