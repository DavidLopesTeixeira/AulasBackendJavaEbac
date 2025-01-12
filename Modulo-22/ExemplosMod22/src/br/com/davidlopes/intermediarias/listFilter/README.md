
# README

Este repositório contém exemplos de código utilizando **Streams** em Java para realizar filtragens em uma lista de objetos `Pessoa`, com base em sua nacionalidade. O código explora diferentes abordagens de filtragem usando *lambdas*, *Predicates* e *classes anônimas*, fornecendo uma ampla gama de casos de uso aplicáveis em sistemas de gestão, CRM e monitoramento de visitantes.

## Sumário

1. [Filtragem e Armazenamento em Lista](#filtragem-e-armazenamento-em-lista)
2. [Filtragem com Predicate e Impressão](#filtragem-com-predicate-e-impressão)
3. [Filtragem com Classe Anônima e Impressão](#filtragem-com-classe-anônima-e-impressão)
4. [Casos de Uso Práticos](#casos-de-uso-práticos)

## Filtragem e Armazenamento em Lista

### Descrição

Esta abordagem utiliza *lambdas* combinadas com o método `filter()` para filtrar uma lista de objetos, e o método `forEach()` para adicionar os elementos filtrados a uma nova lista.

### Caso de Uso

Ideal quando você deseja filtrar uma lista de objetos com base em uma condição e armazenar os resultados em uma nova coleção. A lista original permanece intacta, e você pode fazer operações adicionais sobre os elementos filtrados.

#### Exemplo Real:

Você pode ter uma lista de pessoas de várias nacionalidades e deseja armazenar as pessoas brasileiras em uma nova lista para realizar alguma operação adicional, como enviar e-mails de marketing exclusivos ou gerar relatórios específicos.

#### Código:

```java
pessoas.stream()
       .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
       .forEach(pessoa -> brasileiros.add(pessoa));
```

### Descrição do Fluxo:

- `filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))`: Filtra as pessoas que têm a nacionalidade "Brasil".
- `forEach(pessoa -> brasileiros.add(pessoa))`: Itera sobre as pessoas filtradas e as adiciona a uma nova lista `brasileiros`.

## Filtragem com Predicate e Impressão

### Descrição

Nesta abordagem, você define um `Predicate`, uma função que encapsula a lógica de filtragem, permitindo reutilização em diferentes partes do código.

### Caso de Uso

Útil quando você precisa definir e reutilizar condições de filtro de maneira modular. Isso é especialmente importante quando você possui diferentes filtros a serem aplicados de forma flexível.

#### Exemplo Real:

Em um sistema de CRM, você pode querer segmentar seus clientes por nacionalidade. Utilizando `Predicate`, você pode definir o filtro e aplicá-lo em diferentes partes do sistema.

#### Código:

```java
Predicate<Pessoa> predi1 = pessoa -> pessoa.getNacionalidade().equals("Mexico");
pessoas.stream()
       .filter(predi1)
       .forEach(pessoa -> System.out.println(pessoa));
```

### Descrição do Fluxo:

- `Predicate<Pessoa> predi1 = pessoa -> pessoa.getNacionalidade().equals("Mexico")`: Define um `Predicate` para verificar se a pessoa é mexicana.
- `pessoas.stream().filter(predi1).forEach(pessoa -> System.out.println(pessoa))`: Aplica o filtro e imprime as pessoas que atendem à condição definida pelo `Predicate`.

## Filtragem com Classe Anônima e Impressão

### Descrição

Esta abordagem utiliza uma **classe anônima** para implementar um `Predicate` de maneira mais explícita, oferecendo flexibilidade para lógica de filtragem mais complexa.

### Caso de Uso

Ideal quando você precisa aplicar lógicas de filtragem mais complexas ou combinações de múltiplos critérios que não se encaixam bem em uma expressão lambda simples.

#### Exemplo Real:

Em um sistema de saúde que filtra pacientes por nacionalidade e outros atributos, como histórico de doenças, uma classe anônima pode ser útil para encapsular a lógica de filtragem mais elaborada.

#### Código:

```java
Predicate<Pessoa> predi2 = new Predicate<Pessoa>() {
    @Override
    public boolean test(Pessoa pessoa) {
        return pessoa.getNacionalidade().equals("Canada");
    }
};
pessoas.stream()
       .filter(predi2)
       .forEach(pessoa -> System.out.println(pessoa));
```

### Descrição do Fluxo:

- `new Predicate<Pessoa>() { ... }`: Define a implementação de um `Predicate` usando uma classe anônima, com a lógica de filtragem para a nacionalidade "Canadá".
- `stream().filter(predi2).forEach(pessoa -> System.out.println(pessoa))`: Aplica o filtro e imprime as pessoas que têm a nacionalidade "Canadá".

## Casos de Uso Práticos

1. **Filtrar e Armazenar Resultados (Usando Lambda e forEach)**:
   - Ideal para armazenar os resultados filtrados em uma nova coleção para uso posterior.
   - Exemplo: Enviar e-mails para um grupo específico, como brasileiros.

2. **Filtrar com Predicate e Imprimir**:
   - Ideal quando você precisa definir e reutilizar condições de filtro de forma modular.
   - Exemplo: Segmentar clientes em um sistema de CRM e gerar relatórios por nacionalidade.

3. **Filtrar com Classe Anônima e Imprimir**:
   - Ideal para condições de filtro mais complexas ou lógicas mais explícitas.
   - Exemplo: Filtrar visitantes por nacionalidade em um evento internacional e aplicar diferentes serviços.

Essas abordagens podem ser aplicadas em diversos contextos como sistemas de gestão de alunos, CRM, monitoramento de visitantes em feiras e outros cenários que envolvem filtragem de dados.

---

## Conclusão

Este repositório demonstra como utilizar a poderosa API de Streams do Java para realizar filtragens de dados de forma eficiente e modular, atendendo a uma variedade de necessidades em diferentes sistemas e aplicações.
