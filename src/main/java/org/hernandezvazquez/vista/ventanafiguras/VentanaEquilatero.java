package org.hernandezvazquez.vista.ventanafiguras;

import org.gerdoc.historial.Historiales;
import org.hernandezvazquez.model.figura.Equilatero;
import org.hernandezvazquez.model.figura.Figura;
import org.hernandezvazquez.util.ReadUtil;

import javax.swing.*;

public class VentanaEquilatero extends JFrame {
    private JTextField baseField, alturaField, lado1Field;
    private JButton calcularButton;
    private JLabel areaLabel, perimetroLabel;
    private Figura figura;

    public VentanaEquilatero(Historiales historiales) {
        super("Cálculo del Triángulo Equilátero");
        initComponents(historiales);
        setSize(350, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents(Historiales historiales) {
        JLabel baseLabel = new JLabel("Base:");
        baseField = new JTextField(10);
        JLabel alturaLabel = new JLabel("Altura:");
        alturaField = new JTextField(10);
        JLabel lado1Label = new JLabel("Lado:");
        lado1Field = new JTextField(10);
        calcularButton = new JButton("Calcular");
        areaLabel = new JLabel("Área: ");
        perimetroLabel = new JLabel("Perímetro: ");
        ImageIcon equilateroImg = new ImageIcon("src/main/resources/equilátero.png");
        JLabel equilateroLabel = new JLabel(equilateroImg);

        calcularButton.addActionListener(event -> {
            figura = new Equilatero();
            ((Equilatero) figura).setLado1(ReadUtil.string2Double(lado1Field.getText()));
            ((Equilatero) figura).setAltura(ReadUtil.string2Double(alturaField.getText()));
            ((Equilatero) figura).setBase(ReadUtil.string2Double(baseField.getText()));
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
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(baseLabel)
                                        .addComponent(alturaLabel)
                                        .addComponent(lado1Label))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(baseField)
                                        .addComponent(alturaField)
                                        .addComponent(lado1Field)))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(equilateroLabel)
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
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(equilateroLabel)
        );

        add(panel);
    }
}
