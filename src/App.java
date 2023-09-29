public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.depositar(1000); //máximo é 500
        banco.depositar(25); //mínimo é 50
        banco.depositar(-50); //Erro, valor negativo
        banco.depositar(500); //Ok
        banco.depositar(500); //Ok
        banco.depositar(500); //Ok

        banco.sacar(1000); //máximo é 500
        banco.sacar(25); //mínimo é 50
        banco.sacar(-50); //Erro, valor negativo
        banco.sacar(100); //Ok
        banco.sacar(200); //Ok
        banco.sacar(300); //Ok

        banco.obterSaldo();

    }

}