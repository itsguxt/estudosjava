import java.util.Scanner;

public class Contador {
    private int valor = 0;
    Scanner scanner = new Scanner(System.in);

    void incrementar (){
        if (valor<10){
        valor = valor+1;
        }else{
            System.out.println("Operação Inválida!");
        }
    }

    void decrementar(){
        if (valor>0){
        valor = valor-1;
        }else{
            System.out.println("Operação Inválida!");
        }
    }

    void obterValor(){
        System.out.println(valor);
    }
    
    //Este trecho define manualmente, via código mesmo, como pede o tópico a do exemplo 1!
    // void definirValor(int novoValor){
    //     if (novoValor<=10 & novoValor >=0){
    //         valor = novoValor;
    //     }else{
    //         System.out.println("Operação Inválida");
    //     }
    // }

    //Este trecho define manualmente via terminal
    void definirValor(){
        System.out.print("Digite um novo valor inteiro entre 0 e 10: ");
        int novoValor = scanner.nextInt();
        if (novoValor<=10 & novoValor >=0){
            valor = novoValor;
        }else{
            System.out.println("Operação Inválida");
        }
    }
}
