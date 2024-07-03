package calculadoraMatriz;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class interfazMatriz implements ActionListener {

    JFrame winPrinInterMat;
    JMenuBar barraMenu;
    JMenu jMenu1;
    JMenuItem jMenu11;
    Panel jPMatriz1, jPMatriz2, jpEscalar, jPOperaciones;
    JLabel jlNumeroEscalar;
    JTextField jTMatriz1[][], jTMatriz2[][], jtEscalar;
    Choice chMatriz11, chMatriz12, chMatriz21, chMatriz22;
    JButton jbLimpiar, jbSuma, jbResta, jbMulti, jbMultiMulti, jbDeterminante, jbInversa, jbDivision;

    public interfazMatriz() {
        winPrinInterMat = new JFrame("Calculadora De Matriz");
        winPrinInterMat.setBackground(new Color(240, 240, 240));
        winPrinInterMat.getContentPane().setBackground(new Color(255, 255, 255));
        winPrinInterMat.getContentPane().setLayout(new BorderLayout(2, 2));

        menuPrincipal();
        operaciones();
        matriz1();
        matriz2();

        winPrinInterMat.getContentPane().add(BorderLayout.NORTH, barraMenu);
        winPrinInterMat.getContentPane().add(BorderLayout.EAST, jPOperaciones);
        winPrinInterMat.getContentPane().add(BorderLayout.WEST, jPMatriz1);
        winPrinInterMat.getContentPane().add(BorderLayout.CENTER, jPMatriz2);

        winPrinInterMat.setFont(new Font("Ebrima", Font.BOLD, 20));
        winPrinInterMat.setBounds(191, 69, 640, 590);
        winPrinInterMat.setVisible(true);
        winPrinInterMat.setResizable(false);
        winPrinInterMat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void menuPrincipal() {

        //Barra de menu, contiene los menus que se muestran y los submenus
        barraMenu = new JMenuBar();
        barraMenu.setBorderPainted(false);
        barraMenu.setBackground(new Color(255, 255, 255));

        //Menus
        jMenu1 = new JMenu("");
        jMenu1.setBackground(new Color(255, 255, 255));

        //Opciones primer menu
        jMenu11 = new JMenuItem("Salir");

        //Añadir Item al menu 1        
        jMenu1.add(jMenu11);

        //Añadiendo menus a la barra de menu
        barraMenu.add(jMenu1);

        //añadiendo eventos de click        
        jMenu11.addActionListener(this);
    }

    public void operaciones() {
    	
    	/*btnAC.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnAC.setForeground(new Color(30, 30, 30));
		btnAC.setRolloverIcon(new ImageIcon("src\\imagenes\\btnac.png"));
		btnAC.setBorder(null);
		btnAC.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAC.setIcon(new ImageIcon("src\\imagenes\\btnac1.png"));*/

        jPOperaciones = new Panel();
        jPOperaciones.setBackground(new Color(255, 255, 255));
        jPOperaciones.setLayout(null);

        jbLimpiar = new JButton("AC");
        jbLimpiar.setFont(new Font("Ebrima", Font.BOLD, 20));
        jbLimpiar.setForeground(new Color(30, 30, 30));
        jbLimpiar.setRolloverIcon(new ImageIcon("src\\imagenes\\btnac.png"));
        jbLimpiar.setBorder(null);
        jbLimpiar.setHorizontalTextPosition(SwingConstants.CENTER);
        jbLimpiar.setIcon(new ImageIcon("src\\imagenes\\btnac1.png"));
        
        
        jbSuma = new JButton("+");
        jbSuma.setIcon(new ImageIcon("src\\imagenes\\btnazul.png"));
        jbSuma.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1.png"));
        jbSuma.setHorizontalTextPosition(SwingConstants.CENTER);
        jbSuma.setForeground(new Color(30, 30, 30));
        jbSuma.setFont(new Font("Ebrima", Font.BOLD, 23));
        jbSuma.setBorder(null);
        
        
        jbResta = new JButton("-");
        jbResta.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1.png"));
        jbResta.setIcon(new ImageIcon("src\\imagenes\\btnazul.png"));
        jbResta.setHorizontalTextPosition(SwingConstants.CENTER);
        jbResta.setForeground(new Color(30, 30, 30));
        jbResta.setFont(new Font("Ebrima", Font.BOLD, 23));
		jbResta.setBorder(null);
        
        
        jbMulti = new JButton("");
        jbMulti.setIcon(new ImageIcon("src\\imagenes\\btnazulxe.png"));
        jbMulti.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1xe.png"));
        jbMulti.setHorizontalTextPosition(SwingConstants.CENTER);
        jbMulti.setForeground(new Color(30, 30, 30));
        jbMulti.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 20));
        jbMulti.setBorder(null);
        
        
        jbMultiMulti = new JButton("x");
        jbMultiMulti.setIcon(new ImageIcon("src\\imagenes\\btnazul.png"));
        jbMultiMulti.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1.png"));
        jbMultiMulti.setHorizontalTextPosition(SwingConstants.CENTER);
        jbMultiMulti.setForeground(new Color(30, 30, 30));
        jbMultiMulti.setFont(new Font("Ebrima", Font.BOLD, 21));
        jbMultiMulti.setBorder(null);
        
        
        jbDeterminante = new JButton("Det");
        jbDeterminante.setIcon(new ImageIcon("src\\imagenes\\btnazul.png"));
        jbDeterminante.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1.png"));
        jbDeterminante.setHorizontalTextPosition(SwingConstants.CENTER);
        jbDeterminante.setForeground(new Color(30, 30, 30));
        jbDeterminante.setFont(new Font("Ebrima", Font.BOLD, 18));
        jbDeterminante.setBorder(null);
        
        
        jbInversa = new JButton("Inv");
        jbInversa.setIcon(new ImageIcon("src\\imagenes\\btnazul.png"));
        jbInversa.setRolloverIcon(new ImageIcon("src\\imagenes\\btnazul1.png"));
        jbInversa.setHorizontalTextPosition(SwingConstants.CENTER);
        jbInversa.setForeground(new Color(30, 30, 30));
        jbInversa.setFont(new Font("Ebrima", Font.BOLD, 18));
        jbInversa.setBorder(null);
        
        
        jbDivision = new JButton("");
        jbDivision.setRolloverIcon(new ImageIcon("src\\imagenes\\btndivision1.png"));
        jbDivision.setIcon(new ImageIcon("src\\imagenes\\btndivision.png"));
        jbDivision.setHorizontalTextPosition(SwingConstants.CENTER);
        jbDivision.setForeground(new Color(30, 30, 30));
        jbDivision.setFont(new Font("Ebrima", Font.PLAIN, 20));
        jbDivision.setBorder(null);
        
        
        

        jbLimpiar.setBounds(0, 25, 50, 50);
        jbSuma.setBounds(0, 85, 50, 50);
        jbResta.setBounds(0, 145, 50, 50);
        jbMulti.setBounds(0, 205, 50, 50);
        jbMultiMulti.setBounds(0, 265, 50, 50);
        jbDeterminante.setBounds(0, 325, 50, 50);
        jbInversa.setBounds(0, 385, 50, 50);
        jbDivision.setBounds(0, 445, 50, 50);

        jPOperaciones.add(jbLimpiar);
        jPOperaciones.add(jbSuma);
        jPOperaciones.add(jbResta);
        jPOperaciones.add(jbMulti);
        jPOperaciones.add(jbMultiMulti);
        jPOperaciones.add(jbDeterminante);
        jPOperaciones.add(jbInversa);
        jPOperaciones.add(jbDivision);

        jbLimpiar.addActionListener(this);
        jbSuma.addActionListener(this);
        jbResta.addActionListener(this);
        jbMulti.addActionListener(this);
        jbMultiMulti.addActionListener(this);
        jbDeterminante.addActionListener(this);
        jbInversa.addActionListener(this);
        jbDivision.addActionListener(this);

        jPOperaciones.setSize(60, 280);
        jPOperaciones.setVisible(true);
    }

    public void matriz1() {

        jPMatriz1 = new Panel();
        jPMatriz1.setBackground(new Color(255, 255, 255));
        jPMatriz1.setLayout(null);

        int f, c;

        JLabel jlNomMat1 = new JLabel("Matriz 1");
        jlNomMat1.setFont(new Font("Ebrima", Font.BOLD, 14));
        

        chMatriz11 = new Choice();
        chMatriz12 = new Choice();

        chMatriz11.addItem("");
        chMatriz12.addItem("");

        //Ciclo para añadir los numeros a los choice
        for (int i = 0; i < 6; i++) {
            chMatriz11.addItem("" + (i + 1));
            chMatriz12.addItem("" + (i + 1));
        }

        jlNomMat1.setBounds(116, 255, 80, 20);
        chMatriz11.setBounds(105, 290, 35, 20);
        chMatriz12.setBounds(145, 290, 35, 20);

        evenChoice evenCh = new evenChoice();

        chMatriz12.addItemListener(evenCh);

        jPMatriz1.add(jlNomMat1);
        jPMatriz1.add(chMatriz11);
        jPMatriz1.add(chMatriz12);

        jPMatriz1.setSize(290, 280);
        jPMatriz1.setVisible(true);
    }

    public void matriz2() {

        jPMatriz2 = new Panel();
        jPMatriz2.setBackground(new Color(255, 255, 255));
        jPMatriz2.setLayout(null);

        int f, c, setX = 50, setY = 5;

        JLabel jlNomMat2 = new JLabel("Matriz 2");
        jlNomMat2.setFont(new Font("Ebrima", Font.BOLD, 14));

        chMatriz21 = new Choice();
        chMatriz22 = new Choice();

        chMatriz21.addItem("");
        chMatriz22.addItem("");

        //Ciclo para añadir los numeros a los choice
        for (int i = 0; i < 6; i++) {
            chMatriz21.addItem("" + (i + 1));
            chMatriz22.addItem("" + (i + 1));
        }

        jTMatriz2 = new JTextField[6][6];

        /*ciclo para añadir el jtextfield bidimensional al panel 2, se uso dos variables
         * setX y setY, las cuales sirven para crear y configurar la posicion en cada iteracion,
         * por cada ciclo de j se suma 35 para dar el salto a la siguiente fila
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                jTMatriz2[i][j] = new JTextField(" ");
                jTMatriz2[i][j].setBounds(setX, setY, 30, 30);
                jTMatriz2[i][j].setHorizontalAlignment(JTextField.RIGHT);
                setX += 35;
            }
            setX = 50;
            setY += 35;
        }

        /*ciclo para añadir los jtextfield al panel 2 y configurar la visibilidad*/
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                jPMatriz2.add(jTMatriz2[i][j]);
                jTMatriz2[i][j].setVisible(false);
            }
        }

        jlNomMat2.setBounds(116, 255, 80, 20);
        chMatriz21.setBounds(105, 290, 35, 20);
        chMatriz22.setBounds(145, 290, 35, 20);

        evenChoice evenCh = new evenChoice();

        chMatriz22.addItemListener(evenCh);

        jPMatriz2.add(jlNomMat2);
        jPMatriz2.add(chMatriz21);
        jPMatriz2.add(chMatriz22);

        jPMatriz2.setSize(290, 280);
        jPMatriz2.setVisible(true);
    }

    public void jpEscalar() {

        jpEscalar = new Panel();
        jpEscalar.setLayout(null);

        //creando componentes
        jlNumeroEscalar = new JLabel("* Escalar ");
        jtEscalar = new JTextField(4);

        //ubicando componentes
        jlNumeroEscalar.setBounds(10, 40, 100, 20);
        jtEscalar.setBounds(120, 40, 40, 20);

        //añadiendo componentes al panel
        jpEscalar.add(jlNumeroEscalar);
        jpEscalar.add(jtEscalar);

        jpEscalar.setVisible(false);
        jpEscalar.setSize(250, 150);
    }

    public void generarMat1(int f, int c) {
        //Metodo para posicionar cuadros de texto de la primera matriz

        int setX = 50, setY = 25;

        jTMatriz1 = new JTextField[f][c];

        /*ciclo para añadir el jtextfield bidimensional al panel 1, se uso dos variables
         * setX y setY, las cuales sirven para crear y configurar la posicion en cada iteracion,
         * por cada ciclo de j se suma 35 para dar el salto a la siguiente fila
         */
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jTMatriz1[i][j] = new JTextField("");
                jTMatriz1[i][j].setBounds(setX, setY, 30, 30);
                jTMatriz1[i][j].setHorizontalAlignment(JTextField.RIGHT);
                setX += 35;
            }
            setX = 50;
            setY += 35;
        }

        /*ciclo para añadir los jtextfield al panel 2 y configurar la visibilidad*/
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jPMatriz1.add(jTMatriz1[i][j]);
                jTMatriz1[i][j].setVisible(false);
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jTMatriz1[i][j].setVisible(true);
            }
        }
        winPrinInterMat.pack();
    }

    public void generarMat2(int f, int c) {
        //Metodo para posicionar cuadros de texto de la segunda matriz

        int setX = 50, setY = 25;

        jTMatriz2 = new JTextField[f][c];

        /*ciclo para añadir el jtextfield bidimensional al panel 1, se uso dos variables
         * setX y setY, las cuales sirven para crear y configurar la posicion en cada iteracion,
         * por cada ciclo de j se suma 35 para dar el salto a la siguiente fila
         */
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jTMatriz2[i][j] = new JTextField("");
                jTMatriz2[i][j].setBounds(setX, setY, 30, 30);
                jTMatriz2[i][j].setHorizontalAlignment(JTextField.RIGHT);
                setX += 35;
            }
            setX = 50;
            setY += 35;
        }

        /*ciclo para añadir los jtextfield al panel 2 y configurar la visibilidad*/
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jPMatriz2.add(jTMatriz2[i][j]);
                jTMatriz2[i][j].setVisible(false);
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jTMatriz2[i][j].setVisible(true);
            }
        }
        winPrinInterMat.pack();
    }

    public double[][] tomarValores(JTextField trin[][]) {

        double temp[][] = new double[trin.length][trin[0].length];

        for (int i = 0; i < trin.length; i++) {
            for (int j = 0; j < trin[0].length; j++) {
                temp[i][j] = Double.parseDouble(trin[i][j].getText());
            }
        }

        return temp;
    }
    
    public int tomarValores2(JTextField trin) {

        int temp2 = Integer.parseInt(trin.getText());
        return temp2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*Usamos el getSource para saber si el evento fue hecho de determinado componente
         * para esto lo comparamos con el == y el nombre, en cada bloque se ejecuta lo que 
         * deseemos que haga la aplicacion deacuerdo al componente "seleccionado"
         */
        double temp[][];
        int temp2 = 0;

        if (e.getSource() == jMenu11) {
            System.exit(0);
        } else if (e.getSource() == jbSuma) { //cuando se presiona el boton de la suma
            if (chMatriz11.getSelectedItem().equals("") || chMatriz12.getSelectedItem().equals("")
                    || chMatriz21.getSelectedItem().equals("") || chMatriz22.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Para la suma se deben seleccionar\n"
                        + "valores en ambas matrices.");

            } else { //cuando se han seleccionado valores en los choice
                if ((chMatriz11.getSelectedIndex() == chMatriz21.getSelectedIndex())
                        && (chMatriz12.getSelectedIndex() == chMatriz22.getSelectedIndex())) {

                    temp = operaciones.sumarDosMatrices(tomarValores(jTMatriz1), tomarValores(jTMatriz2));

                    ventanaRespuesta resp = new ventanaRespuesta(temp);

                } else {
                	JOptionPane.showMessageDialog(null, "Las dimensiones de las matrices deben \n"
                            + "ser iguales.");
                }
            }
        } else if (e.getSource() == jbResta) {
            if (chMatriz11.getSelectedItem().equals("") || chMatriz12.getSelectedItem().equals("")
                    || chMatriz21.getSelectedItem().equals("") || chMatriz22.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Para la resta se deben seleccionar\n"
                        + "valores en ambas matrices.");

            } else { //cuando se han seleccionado valores en los choice
                if ((chMatriz11.getSelectedIndex() == chMatriz21.getSelectedIndex())
                        && (chMatriz12.getSelectedIndex() == chMatriz22.getSelectedIndex())) {

                    temp = operaciones.restarDosMatrices(tomarValores(jTMatriz1), tomarValores(jTMatriz2));

                    ventanaRespuesta resp = new ventanaRespuesta(temp);

                } else {
                	JOptionPane.showMessageDialog(null, "Las dimensiones de las matrices deben \n"
                            + "ser iguales.");
                }
            }
        } else if (e.getSource() == jbMulti) {//evento boton para multiplicar una matriz por un escalar

            if (jTMatriz1 != null) {
                double escalar;

                escalar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el escalar a multiplicar"));
                temp = operaciones.matrizPorEscalar(tomarValores(jTMatriz1), escalar);

                ventanaRespuesta resp = new ventanaRespuesta(temp);

            } else {
                JOptionPane.showMessageDialog(null, "La primera matriz debe existir \npara realizar la multiplicacion.");
            }

        } else if (e.getSource() == jbMultiMulti) {//evento boton para multiplicar dos matrices

            if (jTMatriz1 != null && jTMatriz2 != null) {
                if (chMatriz12.getSelectedIndex() == chMatriz21.getSelectedIndex()) {
                                        
                    temp = operaciones.multiplicarDosMatrices(tomarValores(jTMatriz1), tomarValores(jTMatriz2));
                    ventanaRespuesta resp = new ventanaRespuesta(temp);

                } else {
                    JOptionPane.showMessageDialog(null, "El numero de columnas de la primer matriz debe ser \n"
                            + "igual al numero de filas de la segunda matriz.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ambas matrices deben existir \n"
                        + "para poder realizar la multiplicacion.");
            }

        } else if (e.getSource() == jbDeterminante) {//evento boton para obtener determinante de una matriz

            if (jTMatriz1 != null) {
                if (chMatriz11.getSelectedIndex() == chMatriz12.getSelectedIndex()) {
                	if (chMatriz12.getSelectedIndex() >= 1 && chMatriz12.getSelectedIndex() <= 3) {
                		
                		double[][] matriz = tomarValores(jTMatriz1);
                        int tamaño = matriz.length;
                        
                        temp2 = operaciones.determinanteMatriz(matriz, tamaño);
                        new ventanaRespuesta(temp2);
                        
                        /*temp = operaciones.dividirDosMatrices(tomarValores(jTMatriz1), tomarValores(jTMatriz2));
                        ventanaRespuesta resp = new ventanaRespuesta(temp);*/
                        
                	} else {
                        JOptionPane.showMessageDialog(null, "La cantidad de filas y columnas de la matriz debe \n"
                                + "ser de 1 a 3.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de filas y la cantidad de columnas de la matriz \n"
                            + "deben ser iguales.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La primera matriz debe existir \npara calcular su determinante.");
            }

        } else if (e.getSource() == jbInversa) {//evento boton para obtener inversa de una matriz

            if (jTMatriz1 != null) {
                if (chMatriz11.getSelectedIndex() == chMatriz12.getSelectedIndex()) {
                	if (chMatriz12.getSelectedIndex() >= 1 && chMatriz12.getSelectedIndex() <= 3) {
                		
                		
                		double[][] matriz = tomarValores(jTMatriz1);
                		int tamaño = matriz.length;
                		int determinante = operaciones.determinanteMatriz(matriz, tamaño);
                		
                		if(determinante==0)
                    	{
                			JOptionPane.showMessageDialog(null, "La matriz no tiene inversa. Su \n"
                                    + "determinante es 0.");
                    	}else {
                    		
                    		temp = operaciones.inversaMatriz(tomarValores(jTMatriz1));
                    		ventanaRespuesta resp = new ventanaRespuesta(temp);
                    	}
                		

                	} else {
                        JOptionPane.showMessageDialog(null, "La cantidad de filas y columnas de la matriz debe \n"
                                + "ser de 1 a 3.");
                    }
                	
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de filas y columnas de la matriz deben \n"
                            + "ser iguales.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La primera matriz debe existir \npara calcular su inversa.");
            }

        } else if (e.getSource() == jbDivision) {//evento boton para dividir una matriz por otra matriz.

        	if (jTMatriz1 != null && jTMatriz2 != null) {
                if (chMatriz11.getSelectedIndex() == chMatriz12.getSelectedIndex() && chMatriz21.getSelectedIndex() == chMatriz22.getSelectedIndex() && chMatriz11.getSelectedIndex() == chMatriz21.getSelectedIndex()) {
                	if (chMatriz12.getSelectedIndex() >= 1 && chMatriz12.getSelectedIndex() <= 3) {
                    
                   
                		double[][] matriz = tomarValores(jTMatriz2);
                		int tamaño = matriz.length;
                		int determinante = operaciones.determinanteMatriz(matriz, tamaño);
                		
                		if(determinante==0)
                    	{
                			JOptionPane.showMessageDialog(null, "No es posible hacer la división. La segunda matriz \n"
                                    + "no tiene inversa debido a que su determinante es 0.");
                    	}else {
                    		
                    		temp = operaciones.dividirDosMatrices(tomarValores(jTMatriz1), tomarValores(jTMatriz2));
                    		ventanaRespuesta resp = new ventanaRespuesta(temp);
                    	}
                		

                	} else {
                        JOptionPane.showMessageDialog(null, "La cantidad de filas y columnas de las matrices deben \n"
                                + "ser de 1 a 3.");
                    }
                	
                } else {
                	JOptionPane.showMessageDialog(null, "Ambas matrices deben ser cuadradas y tener las \n"
                            + "mismas dimensiones.");
                }

            } else {
            	JOptionPane.showMessageDialog(null, "Ambas matrices deben existir \n"
                        + "para poder realizar la división.");
            }

        } else if (e.getSource() == jbLimpiar) {

            //evento para limpiar matriz para los numeros, ademas de setear los choice            
            if (jTMatriz1 != null && jTMatriz2 == null) {

                for (int i = 0; i < jTMatriz1.length; i++) {
                    for (int j = 0; j < jTMatriz1[0].length; j++) {
                        jTMatriz1[i][j].setVisible(false);
                    }
                }
                chMatriz11.select(0);
                chMatriz12.select(0);
                chMatriz11.repaint();
                chMatriz12.repaint();
            } else if (jTMatriz1 != null && jTMatriz2 != null) {

                for (int i = 0; i < jTMatriz1.length; i++) {
                    for (int j = 0; j < jTMatriz1[0].length; j++) {
                        jTMatriz1[i][j].setVisible(false);
                    }
                }
                for (int i = 0; i < jTMatriz2.length; i++) {
                    for (int j = 0; j < jTMatriz2[0].length; j++) {
                        jTMatriz2[i][j].setVisible(false);
                    }
                }
                jTMatriz1 = null;
                jTMatriz2 = null;
                chMatriz11.select(0);
                chMatriz12.select(0);
                chMatriz21.select(0);
                chMatriz22.select(0);
                chMatriz11.repaint();
                chMatriz12.repaint();
                chMatriz21.repaint();
                chMatriz22.repaint();
            }
        }
    }

    public class ventanaRespuesta { //clase que contiene la ventana para mostrar los resultados

        public ventanaRespuesta(double[][] temp) {//constructor, recibe como parametro el arreglo a mostrar

            JFrame ventanaRespuesta = new JFrame("RESPUESTA");
            ventanaRespuesta.setLocation(378, 480);

            JTextArea jtA = new JTextArea(10, 10);
            jtA.setEditable(false);
            Insets margen = new Insets(10, 10, 10, 10); // Margen de 10 píxeles en todos los lados
            jtA.setMargin(margen);
            

            String ax = ""; //variable para guardar lo del arreglo a mostrar

            //ciclo para mostrar el arreglo que se recibe...
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[i].length; j++) {
                    ax += temp[i][j] + "    ";
                }
                ax += "\n";
            }

            jtA.setText(ax);

            ventanaRespuesta.getContentPane().add(jtA);

            ventanaRespuesta.setSize(220, 150);
            ventanaRespuesta.setResizable(true);
            ventanaRespuesta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventanaRespuesta.setVisible(true);
        }
        
        public ventanaRespuesta(int temp2) {
        	JFrame ventanaRespuesta = new JFrame("RESPUESTA");
        	ventanaRespuesta.setLocation(390, 440);

            JTextArea jtA = new JTextArea(10, 10);
            jtA.setEditable(false);
            Insets margen = new Insets(10, 10, 10, 10); // Margen de 10 píxeles en todos los lados
            jtA.setMargin(margen);

            String ax = "" + temp2; //variable para guardar lo del arreglo a mostrar

            jtA.setText(ax);

            ventanaRespuesta.getContentPane().add(jtA);

            ventanaRespuesta.setSize(200, 150);
            ventanaRespuesta.setResizable(false);
            ventanaRespuesta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventanaRespuesta.setVisible(true);
        }
    }
    

    public class evenChoice implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            int f, c;

            if (e.getSource() == chMatriz12) {
                if (chMatriz11.getSelectedIndex() != 0 && chMatriz12.getSelectedIndex() != 0) {
                    f = Integer.parseInt(chMatriz11.getSelectedItem());
                    c = Integer.parseInt(chMatriz12.getSelectedItem());

                    if (jTMatriz1 != null) {
                        for (int i = 0; i < jTMatriz1.length; i++) {
                            for (int j = 0; j < jTMatriz1[0].length; j++) {
                                jTMatriz1[i][j].setVisible(false);
                            }
                        }
                        jTMatriz1 = null;
                        generarMat1(f, c);
                    } else {
                        generarMat1(f, c);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ambos choice tienen que tener un valor!");
                }
            } else if (e.getSource() == chMatriz22) {
                if (chMatriz21.getSelectedIndex() != 0 && chMatriz22.getSelectedIndex() != 0) {
                    f = Integer.parseInt(chMatriz21.getSelectedItem());
                    c = Integer.parseInt(chMatriz22.getSelectedItem());

                    if (jTMatriz2 != null) {
                        for (int i = 0; i < jTMatriz2.length; i++) {
                            for (int j = 0; j < jTMatriz2[0].length; j++) {
                                jTMatriz2[i][j].setVisible(false);
                            }
                        }
                        jTMatriz2 = null;
                        generarMat2(f, c);
                    } else {
                        generarMat2(f, c);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ambos choice tienen que tener un valor!");
                }
            }
        }

    }

    public static void main(String[] args) {
        new interfazMatriz();
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
    
}