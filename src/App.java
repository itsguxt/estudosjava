public class App {
    public static void main(String[] args) throws Exception {
        Controle controle = new Controle();
        controle.estadoTV = false;
        controle.canalTV = 1;
        controle.volumeTV = 1;

        controle.voltarCanal();
        controle.diminuirVolume();
        controle.diminuirVolume();

        controle.escolherCanal(50);
        controle.passarCanal();

        controle.escolherCanal(-100);
        controle.escolherCanal(55);

        controle.volumeTV = 98;
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
    }

}