package org.hernandezvazquez.model.figura;

import org.hernandezvazquez.util.ReadUtil;
import org.hernandezvazquez.vista.Menu;

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
        return "\nCirculo";
    }

    @Override
    public String datosFigura() {
        return String.format(
                "Datos de la figura:\n" +
                        "-------------------\n" +
                        "Radio: %.2f",
                radio
        );
    }


    @Override
    public void leeDatos() {
        Menu.leeRadio( );
        radio = ReadUtil.readDouble( );
    }

}
