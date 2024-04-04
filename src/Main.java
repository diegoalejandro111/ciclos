import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("porfa ingrese el numero:  ");
        int n = Scanner.nextInt();
        System.out.print("por favor elija un tipo de bucle (for/white/do-white):   ");
        System.out.println("1para ciclo for, 2para ciclo white, 3para ciclo do-while");
        int eleccion = Scanner.nextInt();
        int suma = 0;
        int i = 1;


        switch (eleccion) {
            case 1:
                JOptionPane.showMessageDialog(null,"este es el caso1 ciclo for");

                for (; i <= n; i++) {
                }
                break;

            case 2:

                while (i <= n) {
                    suma += i * i;
                    i++;
                }
                break;

            case 3:

                do {
                    suma += i * i;
                    i++;
                }
                while (i <= n);
                break;


            default: {
                System.out.println("el bucle que usted eligio no es valido.....");
                return;


            }


            }
        }
    }

