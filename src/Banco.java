public class Banco {
    private double saldo;    

    public double obterSaldo(){
        System.out.println("Saldo: R$"+saldo);
        return saldo;
    }

    public void sacar(double valorSaque){
        if (valorSaque>0){
            if (valorSaque>saldo){ //Não sacar mais que o saldo disponível
                System.out.println("Valor Inválido");
            }else{
                if(valorSaque>500){ //regra de negócio que limita o valor máximo do saque
                    System.out.println("Impossível sacar mais que R$500,00, tente novamente.");
                }else if(valorSaque<50){  //regra de negócio que limita o valor mínimo do saque
                    System.out.println("Valor mínimo de saque é R$50,00, tente novamente.");
                }
                else{
                    saldo = saldo - valorSaque;
                    System.out.println("Saque realizado, saldo disponível: R$"+saldo);
                }
            }
        }else{
            System.out.println("Erro, valores negativos não são aceitos!");
        }
    }

    public void depositar(double valorDeposito){
        if (valorDeposito>0){
            if (valorDeposito<50){
                System.out.println("Valor mínimo de depósito é R$50,00, tente novamente.");
            }else if (valorDeposito>500){
                System.out.println("Valor máximo de depósito é R$500,00, tente novamente.");
            }else{
                saldo = saldo +valorDeposito;
                System.out.println("Depósito realizado, saldo disponível: R$"+saldo);
            }
        }else{
            System.out.println("Erro, valores negativos não são aceitos!");
        }
    }

}
