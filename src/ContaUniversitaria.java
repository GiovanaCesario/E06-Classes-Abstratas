public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    /*public void setLimite(double limite) {
        if (limite < 0)
            limite = 0;

        this.limite = limite;
    }*/
}
