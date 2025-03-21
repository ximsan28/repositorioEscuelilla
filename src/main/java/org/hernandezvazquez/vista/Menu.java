package org.hernandezvazquez.vista;

import org.hernandezvazquez.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println("\n\t+ ¡Bienvenido! +");
        System.out.println("\t= Programa de Figuras =");
        System.out.println("Selecciona una opción:");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triángulo equilátero");
        System.out.println("3.- Triángulo isósceles");
        System.out.println("4.- Triángulo escaleno");
        System.out.println("5.- Círculo");
        System.out.println("6.- Salir");
    }

    public static void principal2( )
    {
        System.out.println("\n\t= Menú del Ejecutable =");
        System.out.println("\tSelecciona una opción:");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println("\t¡ERROR!¡La opción no es correcta!");
    }

    public static void seleccionaOpcion( )
    {
        System.out.print("> Dame una opción: ");
    }

    public static void errorDato( )
    {
        System.out.println("\t¡ERROR!¡Ese no es un dato válido!");
    }

    public static void leeLado( )
    {
        System.out.print( "> Dame la medida del lado: " );
    }

    public static void leeBase( )
    {
        System.out.print( "> Dame la medida de la base: " );
    }

    public static void leeAltura( )
    {
        System.out.print( "> Dame la medida de la altura: " );
    }

    public static void leeLado1( )
    {
        System.out.print( "> Dame la medida del lado 1: " );
    }

    public static void leeLado2( )
    {
        System.out.print( "> Dame la medida del lado 2: " );
    }

    public static void leeLado3( )
    {
        System.out.print( "> Dame la medida del lado 3: " );
    }

    public static void leeRadio( )
    {
        System.out.print( "> Dame la medida del radio: " );
    }

    public static void calcula( Figura figura )
    {
        System.out.println( "> El área es: " + figura.area( ) );
        System.out.println( "> El perímetro es: " + figura.perimetro( ) );
    }

}
