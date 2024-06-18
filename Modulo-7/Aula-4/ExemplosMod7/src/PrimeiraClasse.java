public class PrimeiraClasse {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setNome("David");
        cliente.setCodigo(1);
        cliente.cadastrarEndereco("Rua manaca");
        cliente.imprimirEndereco();
        System.out.println("Nome " + cliente.getNome());
        System.out.println("Codigo " + cliente.getCodigo());
        //cliente.getValorTotal();




    }
}
