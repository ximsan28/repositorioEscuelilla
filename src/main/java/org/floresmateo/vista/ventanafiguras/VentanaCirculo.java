package org.floresmateo.vista.ventanafiguras;

import org.floresmateo.model.figura.Circulo;
import org.floresmateo.model.figura.Figura;
import org.floresmateo.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class VentanaCirculo extends JFrame
{
    private JTextField radioField;
    private JButton calcularButton;
    private Figura figura;

    public VentanaCirculo(Historiales historiales)
    {
        super("Cálculo del Círculo");
        setLayout(null);

        JLabel areaLabel = new JLabel("Área: ");
        areaLabel.setBounds(10, 40, 500, 20);
        add(areaLabel);

        JLabel perimetroLabel = new JLabel("Perímetro: ");
        perimetroLabel.setBounds(10, 70, 500, 20);
        add(perimetroLabel);

        add(new JLabel("Radio:")).setBounds(10, 10, 100, 20);
        radioField = new JTextField();
        radioField.setBounds(120, 10, 100, 20);
        add(radioField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 100, 100, 25);
        add(calcularButton);

        ImageIcon circuloImg = new ImageIcon("src/main/resources/círculo.png");
        JLabel circuloLabel = new JLabel(circuloImg);
        circuloLabel.setBounds(240,10,280,280);
        add(circuloLabel);

        calcularButton.addActionListener( (event) -> {
            figura = new Circulo( );
            ((Circulo)figura).setRadio(ReadUtil.string2Double( radioField.getText( ) ) );

            areaLabel.setText("Área: " + figura.area());
            perimetroLabel.setText("Perímetro: " + figura.perimetro());
            historiales.addFigura(figura);
        });

        setSize(550, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
