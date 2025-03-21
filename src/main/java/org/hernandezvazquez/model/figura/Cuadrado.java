package org.hernandezvazquez.model.figura;

import org.hernandezvazquez.util.ReadUtil;
import org.hernandezvazquez.vista.Menu;

public class Cuadrado extends Figura
{
    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

    @Override
    public String getNombre() {
        return "\nCuadrado";
    }

    @Override
    public String datosFigura() {
        return String.format(
                "Datos de la figura:\n" +
                        "-------------------\n" +
                        "Lado: %.2f",
                lado
        );
    }


    @Override
    public void leeDatos() {
        Menu.leeLado( );
        lado = ReadUtil.readDouble( );
    }
}