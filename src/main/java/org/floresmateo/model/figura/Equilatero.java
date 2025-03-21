package org.floresmateo.model.figura;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Equilatero extends Triangulo
{
    protected double lado1;

    public Equilatero()
    {
    }

    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado1 = lado1;
    }

    public Equilatero(double lado1)
    {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public  double perimetro()
    {
        return lado1*3;
    }

    @Override
    public String getNombre() {
        return "\n\t::: Triángulo equilátero :::";
    }

    @Override
    public String datosFigura() {
        return "> Base B = "+base+"cm"+
               "\n> Altura H = "+altura+"cm"+
               "\n> Lado L1 = "+lado1+"cm";
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado1();
        lado1 = ReadUtil.readDouble();
    }
}