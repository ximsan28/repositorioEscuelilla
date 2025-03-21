package org.floresmateo.vista.ventanafiguras;

import org.floresmateo.model.figura.Circulo;
import org.floresmateo.model.figura.Equilatero;
import org.floresmateo.model.figura.Figura;
import org.floresmateo.model.figura.figura2.Escaleno;
import org.floresmateo.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class VentanaEquilatero extends JFrame
{
    private JTextField baseField, alturaField, lado1Field, lado2Field, lado3Field;
    private JButton calcularButton;
    private Figura figura;

    public VentanaEquilatero(Historiales historiales) {
        super("Cálculo del Triángulo Equilatero");
        setLayout(null);

        JLabel areaLabel = new JLabel("Área: ");
        areaLabel.setBounds(10, 100, 500, 20);
        add(areaLabel);

        JLabel perimetroLabel = new JLabel("Perímetro: ");
        perimetroLabel.setBounds(10, 130, 500, 20);
        add(perimetroLabel);

        add(new JLabel("Base del equilatero:")).setBounds(10, 10, 120, 20);
        baseField = new JTextField();
        baseField.setBounds(180, 10, 100, 20);
        add(baseField);

        add(new JLabel("Altura del equilatero:")).setBounds(10, 40, 120, 20);
        alturaField = new JTextField();
        alturaField.setBounds(180, 40, 100, 20);
        add(alturaField);

        add(new JLabel("Lado 1:")).setBounds(10, 70, 100, 20);
        lado1Field = new JTextField();
        lado1Field.setBounds(180, 70, 100, 20);
        add(lado1Field);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 160, 100, 25);
        add(calcularButton);

        ImageIcon equilateroImg = new ImageIcon("src/main/resources/equilátero.png");
        JLabel equilateroLabel = new JLabel(equilateroImg);
        equilateroLabel.setBounds(290,10,250,202);
        add(equilateroLabel);

        calcularButton.addActionListener( (event) -> {
            figura = new Equilatero( );
            ((Equilatero)figura).setLado1(ReadUtil.string2Double( lado1Field.getText( ) ) );
            ((Equilatero)figura).setAltura(ReadUtil.string2Double( alturaField.getText( ) ) );
            ((Equilatero)figura).setBase(ReadUtil.string2Double( baseField.getText( ) ) );
            areaLabel.setText("Área: " + figura.area());
            perimetroLabel.setText("Perímetro: " + figura.perimetro());
            historiales.addFigura(figura);
        });

        setSize(570, 260);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

