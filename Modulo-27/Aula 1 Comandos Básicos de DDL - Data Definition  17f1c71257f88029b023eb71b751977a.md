# Aula 1: Comandos Básicos de DDL - Data Definition Language

[Modulo 27.pptx](Aula%201%20Comandos%20Ba%CC%81sicos%20de%20DDL%20-%20Data%20Definition%20%2017f1c71257f88029b023eb71b751977a/Modulo_27.pptx)

## Comandos DLL → São para criações das tabelas, estruturas de dados.

DDL oque é ? → È um conjuto de instrução e comandos para definição de dados.

- Exemplo de alguns comandos.
    1. **CREATE TABLE** → Cria uma tabela no banco de dados.
    
    ```sql
    CREATE TABLE clientes (
        id INT PRIMARY KEY,
        nome VARCHAR(100),
        email VARCHAR(100)
    );
    ```
    
    1. **DROP TABLE** → Exclui uma tabela do banco de dados.
    
    ```sql
    DROP TABLE clientes;
    ```
    
    1. **ALTER TABLE** → Modifica a estrutura de uma tabela existente.
    
    ```sql
    ALTER TABLE clientes ADD COLUMN telefone VARCHAR(15);
    ```
    
    1. **TRUNCATE** → Remove todos os registros de uma tabela sem excluir a tabela.
    
    ```sql
    TRUNCATE TABLE clientes;
    ```
    
    1. **CREATE DATABASE vendas_online;** → Cria um banco de dados chamado "vendas_online".

```sql
CREATE DATABASE vendas_online;

```

### Topos de dados

bigint = Valores inteiros para numeros grandes

varchar = Valores texto com poucos caracteres  ex (50 caracteres)

text = Vatores texto para textos grandes

int = valores inteiros para numeros pequenos

### Tipos numericos inteiros

| Tipo | Tamanho | Faixa |
| --- | --- | --- |
| smallint | 2 bytes | -32768 to +32767 |
| Integer | 4 bytes | -2147483648 to +2147483648 |
| bigint | 8 bytes | 19 casas decimais  |

### Tipos Caracteres

| Descrição | Tipo |
| --- | --- |
| character varying(n) | Comprimento variavel com limite |
| varchar(n) | Comprimento variavel com limite |
| character(n) | Comprimento fixo, completado com brancos |
| char(n) | Comprimento,fixo, completato com brancos |
| text | Comprimento variavel não limitado |

### Tipos Fracionarios

| Tipo ‘ | Tamanho | Faixa |
| --- | --- | --- |
| decimal | Variavel | Sem limite |
| numeric | Variavel | Sem limite |
| real | 4 bytes | 6 Decimal digits precision |
| double precision | 8 bytes | 15 Decimal digits precision |

### Tipos Data e hora

| Tipo | Descrição |
| --- | --- |
| Timestamp without Time Zone | Data, Hora sem o time zone |
| Timestamp with Time Zone(Timestamptz) | Data, Hora com time zone |
| Interval | Intevalos de tempo |
| TIme without Time Zone | Somente a hora do dia sem o time zone |
| Time with Time Zone | Somente a hora do dia com time zone |
| Date | Data sem hora do dia |

### Literais

| Tipo boolean | Valor |
| --- | --- |
| boolean verdade | ‘t’, ‘true’, ‘y’, ‘yes’, ‘1’ |
| boolean falso | ‘f’, ‘false’, ‘n’, ‘no’, ‘0’ |

# Sintaxe Create Table

CREATE TABLE  nome_tabela (campo e tipo do campo);

create table pessoa(

id bigint,

nome varchar(50),

endereco text,

telefone int

);

### Alguns exemplos

- create database vendas_online; -> Criando um banco de dados
- drop database vendas_online; -> excliindo o baco de dados que foi criado
- alter table tb_pessoa
add column nome_m varchar(50); → alteração na tabela pessoa → add uma coluna nome_m  tipo varcar(50) caracteres
- alter table tb_pessoa
rename column nome_m to nome_mae; alteração na tabela pessoa → rename column nome_m to nome_mae → trocando o nome;
- alter table tb_pessoa
alter column nome_mae type  character; → alterando o tipo de dado da coluna nome_mae
- alter table tb_pessoa
alter column nome_mae
set default 'NULO'; → seta um valor para a coluna nome_mae, para remover basta substituir o set por droop default; → sem valor default.
- alter table tb_pessoa
alter column nome_mae
set not null; → informando que esse campo é obrigatorio e não pode ser nulo.
- alter table tb_pessoa
add constraint chk_idade check (idade > 10); → adcionando uma restrição em uma coluna existente
- alter table tb_pessoa
rename to tb_clientes → altera o nome da tabela
- alter table tb_pessoa
drop column nome_mae; → exclui a coluna nome_mae
- PERIGO:
truncate table tb_pessoa; → ESSE COMANDO LIMPA TODOS OS DADOS CONTIDOS NAS COLUNAS DA TABELA - Vulgo o estagiario apagou todos os dados da tabela.
- PERIGO
drop table  tb_pessoa; → apaga completamente a tabela e seus dados do banco de dados.