package Grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout.Alignment;

public class CalculadoraVectores extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField[] vector1Fields;
    private JTextField[] vector2Fields;
    private JTextField scalarField;
    private JTextArea resultArea;

    public CalculadoraVectores() {
        setTitle("Operaciones con Vectores");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(4, 1));
        inputPanel.setBackground(new Color(225, 239, 255));

        // Vector 1
        JPanel vector1Panel = new JPanel();
        vector1Panel.setBackground(new Color(225, 239, 255));
        JLabel label_2 = new JLabel("Vector 1: ");
        label_2.setFont(new Font("Ebrima", Font.BOLD, 13));
        label_2.setVerticalAlignment(SwingConstants.TOP);
        vector1Panel.add(label_2);
        vector1Fields = new JTextField[4];
        for (int i = 0; i < 4; i++) {
            vector1Fields[i] = new JTextField(3);
            vector1Panel.add(vector1Fields[i]);
        }
        inputPanel.add(vector1Panel);

        // Vector 2
        JPanel vector2Panel = new JPanel();
        vector2Panel.setBackground(new Color(225, 239, 255));
        JLabel label_1 = new JLabel("Vector 2: ");
        label_1.setFont(new Font("Ebrima", Font.BOLD, 13));
        label_1.setVerticalAlignment(SwingConstants.TOP);
        label_1.setToolTipText("");
        vector2Panel.add(label_1);
        vector2Fields = new JTextField[4];
        for (int i = 0; i < 4; i++) {
            vector2Fields[i] = new JTextField(3);
            vector2Panel.add(vector2Fields[i]);
        }
        inputPanel.add(vector2Panel);

        // escalar
        JPanel scalarPanel = new JPanel();
        scalarPanel.setBackground(new Color(225, 239, 255));
        JLabel label = new JLabel("Escalar: ");
        label.setFont(new Font("Ebrima", Font.BOLD, 13));
        label.setBackground(new Color(240, 240, 240));
        scalarPanel.add(label);
        scalarField = new JTextField(5);
        scalarPanel.add(scalarField);
        inputPanel.add(scalarPanel);

        // Área de resultado
        resultArea = new JTextArea();
        resultArea.setToolTipText("");
        resultArea.setForeground(new Color(0, 0, 0));
        resultArea.setFont(new Font("Ebrima", Font.PLAIN, 16));
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        
                // Botones para operaciones
                JPanel buttonPanel = new JPanel();
                scrollPane.setColumnHeaderView(buttonPanel);
                JButton sumButton = new JButton("Sumar");
                sumButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
                sumButton.setBackground(SystemColor.control);
                JButton subtractButton = new JButton("Restar");
                subtractButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
                subtractButton.setBackground(SystemColor.control);
                JButton scalarMultiplyButton = new JButton("Multiplicar por escalar");
                scalarMultiplyButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
                scalarMultiplyButton.setBackground(SystemColor.control);
                JButton dotProductButton = new JButton("Producto escalar");
                dotProductButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
                dotProductButton.setBackground(SystemColor.control);
                JButton crossProductButton = new JButton("Producto vectorial");
                crossProductButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
                crossProductButton.setBackground(SystemColor.control);
                
                        buttonPanel.add(sumButton);
                        buttonPanel.add(subtractButton);
                        buttonPanel.add(scalarMultiplyButton);
                        buttonPanel.add(dotProductButton);
                        buttonPanel.add(crossProductButton);
                        GroupLayout groupLayout = new GroupLayout(getContentPane());
                        groupLayout.setHorizontalGroup(
                        	groupLayout.createParallelGroup(Alignment.LEADING)
                        		.addComponent(inputPanel, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                        		.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                        );
                        groupLayout.setVerticalGroup(
                        	groupLayout.createParallelGroup(Alignment.LEADING)
                        		.addGroup(groupLayout.createSequentialGroup()
                        			.addComponent(inputPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
                        );
                        getContentPane().setLayout(groupLayout);

        // Agregar listeners a los botones
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSum();
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSubtract();
            }
        });

        scalarMultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performScalarMultiplication();
            }
        });

        dotProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDotProduct();
            }
        });

        crossProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCrossProduct();
            }
        });
    }

    private void performSum() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double[] result = new double[4];
        for (int i = 0; i < 4; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        displayResult("Suma", result);
    }

    private void performSubtract() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double[] result = new double[4];
        for (int i = 0; i < 4; i++) {
            result[i] = vector1[i] - vector2[i];
        }
        displayResult("Resta", result);
    }

    private void performScalarMultiplication() {
        double[] vector = getVector(vector1Fields);
        double scalar = Double.parseDouble(scalarField.getText());
        double[] result = new double[4];
        for (int i = 0; i < 4; i++) {
            result[i] = vector[i] * scalar;
        }
        displayResult("Multiplicación por escalar", result);
    }

    private void performDotProduct() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double result = 0;
        for (int i = 0; i < 4; i++) {
            result += vector1[i] * vector2[i];
        }
        resultArea.setText("Producto escalar: " + result);
    }

    private void performCrossProduct() {
        // Producto vectorial extendido para vectores de tamaño 4
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        if (vector1.length != 4 || vector2.length != 4) {
            resultArea.setText("Ambos vectores deben ser de tamaño 4.");
            return;
        }
        double[] result = new double[4];
        result[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        result[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        result[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        result[3] = 0; // El cuarto componente siempre es 0 en este contexto
        displayResult("Producto vectorial", result);
    }

    private double[] getVector(JTextField[] fields) {
        double[] vector = new double[4];
        for (int i = 0; i < 4; i++) {
            vector[i] = Double.parseDouble(fields[i].getText());
        }
        return vector;
    }

    private void displayResult(String operation, double[] result) {
        StringBuilder resultString = new StringBuilder(operation + ": ");
        for (double v : result) {
            resultString.append(v).append(" ");
        }
        resultArea.setText(resultString.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraVectores().setVisible(true);
            }
        });
    }
}