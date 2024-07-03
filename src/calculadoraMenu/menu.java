package calculadoraMenu;

import calculadoraNumeros.calculadora;
import calculadoraMatriz.interfazMatriz;
import calculadoraVectores.vectores;
import calculadoraSE.menuSE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {

    private JFrame menuFrame;

    public menu() {
        menuFrame = new JFrame("Menú");
        menuFrame.getContentPane().setBackground(new Color(255, 255, 255));
        menuFrame.setBounds(191, 69, 362, 590);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.getContentPane().setLayout(new BoxLayout(menuFrame.getContentPane(), BoxLayout.Y_AXIS));
        
        // Espacio
        menuFrame.getContentPane().add(Box.createVerticalStrut(40));
        
        // Panel para el primer texto
        JPanel textosPanel = new JPanel();
        textosPanel.setBackground(new Color(255, 255, 255));
        JLabel texto = new JLabel("Calculadora");
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("Ebrima", Font.BOLD, 24));
        textosPanel.add(texto);

        textosPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, textosPanel.getPreferredSize().height));
        menuFrame.getContentPane().add(textosPanel);
        
        // Espacio entre los textos
        menuFrame.getContentPane().add(Box.createVerticalStrut(80));
        
        // Panel para el segundo texto
        JPanel textosPanel2 = new JPanel();
        textosPanel2.setLayout(new BoxLayout(textosPanel2, BoxLayout.Y_AXIS));
        textosPanel2.setBackground(new Color(255, 255, 255));
        
        JLabel texto2 = new JLabel("Seleccione el tipo de calculadora que");
        texto2.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto2.setFont(new Font("Ebrima", Font.BOLD, 15));
        
        JLabel texto3 = new JLabel("desea utilizar:");
        texto3.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto3.setFont(new Font("Ebrima", Font.BOLD, 15));
        
        textosPanel2.add(texto2);
        textosPanel2.add(Box.createVerticalStrut(5));
        textosPanel2.add(texto3);

        textosPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, textosPanel2.getPreferredSize().height));
        menuFrame.getContentPane().add(textosPanel2);
        
        // Espacio entre el segundo texto y los botones
        menuFrame.getContentPane().add(Box.createVerticalStrut(30));

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(255, 255, 255));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // Boton para abrir la calculadora de números
        JButton numerosButton = new JButton("Números");
        numerosButton.setMinimumSize(new Dimension(147, 30));
        numerosButton.setMaximumSize(new Dimension(147, 30));
        numerosButton.setFont(new Font("Ebrima", Font.BOLD, 13));
        numerosButton.setIcon(new ImageIcon("src\\imagenes\\btnn.png"));
        numerosButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btnn1.png"));
        numerosButton.setHorizontalTextPosition(SwingConstants.CENTER);
        numerosButton.setForeground(new Color(30, 30, 30));
        numerosButton.setBorder(null);
        numerosButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        numerosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculadora Calculadora = new calculadora();
                Calculadora.setVisible(true);
            }
        });
        buttonPanel.add(numerosButton);
        buttonPanel.add(Box.createVerticalStrut(10)); // Espacio entre botones

        // Boton para abrir la calculadora de vectores
        JButton vectoresButton = new JButton("Vectores");
        vectoresButton.setMinimumSize(new Dimension(147, 30));
        vectoresButton.setMaximumSize(new Dimension(147, 30));
        vectoresButton.setFont(new Font("Ebrima", Font.BOLD, 13));
        vectoresButton.setIcon(new ImageIcon("src\\imagenes\\btnn.png"));
        vectoresButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btnn1.png"));
        vectoresButton.setHorizontalTextPosition(SwingConstants.CENTER);
        vectoresButton.setForeground(new Color(30, 30, 30));
        vectoresButton.setBorder(null);
        vectoresButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        vectoresButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vectores.main(new String[]{});
            }
        });
        buttonPanel.add(vectoresButton);
        buttonPanel.add(Box.createVerticalStrut(10)); // Espacio entre botones

        // Boton para abrir la calculadora de matrices
        JButton matricesButton = new JButton("Matrices");
        matricesButton.setMinimumSize(new Dimension(147, 30));
        matricesButton.setMaximumSize(new Dimension(147, 30));
        matricesButton.setFont(new Font("Ebrima", Font.BOLD, 13));
        matricesButton.setIcon(new ImageIcon("src\\imagenes\\btnn.png"));
        matricesButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btnn1.png"));
        matricesButton.setHorizontalTextPosition(SwingConstants.CENTER);
        matricesButton.setForeground(new Color(30, 30, 30));
        matricesButton.setBorder(null);
        matricesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        matricesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                interfazMatriz InterfazMatriz = new interfazMatriz();
                InterfazMatriz.setVisible(true);
            }
        });
        buttonPanel.add(matricesButton);
        buttonPanel.add(Box.createVerticalStrut(10)); // Espacio entre botones

        // Boton para abrir la calculadora de sistema de ecuaciones
        JButton seButton = new JButton("Sistema de Ecuaciones");
        seButton.setMinimumSize(new Dimension(147, 30));
        seButton.setMaximumSize(new Dimension(147, 30));
        seButton.setFont(new Font("Ebrima", Font.BOLD, 13));
        seButton.setIcon(new ImageIcon("src\\imagenes\\btnn.png"));
        seButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btnn1.png"));
        seButton.setHorizontalTextPosition(SwingConstants.CENTER);
        seButton.setForeground(new Color(30, 30, 30));
        seButton.setBorder(null);
        seButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        seButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuSE MenuSE = new menuSE();
                MenuSE.setVisible(true);
            }
        });
        buttonPanel.add(seButton);
        
        menuFrame.getContentPane().add(buttonPanel);
        
        menuFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new menu();
            }
        });
    }
}
