package org.hernandezvazquez.model.figura.figura2;

import org.hernandezvazquez.model.figura.Equilatero;
import org.hernandezvazquez.util.ReadUtil;
import org.hernandezvazquez.vista.Menu;

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
    public String getNombre() {
        return "\nTriangulo Isosceles";
    }

    @Override
    public String datosFigura() {
        return String.format(
                "Datos de la figura:\n" +
                        "-------------------\n" +
                        "Base   : %.2f\n" +
                        "Altura : %.2f\n" +
                        "Lado 1 : %.2f\n" +
                        "Lado 2 : %.2f",
                base, altura, lado1, lado2
        );
    }


    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readInt( );
    }
}
