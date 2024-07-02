package br.com.david.lopes;

public class Casting {

    public static void main(String[] args) {
        int num1 = 10;

        // fazendo o cast explicito de int para short
        // nesse caso funcionou pois o numero 10 cabe em um short de 16bits que aceita o valor maximo de 127
        short num2 = (short) num1;
        System.out.println(num2);


        long numL = 1111111111111111111L;

        // fazendo um casting explicito de um long para um int
        // nesse caso não irá caber o valor dentro de um int
        // acarretando em uma perca de valores

        int numI = (int) numL;
        System.out.println(numI);

        // clasting do modo implicito

        int idade = 10;
        //casting implicito automatico
        // ocorreu sem erro e sem perca de valores pois pegamos um objeto em uma caixa menor e adicionamos ele em uma caixa maior
        long idadeL = idade;
        System.out.println(idade);
        System.out.println(idadeL);





    }

}
