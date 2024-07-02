# Wrappers em Java: Aprenda como utilizar

* ### Wrappers vem do verbo inglês “wrap” que significa envolver. 
* Eles são um nome adicional ao padrão de projeto Decorator. 
* Tem como principal função “envolver coisas” adicionando funcionalidades à ela.


O Java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos, um exemplo dele é o Integer, que é o Wrapper do tipo primitivo int. Que tipo de funcionalidade você pode executar tendo apenas uma variável definida como “int”? Nenhuma, a não ser atribuir valores, pois int é um tipo primitivo e não possuí métodos.

O Java possui oito wrappers para tipos primitivos que adicionam a 
funcionalidade de tratar tipos primitivos como classes. Quando você faz um:

* Integer i = Integer.valueOf(2);

Você está criando uma classe, que "envolve" o número 2 (primitivo) e adiciona métodos como intValue() nele. Você ainda ganha a funcionalidade de 
trabalhar com o número 2 como se ele fosse um objeto. O Java (a partir da versão 5) é inteligente o suficiente para criar ou desfazer wrappers de tipo primitivo 
automaticamente (Autoboxing), de tão útil e comum que é essa prática, veremos mais a diante como funciona o Autoboxing.
Existem dezenas de wrappers: para tratar o fluxo de conexões como orientado a objetos (ObjectInputStream), fluxos de audio (AudioInputStream), 
baseados em tipos primitivos (DataInputStream), ou adicionar buffers (BufferedInputStream) a eles. Todos esses são exemplos de wrappers para o básico e sem 
funcionalidade InputStream. E o interessante, é que, esses wrappers podem ser combinados (pode-se fazer um FileInputStream, associa-lo a um 
BufferedInputStream e ler dados primitivos dele após associar o resultado a um DataInputStream).

Com o Wrapper Integer envolvendo o tipo primitivo int você consegue executar métodos como é o caso do: parseInt, valueOf e assim por diante.

* Referencia https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275