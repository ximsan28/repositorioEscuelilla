package org.hernandezvazquez.model.figura.figura2;

import org.hernandezvazquez.util.ReadUtil;
import org.hernandezvazquez.vista.Menu;

public class Escaleno extends Isosceles
{
    private double lado3;

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3)
    {
        super(base, altura, lado1, lado2);
        this.lado3 = lado3;
    }

    public Escaleno()
    {
    }

    public double getLado3()
    {
        return lado3;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public String getNombre() {
        return "\nTriangulo Escaleno";
    }

    @Override
    public String datosFigura() {
        return String.format(
                "Datos de la figura:\n" +
                        "-------------------\n" +
                        "Base    : %.2f\n" +
                        "Altura  : %.2f\n" +
                        "Lado 1  : %.2f\n" +
                        "Lado 2  : %.2f\n" +
                        "Lado 3  : %.2f",
                base, altura, lado1, lado2, lado3
        );
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado3( );
        lado3 = ReadUtil.readInt( );
    }
}