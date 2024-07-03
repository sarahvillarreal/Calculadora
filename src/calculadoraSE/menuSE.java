package calculadoraSE;

import calculadoraSE.SistemadeEcuaciones;
import calculadoraSE.SistemadeEcuaciones3;
import calculadoraVectores.vectores;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;

public class menuSE {

    private JFrame menuSEFrame;

    public menuSE() {
        menuSEFrame = new JFrame("Opciones");
        menuSEFrame.getContentPane().setBackground(new Color(255, 255, 255));
        menuSEFrame.setBounds(537, 69, 292, 225);
        menuSEFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuSEFrame.setResizable(false);
        menuSEFrame.setVisible(true);
        

        // Boton para abrir 2x2
        JButton dosButton = new JButton("2x2");
        dosButton.setFont(new Font("Ebrima", Font.BOLD, 14));
        dosButton.setBounds(40, 36, 80, 30);
        dosButton.setIcon(new ImageIcon("src\\imagenes\\btn2y3.png"));
        dosButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btn2y31.png"));
        dosButton.setHorizontalTextPosition(SwingConstants.CENTER);
        dosButton.setForeground(new Color(30, 30, 30));
        dosButton.setBorder(null);
        dosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de la calculadora 2x2
            	SistemadeEcuaciones.main(new String[]{});
            }
        });

        // Boton para abrir 3x3
        JButton tresButton = new JButton("3x3");
        tresButton.setFont(new Font("Ebrima", Font.BOLD, 14));
        tresButton.setBounds(152, 36, 80, 30);
        tresButton.setIcon(new ImageIcon("src\\imagenes\\btn2y3.png"));
        tresButton.setRolloverIcon(new ImageIcon("src\\imagenes\\btn2y31.png"));
        tresButton.setHorizontalTextPosition(SwingConstants.CENTER);
        tresButton.setForeground(new Color(30, 30, 30));
        tresButton.setBorder(null);
        tresButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de la calculadora 3x3
            	SistemadeEcuaciones3.main(new String[]{});
            }
        });
        

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(255, 255, 255));
        buttonPanel.add(dosButton);
        buttonPanel.add(tresButton);
        buttonPanel.setLayout(null);

        menuSEFrame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        
        
     // Panel para los textos
        JPanel textosPanel = new JPanel();
        textosPanel.setMinimumSize(new Dimension(292, 70));
        textosPanel.setMaximumSize(new Dimension(292, 70));
        textosPanel.setBackground(new Color(255, 255, 255));
        textosPanel.setLayout(new BorderLayout()); 
        textosPanel.setPreferredSize(new Dimension(292, 70));
        
        JLabel texto = new JLabel("Sistema de Ecuaciones");
        texto.setVerticalAlignment(SwingConstants.BOTTOM);
        texto.setBackground(new Color(255, 255, 255));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("Ebrima", Font.BOLD, 19));
        textosPanel.add(texto, BorderLayout.CENTER);

        menuSEFrame.getContentPane().add(textosPanel, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crear y mostrar el menu
                new menuSE();
            }
        });
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}