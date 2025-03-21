package org.floresmateo.vista.ventanafiguras;

import org.floresmateo.model.figura.figura2.Escaleno;
import org.floresmateo.model.figura.figura2.Isosceles;
import org.floresmateo.model.figura.Figura;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Ventana;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class VentanaIsosceles extends JFrame
{
    private JTextField baseField, alturaField, lado1Field, lado2Field;
    private JButton calcularButton;
    private Figura figura;

    public  VentanaIsosceles(Historiales historiales){
        super("Cálculo del Triángulo Isósceles");
        setLayout(null);

        JLabel areaLabel = new JLabel("Área: ");
        areaLabel.setBounds(10, 130, 500, 20);
        add(areaLabel);

        JLabel perimetroLabel = new JLabel("Perímetro: ");
        perimetroLabel.setBounds(10, 160, 500, 20);
        add(perimetroLabel);

        add(new JLabel("Base:")).setBounds(10, 10, 100, 20);
        baseField = new JTextField();
        baseField.setBounds(120, 10, 100, 20);
        add(baseField);

        add(new JLabel("Altura:")).setBounds(10, 40, 100, 20);
        alturaField = new JTextField();
        alturaField.setBounds(120, 40, 100, 20);
        add(alturaField);

        add(new JLabel("Lado 1:")).setBounds(10, 70, 100, 20);
        lado1Field = new JTextField();
        lado1Field.setBounds(120, 70, 100, 20);
        add(lado1Field);

        add(new JLabel("Lado 2:")).setBounds(10, 100, 100, 20);
        lado2Field = new JTextField();
        lado2Field.setBounds(120, 100, 100, 20);
        add(lado2Field);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 190, 130, 25);
        add(calcularButton);

        ImageIcon isoscelesImg = new ImageIcon("src/main/resources/isósceles.png");
        JLabel isoscelesLabel = new JLabel(isoscelesImg);
        isoscelesLabel.setBounds(240,10,185,250);
        add( isoscelesLabel );

        calcularButton.addActionListener(e -> {
            figura = new Isosceles();
            ((Isosceles) figura).setBase(ReadUtil.string2Double(baseField.getText()));
            ((Isosceles) figura).setAltura(ReadUtil.string2Double(alturaField.getText()));
            ((Isosceles) figura).setLado1(ReadUtil.string2Double(lado1Field.getText()));
            ((Isosceles) figura).setLado2(ReadUtil.string2Double(lado2Field.getText()));

            areaLabel.setText("Área: " + figura.area());
            perimetroLabel.setText("Perímetro: " + figura.perimetro());
            historiales.addFigura(figura);
        });

        setSize(455, 310);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }
}
