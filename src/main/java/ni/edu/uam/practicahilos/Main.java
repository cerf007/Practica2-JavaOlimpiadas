package ni.edu.uam.practicahilos;
import ni.edu.uam.practicahilos.model.Cuenta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta(200);


        System.out.print("Cantidad de operaciones a realizar > ");
        int operaciones = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < operaciones; i++) {


            System.out.print("Operacion " + (i + 1) + " (retiro/deposito) > ");
            String operacionActual = sc.nextLine().trim();

            if (operacionActual.equalsIgnoreCase("retiro")) {
                System.out.print("Monto a retirar > ");
                long monto = sc.nextLong();
                sc.nextLine();
                cuenta1.retirar(monto);

            } else if (operacionActual.equalsIgnoreCase("deposito")) {
                System.out.print("Monto a depositar > ");
                long deposito = sc.nextLong();
                sc.nextLine();
                cuenta1.depositar(deposito);

            } else {
                System.out.println("Operacion no reconocida: '" + operacionActual + "'");
                cuenta1.setRechazados(cuenta1.getRechazados() + 1);
            }
        }

        sc.close();
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("Intentos rechazados: " + cuenta1.getRechazados());
    }
}