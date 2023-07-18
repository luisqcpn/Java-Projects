public class Conta {

    private String contaSimples;
    private String titular;
    //representa o saldo atual dessa conta
    private double saldo;

    public String getContaSimples() {
        return contaSimples;
    } 

    public String getTitular() {
        return titular;
    } 

    public double getSaldo() {
        return saldo;
    } 

    //set

    public void setContaSimples(String contaSimples) {
        this.contaSimples = contaSimples;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldoAtual(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
    }
}
