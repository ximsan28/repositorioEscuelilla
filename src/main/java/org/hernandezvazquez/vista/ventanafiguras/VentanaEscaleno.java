package org.hernandezvazquez.vista.ventanafiguras;

import org.gerdoc.historial.Historiales;
import org.hernandezvazquez.model.figura.Figura;
import org.hernandezvazquez.model.figura.figura2.Escaleno;
import org.hernandezvazquez.util.ReadUtil;

import javax.swing.*;

public class VentanaEscaleno extends JFrame {
    private JTextField baseField, alturaField, lado1Field, lado2Field, lado3Field;
    private JButton calcularButton;
    private JLabel areaLabel, perimetroLabel;
    private Figura figura;

    public VentanaEscaleno(Historiales historiales) {
        super("Cálculo del Triángulo Escaleno");
        initComponents(historiales);
        setSize(360, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
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
        JLabel lado3Label = new JLabel("Lado 3:");
        lado3Field = new JTextField(10);
        calcularButton = new JButton("Calcular");
        areaLabel = new JLabel("Área: ");
        perimetroLabel = new JLabel("Perímetro: ");
        ImageIcon escalenoImg = new ImageIcon("src/main/resources/escaleno.png");
        JLabel escalenoLabel = new JLabel(escalenoImg);

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
                                        .addComponent(lado1Label)
                                        .addComponent(lado2Label)
                                        .addComponent(lado3Label))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(baseField)
                                        .addComponent(alturaField)
                                        .addComponent(lado1Field)
                                        .addComponent(lado2Field)
                                        .addComponent(lado3Field)))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(escalenoLabel)
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
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lado3Label)
                                .addComponent(lado3Field))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(escalenoLabel)
        );

        add(panel);
    }
}
