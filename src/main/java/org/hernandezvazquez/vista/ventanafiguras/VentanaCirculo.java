package org.hernandezvazquez.vista.ventanafiguras;

import org.hernandezvazquez.model.figura.Circulo;
import org.hernandezvazquez.model.figura.Figura;
import org.hernandezvazquez.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class VentanaCirculo extends JFrame {
    private JTextField radioField;
    private JButton calcularButton;
    private JLabel areaLabel;
    private JLabel perimetroLabel;
    private Figura figura;

    public VentanaCirculo(Historiales historiales) {
        super("Cálculo del Círculo");
        initComponents(historiales);
        setSize(400, 500); // Ajustar tamaño para mayor altura y menor ancho
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents(Historiales historiales) {
        JLabel radioLabel = new JLabel("Radio:");
        radioField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        areaLabel = new JLabel("Área: ");
        perimetroLabel = new JLabel("Perímetro: ");
        ImageIcon circuloImg = new ImageIcon("src/main/resources/círculo.png");
        JLabel circuloLabel = new JLabel(circuloImg);

        calcularButton.addActionListener(event -> {
            figura = new Circulo();
            ((Circulo) figura).setRadio(ReadUtil.string2Double(radioField.getText()));
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
                                .addComponent(radioLabel)
                                .addComponent(radioField))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(circuloLabel)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radioLabel)
                                .addComponent(radioField))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(circuloLabel)
        );

        add(panel);
    }
}
