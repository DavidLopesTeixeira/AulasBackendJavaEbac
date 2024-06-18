public class Main {

    public static void main(String[] args) {


        //instancias
        Cachorro bidu = new Cachorro();
        bidu.setNome("Bidu");
        bidu.setRaca("Husky");
        bidu.setIdade(6);
        bidu.setCor("Preto e branco");
        bidu.setPorte("Grande");


       bidu.imprimirInformacoes();

        bidu.latir();
        bidu.brincar();

    }


}
