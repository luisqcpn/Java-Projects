public class Centro {

    public static void main(String args[]) {

        // Objeto 1 da classe Cliente
        Cliente c1 = new Cliente();
        c1.setContaSimples("numero 1");
        c1.setTitular("Luis Neto");
        c1.setData("01/01/2022");
        c1.setSaldo(101.00);
    
    


        // Objeto 2 da classe Cliente
        Cliente c2 = new Cliente();
        c2.setContaSimples("numero 2");
        c2.setTitular("Lucas Salame");
        c2.setData("10/01/2022");
        c2.setSaldo(150.00);
    

    

        // Objeto 3 da classe Cliente
        Cliente c3 = new Cliente();
        c3.setContaSimples("numero 3");
        c3.setTitular("Aline Ravena");
        c3.setData("13/02/2022");
        c3.setSaldo(100.00);
    

    

        // Objeto 4 da classe Cliente
        Cliente c4 = new Cliente();
        c4.setContaSimples("numero 4");
        c4.setTitular("Yuri Crdoso");
        c4.setData("15/03/2022");
        c4.setSaldo(59.00);
    

        // Objeto 5 da classe Cliente
        Cliente c5 = new Cliente();
        c5.setContaSimples("numero 5");
        c5.setTitular("João Brito");
        c5.setData("12/02/2022");
        c5.setSaldo(999.00);
    
        // Chamando os métodos
        System.out.println("ContaSimples " + c1.getContaSimples() + ", titular " 
        + c1.getTitular() + ", data " + c1.getData() + ", saldo " + c1.getSaldo() + ".");
    
        // Chamando os métodos
        System.out.println("ContaSimples " + c2.getContaSimples() + ", titular " 
        + c2.getTitular() + ", data " + c2.getData() + ", saldo " + c2.getSaldo() + ".");
        
        // Chamando os métodos
        System.out.println("ContaSimples " + c3.getContaSimples() + ", titular " 
        + c3.getTitular() + ", data " + c3.getData() + ", saldo " + c3.getSaldo() + ".");
    
        // Chamando os métodos
        System.out.println("ContaSimples " + c3.getContaSimples() + ", titular " 
        + c3.getTitular() + ", data " + c3.getData() + ", saldo " + c3.getSaldo() + ".");
    
        // Chamando os métodos
        System.out.println("ContaSimples " + c4.getContaSimples() + ", titular " 
        + c4.getTitular() + ", data " + c4.getData() + ", saldo " + c4.getSaldo() + ".");
    
        //recebe como parâmetro a contaDestino, a qual sofrerá um  crédito do valor.
        //ao mesmo tempo, esse mesmo valor deverá ser debitado da conta origem
       
        
    }









}