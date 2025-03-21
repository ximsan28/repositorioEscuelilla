package org.hernandezvazquez.vista.ventanafiguras;

import org.gerdoc.historial.Historiales;
import org.hernandezvazquez.model.figura.figura2.Isosceles;
import org.hernandezvazquez.model.figura.Figura;
import org.hernandezvazquez.util.ReadUtil;

import javax.swing.*;

public class VentanaIsosceles extends JFrame {
    private JTextField baseField, alturaField, lado1Field, lado2Field;
    private JButton calcularButton;
    private JLabel areaLabel, perimetroLabel;
    private Figura figura;

    public VentanaIsosceles(Historiales historiales) {
        super("Cálculo del Triángulo Isósceles");
        initComponents(historiales);
    }

    private void initComponents(Historiales historiales) {
        JLabel baseLabel = new JLabel("Base:");
        baseField = new JTextField(10);

        JLabel alturaLabel = new JLabel("Altura:");
        alturaField = new JTextField(10);

        JLabel lado1Label = new JLabel("Lado 1:");
        lado1Field = new JTextField(10);

        JLabel lado2Label = new JLabel("Lado 2:");
        lado2Field = new JTextField(10);

        calcularButton = new JButton("Calcular");
        areaLabel = new JLabel("Área: ");
        perimetroLabel = new JLabel("Perímetro: ");

        ImageIcon isoscelesImg = new ImageIcon("src/main/resources/isósceles.png");
        JLabel isoscelesLabel = new JLabel(isoscelesImg);
        isoscelesLabel.setBounds(200, 10, 185, 250);

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

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(baseLabel)
                                .addComponent(alturaLabel)
                                .addComponent(lado1Label)
                                .addComponent(lado2Label)
                                .addComponent(calcularButton)
                                .addComponent(areaLabel)
                                .addComponent(perimetroLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(baseField)
                                .addComponent(alturaField)
                                .addComponent(lado1Field)
                                .addComponent(lado2Field))
                        .addComponent(isoscelesLabel)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(baseLabel)
                                .addComponent(baseField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(alturaLabel)
                                .addComponent(alturaField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lado1Label)
                                .addComponent(lado1Field))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lado2Label)
                                .addComponent(lado2Field))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(isoscelesLabel)
        );

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
