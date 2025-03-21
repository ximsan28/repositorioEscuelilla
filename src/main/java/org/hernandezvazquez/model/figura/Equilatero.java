package org.hernandezvazquez.model.figura;

import org.hernandezvazquez.util.ReadUtil;
import org.hernandezvazquez.vista.Menu;

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
        return "\nTriangulo Equilátero";
    }

    @Override
    public String datosFigura() {
        return String.format(
                "Datos de la figura:\n" +
                        "-------------------\n" +
                        "Base   : %.2f\n" +
                        "Altura : %.2f\n" +
                        "Lado   : %.2f",
                base, altura, lado1
        );
    }


    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado1();
        lado1 = ReadUtil.readDouble();
    }

}