// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salida = 1;

        while (salida == 1){ // Menu de opciones

            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salida");
            int operacion = sc.nextInt();

            if (operacion == 1) { // Procedimiento para realizar la suma

                System.out.print("Ingrese el primer numero: ");
                double num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num2 = sc.nextDouble();
                double suma = num1 + num2;
                System.out.println("La suma de ambos numeros es: " + suma);

            } else if (operacion == 2) { // Procedimiento para realizar la resta

                System.out.print("Ingrese el primer numero: ");
                double num3 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num4 = sc.nextDouble();
                double resta = num3 - num4;
                System.out.println("La resta de ambos numeros es: "+resta);

            } else if (operacion == 3) { // Procedimiento para realizar la multiplicacion

                System.out.print("Ingrese el primer numero: ");
                double num5 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num6 = sc.nextDouble();
                double multiplicacion = num5*num6;
                System.out.println("La multiplicacion de ambos numeros es: "+multiplicacion);

            } else if (operacion == 4) { // Procedimiento para realizar la division

                System.out.print("Ingrese el primer numero: ");
                double num7 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double num8 = sc.nextDouble();

                if (num8 == 0) { // Condicional en caso de que el usuario quiera dividir por 0
                    System.out.println("No se puede divir por cero");
                } else {
                    double division = num7/num8;
                    System.out.println("La division entre ambos numeros es: "+division);
                }

            } else if (operacion == 5) { // Condicion de salida

                System.out.println("Gracias por usar esta calculadora, hasta la proxima");
                break;

            } else if (operacion < 1 || operacion > 5) { // En caso de que no se ingrese una opcion valida

                System.out.println("Ingrese una opcion valida");

            }
        }
        }
    }
