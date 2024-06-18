public class Cliente {

    // tudo aqui será sobre clientes

    // Atributos do cliente

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println("Endereço: " +  this.endereco);
    }

    /**
     * @deprecated
     * Método que faz o calculo do valor total
     *
     * @return retorna o valor total
     * @see int getValorTotal(int count)
     */
    public int getValorTotal(){
        return 20;
    }

    public int getValorTotal(int count){
        return 20;
    }
}
