# Aula 1 MOD7

* Criação de classe 
* Instancias

## Instancia uma classe
* instanciar uma classe significa alocar essa variavel em um espaço de memoria em java
*  exemplo de uma instancia
* Cliente cliente = new Cliente();
* tipo Cliente
* nome cliente
* Instancia new Cliente();
* 
* ## Oque é uma instancia?
* uma instância é um objeto criado a partir de uma classe concreta. 
* Para criar uma instância, usa-se a palavra-chave new seguida do nome da 
* classe e dos argumentos do construtor, se necessário.
* Ao instanciar uma classe, reserva-se espaço na memória para 
* armazenar as informações associadas à instância da classe. 
* O comportamento e o estado da instância são definidos pela classe.

# Aula 2 MOD7
* Criação de variaveis
* Criação de metodos

## Variaveis private
* Em Java, uma variável privada é uma variável que só pode ser acessada por 
métodos da própria classe e é declarada usando a palavra-chave private. 
Private é um modificador de acesso, também chamado de modificador de 
visibilidade, que restringe totalmente o acesso a um recurso da classe de 
todas as demais classes, sejam elas do mesmo pacote, de outros 
pacotes ou até subclasses.

## Motivos de usar private

* O motivo para usar private é segurança.
  Informações públicas são acessíveis de qualquer lugar e você
  pode estar expondo dados sensíveis da sua aplicação e de seus usuários

# Variaveis public
* Em Java, uma variável pública é uma variável que pode ser acessada por qualquer 
outra classe. Para declarar uma variável pública, 
usa-se a palavra-chave public

* O modificador public define o nível de visibilidade de uma classe, método, variável 
ou outro elemento dentro do código. Por exemplo, quando se declara um método ou 
classe como public, está-se a dizer que ele é acessível de fora da classe onde está 
definido.

## Retornos tipos
* void = não retorna nada
* String = retorna uma string
* int = retorna um inteiro

# Aula3  MOD7

## Nomenclaturas

* Classes e interfaces: A primeira letra deve ser maiúsculas, 
caso o nome seja formado por mais de uma palavra, 
as demais palavras devem ter sua primeira letra maiúscula. (camelCase).

* Métodos: A primeira letra do método deve ser minúscula e após devemos 
aplicar o camelCase

* Variáveis: Da mesma forma que os métodos.

* Constantes: Todas as letras devem ser maiúsculas.

## Modificadores de acesso

* Os modificadores de acesso são padrões de visibilidade de acessos
  às classes, atributos e métodos. 
  Estes modificadores são palavraschaves reservadas pelo Java
* Por exemplo, quando um programa cria (instancia) um objeto da
  classe Banco, a variável senha é encapsulada (ocultada) no objeto
  onde pode ser acessada apenas por métodos da classe do objeto, os
  métodos getters e setters, que manipulam a variável de instância

* private: O modificador de acesso private quando aplicado a um
  atributo ou a um método indica que os mesmos só podem ser
  acessados de dentro da classe que os criou.

* protected:A instrução protected indica que o método ou a
  variável assim declarada possa ser acessada somente dentro
  do pacote em que está contida através de uma subclasse.

* public: A instrução public indica que a classe, método ou
  variável assim declarada possa ser acessada em qualquer
  lugar, a qualquer momento da execução do programa.

* Default (Padrão): A classe e seus membros são acessíveis
  somente por classes do mesmo pacote.

* ## Como trabalhamos em JAVA?
* Definimos todas as variaveis, propriedades como private
* Criamos getter e setter para manipular os valores
* OBS nunca deixar como publico a não ser que tenhamos um motivo muito especifico.

# Aula4  MOD7

## Comentarios 

* // Comentarios em Linha
* /* */ Comentarios em bloco
* javadoc 
/**
Este comentário é o javadoc, serve para criar a documentação
automática do sistema.
  **/