/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Kör osztály - Száramaztatott osztály a Shape-ből
 * @author Szemesi Gábor
 */
public class Circle extends Shape {
    /**
     * X és Y kordináta mellet, a sugárral reprezentáljuk.
     */
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
     /**
     * Kiszámolja a síkidom befoglaló téglalapjának területét.
     * (2*sugár)^2
     */
    public double bounding_rectangle() {
        return Math.pow(2 * radius, 2);
    }

    public String toString() {
        return "Kor{" + "x=" + getX() + ", y=" + getY() + ", sugar=" + radius + ", befoglalo teglalapjanak terulete="+bounding_rectangle()+'}';
    }
}
