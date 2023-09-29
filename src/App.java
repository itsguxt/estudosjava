public class App {
    public static void main(String[] args) throws Exception {

        //aprovado
        Aluno aluno = new Aluno();
        aluno.nome = "Gustavo";
        aluno.notaMateria1 = 7;
        aluno.notaMateria2 = 7;
        aluno.notaMateria3 = 7;
        aluno.faltas = 20;
        aluno.checarAprovacao();

        //reprovado por nota
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gustavo";
        aluno1.notaMateria1 = 7;
        aluno1.notaMateria2 = 7;
        aluno1.notaMateria3 = 6;
        aluno1.faltas = 20;
        aluno1.checarAprovacao();

        //reprovado por falta
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Gustavo";
        aluno2.notaMateria1 = 7;
        aluno2.notaMateria2 = 7;
        aluno2.notaMateria3 = 7;
        aluno2.faltas = 21;

        aluno2.checarAprovacao();

    }

}