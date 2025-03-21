package org.floresmateo.model.figura.figura2;

import org.floresmateo.model.figura.Equilatero;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public Isosceles()
    {
    }

    public double getLado2()
    {
        return lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro()
    {
        return (2*lado1) + lado2;
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readInt( );
    }

    @Override
    public String getNombre() {
        return "\n\t::: Triángulo isósceles :::";
    }

    @Override
    public String datosFigura() {
        return "> Base B = "+base+"cm"+
               "\n> Altura H = "+altura+"cm"+
               "\n> Lado L1 = "+lado1+"cm"+
               "\n> Lado L2 = "+lado2+"cm";
    }
}
