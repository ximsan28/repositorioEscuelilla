package org.hernandezvazquez.vista;

import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Ejecutable;
import org.hernandezvazquez.vista.ventanafiguras.*;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private Historiales historiales;

    private Ventana() {
        super("Programa de Figuras");
        init();
    }

    private void init() {
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("+ Programa de Figuras +", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        panel.add(titulo, gbc);

        JPanel panelBotones = new JPanel(new GridLayout(5, 1, 10, 10));

        JButton botonCuadrado = new JButton("Cuadrado");
        botonCuadrado.addActionListener(e -> new VentanaCuadrado(historiales));
        panelBotones.add(botonCuadrado);

        JButton botonEquilatero = new JButton("Triángulo Equilátero");
        botonEquilatero.addActionListener(e -> new VentanaEquilatero(historiales));
        panelBotones.add(botonEquilatero);

        JButton botonIsosceles = new JButton("Triángulo Isósceles");
        botonIsosceles.addActionListener(e -> new VentanaIsosceles(historiales));
        panelBotones.add(botonIsosceles);

        JButton botonEscaleno = new JButton("Triángulo Escaleno");
        botonEscaleno.addActionListener(e -> new VentanaEscaleno(historiales));
        panelBotones.add(botonEscaleno);

        JButton botonCirculo = new JButton("Círculo");
        botonCirculo.addActionListener(e -> new VentanaCirculo(historiales));
        panelBotones.add(botonCirculo);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(panelBotones, gbc);

        add(panel);
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}
