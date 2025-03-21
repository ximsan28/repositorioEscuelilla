package org.hernandezvazquez.vista.ventanafiguras;

import org.gerdoc.historial.Historiales;
import org.hernandezvazquez.model.figura.Cuadrado;
import org.hernandezvazquez.model.figura.Figura;
import org.hernandezvazquez.util.ReadUtil;


import javax.swing.*;

public class VentanaCuadrado extends JFrame {
    private JTextField ladoField;
    private JButton calcularButton;
    private JLabel areaLabel;
    private JLabel perimetroLabel;
    private Figura figura;

    public VentanaCuadrado(Historiales historiales) {
        super("Cálculo del Cuadrado");
        initComponents(historiales);
        setSize(350, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents(Historiales historiales) {
        JLabel ladoLabel = new JLabel("Lado:");
        ladoField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        areaLabel = new JLabel("Área: ");
        perimetroLabel = new JLabel("Perímetro: ");
        ImageIcon cuadradoImg = new ImageIcon("src/main/resources/cuadrado.png");
        JLabel cuadradoLabel = new JLabel(cuadradoImg);

        calcularButton.addActionListener(e -> {
            figura = new Cuadrado();
            ((Cuadrado) figura).setLado(ReadUtil.string2Double(ladoField.getText()));
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
                                .addComponent(ladoLabel)
                                .addComponent(ladoField))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(cuadradoLabel)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ladoLabel)
                                .addComponent(ladoField))
                        .addComponent(calcularButton)
                        .addComponent(areaLabel)
                        .addComponent(perimetroLabel)
                        .addComponent(cuadradoLabel)
        );

        add(panel);
    }
}
