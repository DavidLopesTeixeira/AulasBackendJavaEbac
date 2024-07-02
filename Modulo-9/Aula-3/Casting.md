# Casting de primitivos

* Casting é um recurso, que possibilita mudar um valor de um tipo para o
outro. As vezes é feito automatico, que chamamos de casting IMPLÍCITO,
e também pode ser feito por nos, chamado de casting EXPLÍCITO.

* ## Casting explícito 

int num1 = 10;
shot num2 = num1; (Erro de complicação)

* Por que no caso acima o java não nos permite fazer num2 = num1 direto?

* Por que num1 é di tipo int, qye é maior que um short. Um inteiro(32bits)
é maior que um short(16bits)à nivel de armazenamento. O java não permite
que um tipo maior seja convertido para um tipo menor, ele faz isso como
medida de segurança, para isso é preciso fazer o casting explícito.