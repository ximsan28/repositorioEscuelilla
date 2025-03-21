package org.floresmateo.model.figura;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    public Triangulo()
    {
    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }

    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leeDatos() {
        Menu.leeBase();
        base = ReadUtil.readDouble();
        Menu.leeAltura();
        altura = ReadUtil.readDouble();
    }
}
