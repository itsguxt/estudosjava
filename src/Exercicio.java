public class Exercicio {
    public static void main(String[] args) {
        Planetas planeta1 = new Planetas();
        planeta1.nome = "mercurio";
        planeta1.tipo = "rochoso";
        planeta1.diametro = 4800;
        planeta1.distanciaSol = 57910000;
        planeta1.possuiSatelite = false;

        Planetas planeta2 = new Planetas();
        planeta2.nome = "terra";
        planeta2.tipo = "rochoso";
        planeta2.diametro = 12000;
        planeta2.distanciaSol = 4000000;
        planeta2.possuiSatelite = true;

        Planetas planeta3 = new Planetas();
        planeta3.nome = "júpiter";
        planeta3.tipo = "gasoso";
        planeta3.diametro = 1200000;
        planeta3.distanciaSol = 40000000;
        planeta3.possuiSatelite = true;

        System.out.println("------");
        System.out.println(planeta1.nome);
        System.out.println(planeta1.tipo);
        System.out.println(planeta1.diametro);
        System.out.println(planeta1.distanciaSol);
        System.out.println(planeta1.possuiSatelite);
        
        System.out.println("------");
        System.out.println(planeta2.nome);
        System.out.println(planeta2.tipo);
        System.out.println(planeta2.diametro);
        System.out.println(planeta2.distanciaSol);
        System.out.println(planeta2.possuiSatelite);
        
        System.out.println("------");
        System.out.println(planeta3.nome);
        System.out.println(planeta3.tipo);
        System.out.println(planeta3.diametro);
        System.out.println(planeta3.distanciaSol);
        System.out.println(planeta3.possuiSatelite);


    }
}
