package ni.edu.uam.practicahilos.model;

public class Cuenta {
    private long saldo;
    private int rechazados;

    public Cuenta(long saldoInicial) {
        this.saldo = saldoInicial;
        this.rechazados = 0;
    }

    public void depositar(long monto) {
        this.saldo += monto;
    }

    public void retirar(long monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            this.rechazados++;
        }
    }

    public long getSaldo() {
        return saldo;
    }

    public int getRechazados() {
        return rechazados;
    }
}