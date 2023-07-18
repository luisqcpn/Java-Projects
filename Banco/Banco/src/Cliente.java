//Informações dos clientes
public class Cliente {

    private String contaSimples;
    private String titular;
    private String data;
    private double saldo;

    //saidas
    public String getContaSimples() {
        return contaSimples;
} 

    public String getTitular() {
    return titular;
}

    public String getData() {
        return data;
}

    public double getSaldo() {
        return saldo;
}

// setado
public void setContaSimples(String contaSimples) {
    this.contaSimples = contaSimples;
}

public void setTitular(String titular) {
    this.titular = titular;
}

public void setData(String data) {
    this.data = data;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}
}
