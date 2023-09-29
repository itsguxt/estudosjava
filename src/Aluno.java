

public class Aluno {
    public String nome;
    public double notaMateria1;
    public double notaMateria2;
    public double notaMateria3;
    public int faltas;

    public boolean checarFaltas(){
        if (faltas>20){
            return false;
        }else{
            return true;
        }
    }

    public boolean checarNotas(){
        if(notaMateria1>=7 & notaMateria2>=7 & notaMateria3>=7){
            return true;
        }else{
            return false;
        }
    }

    public boolean checarAprovacao(){
        if(checarNotas() & checarFaltas()){
            System.out.println("Aluno aprovado");
            return true;
        }else{
            System.out.println("Aluno reprovado");
            return false;
        }
    }

}
