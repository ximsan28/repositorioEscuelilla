package org.floresmateo.model.figura;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Circulo extends Figura
{
    private double radio;

    public Circulo()
    {
    }

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public String getNombre() {
        return "\n\t::: Círculo :::";
    }

    @Override
    public String datosFigura() {
        return "> Radio R = "+radio+" cm";
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio( );
        radio = ReadUtil.readDouble( );
    }
}
