package Clase2TM;

public class CuentaCorriente {
    private int NroCuenta;
    private double Saldo;

    public CuentaCorriente(){

    };
    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        NroCuenta = cuentaCorriente.NroCuenta;
        Saldo = cuentaCorriente.Saldo;
    };

    public void setNroCuenta(int nroCuenta) {
        NroCuenta = nroCuenta;
    }

    public int getNroCuenta() {
        return NroCuenta;
    }

    public void setSaldo(double saldo) {
            Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void ingreso(double val){
        this.setSaldo(this.getSaldo()+val);
        System.out.println("Ingreso: "+val+", su saldo actuaal es: "+this.getSaldo());
    };
    public void egreso(double val){
        this.setSaldo(this.getSaldo()-val);
        System.out.println("Egreso: "+val+", Su saldo actual es: "+this.getSaldo());
    };

    public void reintegro(double val){
        this.setSaldo(this.getSaldo()+val);
        System.out.println("Se Reintegro a la cuenta el monto: "+val+", su saldo actuaal es: "+this.getSaldo());
    };
    public void transferencia(double val){
        this.setSaldo(this.getSaldo()-val);
        System.out.println("Transfirio: "+val+", Su saldo actual es: "+this.getSaldo());
    };
}
