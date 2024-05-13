/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Négyzet osztály - Száramaztatott osztály a Shape-ből
 * @author Szemesi Gábor
 */
public class Square extends Shape {

    private double side_length;

    public Square(double x, double y, double side_length) {
        super(x, y);
        this.side_length = side_length;
    }

    @Override
     /**
     * Kiszámolja a síkidom befoglaló téglalapjának területét.
     * oldal hosszúság^2
     */
    public double bounding_rectangle() {
        return Math.pow(side_length, 2);
    }

    public String toString() {
        return "Negyzet{" + "x=" + getX() + ", y=" + getY() + ", oldalanak hossza=" + side_length + ", befoglalo teglalapjanak terulete=" + bounding_rectangle() + '}';
    }
}
