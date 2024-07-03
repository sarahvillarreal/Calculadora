package calculadoraVectores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class vectores extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField[] vector1Fields;
    private JTextField[] vector2Fields;
    private JTextField scalarField;
    private int vectorSize;

    public vectores(int vectorSize) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(255, 255, 255));
        this.vectorSize = vectorSize;
        if(vectorSize>12)
        {
        	vectorSize=12;
        }
        setTitle("Operaciones con Vectores");
        setSize(649, 593);
        setBounds(191,69,640,590);

        // Panel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(4, 1));
        inputPanel.setBackground(new Color(255, 255, 255));

        // Vector 1
        JPanel vector1Panel = new JPanel();
        vector1Panel.setBackground(new Color(255, 255, 255));
        JLabel label_2 = new JLabel("Vector 1: ");
        label_2.setFont(new Font("Ebrima", Font.BOLD, 18));
        vector1Panel.add(label_2);
        vector1Fields = new JTextField[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            vector1Fields[i] = new JTextField(3);
            vector1Panel.add(vector1Fields[i]);
        }
        inputPanel.add(vector1Panel);

        // Vector 2
        JPanel vector2Panel = new JPanel();
        vector2Panel.setBackground(new Color(255, 255, 255));
        JLabel label_1 = new JLabel("Vector 2: ");
        label_1.setFont(new Font("Ebrima", Font.BOLD, 18));
        vector2Panel.add(label_1);
        vector2Fields = new JTextField[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            vector2Fields[i] = new JTextField(3);
            vector2Panel.add(vector2Fields[i]);
        }
        inputPanel.add(vector2Panel);

        // Escalar
        JPanel scalarPanel = new JPanel();
        scalarPanel.setBackground(new Color(255, 255, 255));
        JLabel label = new JLabel("Escalar: ");
        label.setFont(new Font("Ebrima", Font.BOLD, 18));
        scalarPanel.add(label);
        scalarField = new JTextField(5);
        scalarPanel.add(scalarField);
        inputPanel.add(scalarPanel);

        // Panel de botones
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        buttonPanel.setBackground(new Color(255, 255, 255));

        JButton sumButton = new JButton("Sumar");
        sumButton.setPreferredSize(new Dimension(188, 45));
        sumButton.setMinimumSize(new Dimension(188, 45));
        sumButton.setMaximumSize(new Dimension(188, 45));
        sumButton.setBorderPainted(false);
        sumButton.setBackground(new Color(150, 201, 242));
        sumButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSum();
            }
        });

        JButton scalarMultiplyButton = new JButton("Multiplicar por escalar");
        scalarMultiplyButton.setBorderPainted(false);
        scalarMultiplyButton.setBackground(new Color(150, 201, 242));
        scalarMultiplyButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        scalarMultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performScalarMultiplication();
            }
        });

        JButton subtractButton = new JButton("Restar");
        subtractButton.setBorderPainted(false);
        subtractButton.setBackground(new Color(150, 201, 242));
        subtractButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSubtract();
            }
        });

        JButton dotProductButton = new JButton("Producto escalar");
        dotProductButton.setBorderPainted(false);
        dotProductButton.setBackground(new Color(150, 201, 242));
        dotProductButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        dotProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDotProduct();
            }
        });

        JButton crossProductButton = new JButton("Producto vectorial");
        crossProductButton.setBorderPainted(false);
        crossProductButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        crossProductButton.setBackground(new Color(150, 201, 242));
        crossProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performCrossProduct();
            }
        });

        JButton clearButton = new JButton("Borrar");
        clearButton.setBorderPainted(false);
        clearButton.setBackground(new Color(150, 201, 242));
        clearButton.setFont(new Font("Ebrima", Font.PLAIN, 13));
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Añadir botones al panel
        buttonPanel.add(sumButton);
        buttonPanel.add(scalarMultiplyButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(dotProductButton);
        buttonPanel.add(crossProductButton);
        buttonPanel.add(clearButton);

        // Layout principal
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(inputPanel, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE)
        					.addGap(22))))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(66)
        			.addComponent(inputPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(113)
        			.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(153, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);
    }

    private void performSum() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double[] result = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        displayResult("Suma", result);
    }

    private void performSubtract() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double[] result = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            result[i] = vector1[i] - vector2[i];
        }
        displayResult("Resta", result);
    }

    private void performScalarMultiplication() {
        if (scalarField.getText().trim().isEmpty()) {
            displayError("Debe ingresar un valor escalar.");
            return;
        }
        double[] vector = getVector(vector1Fields);
        double scalar = Double.parseDouble(scalarField.getText());
        double[] result = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            result[i] = vector[i] * scalar;
        }
        displayResult("Multiplicación por escalar", result);
    }

    private void performDotProduct() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        double result = 0;
        for (int i = 0; i < vectorSize; i++) {
            result += vector1[i] * vector2[i];
        }
        displayResult("Producto escalar", new double[]{result});
    }

    private void performCrossProduct() {
        double[] vector1 = getVector(vector1Fields);
        double[] vector2 = getVector(vector2Fields);
        if (vector1.length != 4 || vector2.length != 4) {
            displayError("Ambos vectores deben ser de tamaño 4.");
            return;
        }
        double[] result = new double[4];
        result[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        result[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        result[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        result[3] = 0; // El cuarto componente siempre es 0 
        displayResult("Producto vectorial", result);
    }

    private double[] getVector(JTextField[] fields) {
        double[] vector = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            vector[i] = Double.parseDouble(fields[i].getText());
        }
        return vector;
    }

    private void displayResult(String operation, double[] result) {
        JFrame resultFrame = new JFrame(operation);
        resultFrame.setBounds(360, 300, 310, 180); 
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        StringBuilder resultString = new StringBuilder(operation + ": ");
        for (double v : result) {
            resultString.append(v).append(" ");
        }
        resultArea.setText(resultString.toString());
        resultFrame.getContentPane().add(new JScrollPane(resultArea));
        resultFrame.setVisible(true);
    }

    private void displayError(String message) {
        JFrame errorFrame = new JFrame("Error");
        errorFrame.setBounds(360, 300, 310, 180);
        JTextArea errorArea = new JTextArea();
        errorArea.setEditable(false);
        errorArea.setText(message);
        errorFrame.getContentPane().add(new JScrollPane(errorArea));
        errorFrame.setVisible(true);
    }

    private void clearFields() {
        // Borra todos los campos de texto
        for (JTextField field : vector1Fields) {
            field.setText("");
        }
        for (JTextField field : vector2Fields) {
            field.setText("");
        }
        scalarField.setText("");
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Tamaño del vector:");
        int vectorSize = Integer.parseInt(input);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vectores(vectorSize).setVisible(true);
            }
        });
    }
}
