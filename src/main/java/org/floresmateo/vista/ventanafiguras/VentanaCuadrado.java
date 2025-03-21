package org.floresmateo.vista.ventanafiguras;

import org.floresmateo.model.figura.Cuadrado;
import org.floresmateo.model.figura.Figura;
import org.floresmateo.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;
import java.awt.*;

public class VentanaCuadrado extends JFrame
{
    private JTextField ladoField;
    private JButton calcularButton;
    private Figura figura;

    public VentanaCuadrado(Historiales historiales)
    {
        super("Cálculo del cuadrado");
        setLayout(null);

        JLabel areaLabel = new JLabel("Área: ");
        areaLabel.setBounds(10, 40, 500, 20);
        add(areaLabel);

        JLabel perimetroLabel = new JLabel("Perímetro: ");
        perimetroLabel.setBounds(10, 70, 500, 20);
        add(perimetroLabel);

        add(new JLabel("Lado: ")).setBounds(10, 10, 100, 20);
        ladoField = new JTextField();
        ladoField.setBounds(120, 10, 100, 20);
        add(ladoField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 100, 100, 25);
        add(calcularButton);

        ImageIcon cuadradoImg = new ImageIcon("src/main/resources/cuadrado.png");
        JLabel cuadradoLabel = new JLabel(cuadradoImg);
        cuadradoLabel.setBounds(230,10,158,160);
        add(cuadradoLabel);

        calcularButton.addActionListener( e -> {
            figura = new Cuadrado( );
            ((Cuadrado)figura).setLado(ReadUtil.string2Double( ladoField.getText( ) ) );

            areaLabel.setText("Área: " + figura.area());
            perimetroLabel.setText("Perímetro: " + figura.perimetro());
            historiales.addFigura(figura);
        });

        setSize(430, 230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
