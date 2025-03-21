package org.floresmateo.vista.ventanafiguras;

import org.floresmateo.model.figura.Figura;
import org.floresmateo.model.figura.figura2.Escaleno;
import org.floresmateo.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class VentanaEscaleno extends JFrame
{
    private JTextField baseField, alturaField, lado1Field, lado2Field, lado3Field;
    private JButton calcularButton;
    private Figura figura;

    public VentanaEscaleno(Historiales historiales)
    {
        super("Cálculo del Triángulo Escaleno");
        setLayout(null);

        JLabel areaLabel = new JLabel("Área: ");
        areaLabel.setBounds(10, 160, 500, 20);
        add(areaLabel);

        JLabel perimetroLabel = new JLabel("Perímetro: ");
        perimetroLabel.setBounds(10, 190, 500, 20);
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

        add(new JLabel("Lado 3:")).setBounds(10, 130, 100, 20);
        lado3Field = new JTextField();
        lado3Field.setBounds(120, 130, 100, 20);
        add(lado3Field);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 220, 100, 25);
        add(calcularButton);

        ImageIcon escalenoImg = new ImageIcon("src/main/resources/escaleno.png");
        JLabel escalenoLabel = new JLabel(escalenoImg);
        escalenoLabel.setBounds(240,10,200,200);
        add(escalenoLabel);

        calcularButton.addActionListener(e -> {
            figura = new Escaleno();
            ((Escaleno) figura).setBase(ReadUtil.string2Double(baseField.getText()));
            ((Escaleno) figura).setAltura(ReadUtil.string2Double(alturaField.getText()));
            ((Escaleno) figura).setLado1(ReadUtil.string2Double(lado1Field.getText()));
            ((Escaleno) figura).setLado2(ReadUtil.string2Double(lado2Field.getText()));
            ((Escaleno) figura).setLado3(ReadUtil.string2Double(lado3Field.getText()));

            areaLabel.setText("Área: " + figura.area());
            perimetroLabel.setText("Perímetro: " + figura.perimetro());
            historiales.addFigura(figura);
        });

        setSize(470, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
