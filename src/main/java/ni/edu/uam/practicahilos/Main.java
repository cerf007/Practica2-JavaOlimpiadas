package ni.edu.uam.practicahilos;
import ni.edu.uam.practicahilos.model.Cuenta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta(200);
        int operaciones = sc.nextInt();
        String operacionActual = sc.nextLine();

        int rechazados = 0;

        for(int i = 0; i<= operaciones; i++){
            if(operacionActual.equalsIgnoreCase("retiro")){
                long monto = sc.nextLong();
                cuenta1.retirar(monto);
            }
            else if(operacionActual.equalsIgnoreCase("deposito")){
                long deposito = sc.nextLong();
                cuenta1.depositar(deposito);

            }else{
                rechazados++;
                cuenta1.setRechazados(rechazados);
            }




        }
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("Intentos rechazados: " + cuenta1.getRechazados());


    }

}
