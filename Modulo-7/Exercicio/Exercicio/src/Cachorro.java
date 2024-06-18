public class Cachorro {


    private String raca;
    private String nome;
    private int idade;
    private String cor;
    private String porte;

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getRaca() {
       return raca;
   }

   public void setRaca(String raca) {
       this.raca = raca;
   }

   public int getIdade() {
       return idade;
   }

   public void setIdade(int idade) {
       this.idade = idade;
   }

   public String getCor() {
       return cor;
   }

   public void setCor(String cor) {
       this.cor = cor;
   }

   public String getPorte() {
       return porte;
   }

   public void setPorte(String porte) {
       this.porte = porte;
   }
    /**
     *
     * Metodos faz uma impressão no console
     * @see public void latir()
     * return Retorna uma string
     */
   public void latir() {
       System.out.println(this.nome + " Está latindo au au");
   }

    /**
     *
     * Metodos faz uma impressão no console
     * @see public void brincar()
     * return Retorna uma string
     */
   public void brincar() {
       System.out.println(this.nome + " Está bincando de correr");
   }

   public void imprimirInformacoes() {
       System.out.println("nome: " + getNome());
       System.out.println("Raça: " + getRaca());
       System.out.println("Cor: " + getCor());
       System.out.println("Idade: " + getIdade());
       System.out.println("Porte: " + getPorte());
   }


}

