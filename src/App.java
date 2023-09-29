public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();
        contador.obterValor();  //printa 0
        contador.incrementar(); //valor 1
        contador.incrementar(); //valor 2
        contador.incrementar(); //valor 3
        contador.obterValor();  //printa 3

        contador.decrementar(); //valor 2
        contador.decrementar(); //valor 1
        contador.decrementar(); //valor 0
        contador.decrementar(); //operação inválida
        contador.obterValor();  //printa 1

        contador.definirValor(); //escolhe um valor para o valor do contador 
        contador.obterValor(); //printa o valor escolhido pelo terminal, se tiver sido colocado um valor válido
    }

}