package org.floresmateo.vista;

import org.floresmateo.model.figura.Figura;
import org.floresmateo.vista.ventanafiguras.*;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private Figura figura;
    private Historiales historiales;

    private Ventana( )
    {
        super( "Programa de figuras" );
        init( );
    }

    private void init()
    {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        add(new JLabel("+ Programa de figuras +")).setBounds(90, 10, 300, 20);

        JButton botonCuadrado = new JButton("Cuadrado");
        botonCuadrado.setBounds(60, 40, 200, 30);
        add(botonCuadrado);
        botonCuadrado.addActionListener(e -> new VentanaCuadrado(historiales));

        JButton botonEquilatero = new JButton("Triángulo equilátero");
        botonEquilatero.setBounds(60, 70, 200, 30);
        add(botonEquilatero);
        botonEquilatero.addActionListener(e -> new VentanaEquilatero(historiales));

        JButton botonIsosceles = new JButton("Triángulo isósceles");
        botonIsosceles.setBounds(60, 100, 200, 30);
        add(botonIsosceles);
        botonIsosceles.addActionListener(e -> new VentanaIsosceles(historiales));

        JButton botonEscaleno = new JButton("Triángulo escaleno");
        botonEscaleno.setBounds(60, 130, 200, 30);
        add(botonEscaleno);
        botonEscaleno.addActionListener(e -> new VentanaEscaleno(historiales));

        JButton botonCirculo = new JButton("Círculo");
        botonCirculo.setBounds(60, 160, 200, 30);
        add(botonCirculo);
        botonCirculo.addActionListener(e -> new VentanaCirculo(historiales));
    }

    public static Ventana getInstance( )
    {
        if(ventana==null)
        {
            ventana=new Ventana();
        }
        return ventana;
    }

    @Override
    public void run()
    {
        setBounds( 100, 100, 360, 270);
        setLayout( null );
        setLocationRelativeTo( null );
        setVisible( true );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}

