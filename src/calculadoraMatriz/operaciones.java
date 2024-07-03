package calculadoraMatriz;

import javax.swing.JOptionPane;

public class operaciones {


    public static double[][] sumarDosMatrices(double[][] a, double[][] b) {

        double matrizResultante[][];
        int i, j, filasA, columnasA;
        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new double[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
            	matrizResultante[i][j] = redondear(a[i][j] + b[i][j], 5);
            }
        }
        return matrizResultante;
    }

    public static double[][] restarDosMatrices(double[][] a, double[][] b) {

        double matrizResultante[][];
        int i, j, filasA, columnasA;

        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new double[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
            	matrizResultante[i][j] = redondear(a[i][j] - b[i][j], 5);
            }
        }
        return matrizResultante;
    }

    public static double[][] multiplicarDosMatrices(double[][] a, double[][] b) {
        
        double sum, c [][] = new double [a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                sum = 0;
                for(int k=0;k<a[0].length;k++){
                    sum += a[i][k]*b[k][j];
                }
                c[i][j] = redondear(sum, 5);
            }
        }
        return c;

    }
    
    public static double[][] matrizPorEscalar(double[][] a, double b) {

        double[][] matrizResultante = new double[a.length][a[0].length];
        for (int i = 0; i != a.length; i++) {
            for (int j = 0; j != a[i].length; j++) {
            	matrizResultante[i][j] = redondear(a[i][j] * b, 5);
            }
        }
        return matrizResultante;
    }
    
    static void obtenerCofactor(double a[][], double temp[][], int p, int q, int n){
    	int i = 0, j = 0;
    	
    	for(int fila = 0; fila < n; fila++){
    		for(int columna = 0; columna < n; columna++){
    			if(fila != p && columna != q){
    				temp[i][j++] = a[fila][columna];
    				if(j == n - 1) {
    					j = 0;
    					i++;
    				}
    			}
    		}
    	}
    }
    
    public static int determinanteMatriz(double[][] a, int n) {
    	int determinante = 0;
    	
    	if(n==1) {
    		
    		return (int) a[0][0];
    	}
    	
    	double temp[][] = new double[n][n];
    	int multiplicador = 1;
    	
    	for(int f = 0; f < n; f++)
    	{
    		obtenerCofactor(a, temp, 0, f, n);
    		determinante += multiplicador * a[0][f] * determinanteMatriz(temp, n-1);
    		multiplicador = -multiplicador;
    	}
    	
    	return (int) determinante;
    }
    
    // Método para calcular la inversa de una matriz utilizando Gauss-Jordan
    public static double[][] inversaMatriz(double[][] matriz) {
    	
    	int n = matriz.length;
    	int determinante = determinanteMatriz(matriz, n);
    	
    	if(determinante==0)
    	{
    		return null;
    	}


        double[][] augmentedMatriz = new double[n][2 * n];

        // Crear la matriz aumentada [A | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatriz[i][j] = matriz[i][j];
                augmentedMatriz[i][j + n] = (i == j) ? 1 : 0;
            }
        }

        // Aplicar el método de Gauss-Jordan
        for (int i = 0; i < n; i++) {
            // Buscar el pivote máximo en la columna i
            int pivotIndex = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(augmentedMatriz[k][i]) > Math.abs(augmentedMatriz[pivotIndex][i])) {
                    pivotIndex = k;
                }
            }

            // Intercambiar filas si es necesario
            if (pivotIndex != i) {
                double[] temp = augmentedMatriz[i];
                augmentedMatriz[i] = augmentedMatriz[pivotIndex];
                augmentedMatriz[pivotIndex] = temp;
            }

            // Verificar si el pivote es cero
            if (augmentedMatriz[i][i] == 0) {
                JOptionPane.showMessageDialog(null, "La matriz no es invertible.");
                return null; // La matriz no es invertible
            }

            // Normalizar la fila del pivote
            double pivot = augmentedMatriz[i][i];
            for (int j = 0; j < 2 * n; j++) {
                augmentedMatriz[i][j] /= pivot;
            }

            // Eliminar los otros elementos de la columna del pivote
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmentedMatriz[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmentedMatriz[k][j] -= factor * augmentedMatriz[i][j];
                    }
                }
            }
        }

        // Extraer la matriz inversa de la matriz aumentada
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = redondear(augmentedMatriz[i][j + n], 5);
            }
        }

        return inversa;
    }
    

    
    public static double[][] dividirDosMatrices(double[][] a, double[][] b) {
    	
    	int n = b.length;
    	int determinante = determinanteMatriz(b, n);
    	
    	if(determinante==0)
    	{
    		return null;
    	}
    	
    	double matrizResultante [][] = new double [a.length][b[0].length];
    	matrizResultante = multiplicarDosMatrices(a, inversaMatriz(b));
    	
    	return matrizResultante;
    }
    
    
    
    
    
    
    
    
    
    
    public static double redondear(double valor, int decimales) {
        double escala = Math.pow(10, decimales);
        return Math.round(valor * escala) / escala;
    }
    
}
