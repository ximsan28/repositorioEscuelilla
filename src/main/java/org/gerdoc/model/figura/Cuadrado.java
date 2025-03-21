package org.gerdoc.model.figura;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;

/**
 *
 */
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
        return "\n\tCuadrado";
    }

    @Override
    public String datosFigura() {
        return "Lado: "+lado;
    }

    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado = ReadUtil.readInt( );
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}