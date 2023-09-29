public class Controle {
    public boolean estadoTV;
    public int volumeTV;
    public int canalTV;

    public void ligaDesliga(){
        if (estadoTV==false){
            estadoTV =true;
        }else{
            estadoTV = false;
        }
    }

    public void aumentarVolume(){
        if (volumeTV<100){
            volumeTV = volumeTV+1;
            System.out.println("Volume " + volumeTV);
        }else{
            System.out.println("Volume máximo");
        }
    }
    
    public void diminuirVolume(){
        if (volumeTV>0){
            volumeTV = volumeTV-1;
            System.out.println("Volume " + volumeTV);
        }else{
            System.out.println("Volume mínimo");
        }
    }

    public void passarCanal(){
        if (canalTV<50){ //Só existem 50 canais, quando chegar no canal 50 e tentar avançar, ele irá voltar para o canal 1
            canalTV = canalTV +1;
        }else{
            canalTV = 1;
        }
        System.out.println("Canal " + canalTV );
    }
    
    public void voltarCanal(){
        if (canalTV>1){ //Quando chegar no canal 1 e tentar voltar, ele irá para o canal 50
            canalTV = canalTV - 1;
        }else{
            canalTV = 50;
        }
        System.out.println("Canal " + canalTV );
    }

    public void escolherCanal(int canalEscolhido){
        if (canalEscolhido>=1 & canalEscolhido<=50){
            canalTV = canalEscolhido;
            System.out.println("Canal escolhido "+canalEscolhido);
        }else{
            System.out.println("Canal inválido");
        }
    }


}
