package generics;

public class ExemploGenericEntry {
    public static void main(String[] args) {

        // Instanciando um objeto da classe GenericEntry com o tipo String
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Teste", 15555L);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        // Instanciando um objeto da classe GenericEntry com o tipo Long
        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(10L, 565);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
