package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int numDigitos = 0;
        int ndigitos = 0;
        numDigitos = pedirDigitos();
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int pedirDigitos() {
        int numDigitos; // defino la variable// 
        do {
            JOptionPane.showMessageDialog(null, "ingrese numero para obtener numeros de digitos mayor que 0 y menor que 5");
            numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero de digitos para calcular los numeros primos"));
        } while (numDigitos <= 0 || numDigitos > 5);

        return numDigitos;
    }
}
