package org.floresmateo.model.figura;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

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
        return "\n\t::: Cuadrado :::";
    }

    @Override
    public String datosFigura() {
        return "> Lado L = "+lado+"cm";
    }

    @Override
    public void leeDatos() {
        Menu.leeLado( );
        lado = ReadUtil.readDouble( );
    }
}