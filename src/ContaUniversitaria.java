public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {

        super(numero, dono, saldo, limite);

        limite = setLimite(limite);
    }

    public double setLimite(double limite) {
        if (limite < 0)
            limite = 0;
        if (limite > 500)
            limite = 500;

        return limite;
    }
}
