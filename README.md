
# Criando um Banco Digital com Java e Orientação a Objetos

O objetivo deste projeto prático é reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java, através da implementação de um banco digital.


## Desafio Proposto

- Use todo o seu conhecimento para estender o domínio, incluindo novas classes, atributos e/ou métodos;
- Incluir o Lombok ao projeto para reduzir sua verbosidade de código.

## Desafio Realizado
Foi adicionada uma nova classe chamada de Transação para representar cada operação realizada em uma conta. Isso permitirá que possamos ter um histórico de transações. Nela também foi aplicada o conceito de 'Records' em vez do Lombok. 

#### Vantagens dos records: 
- **Menos Código Boilerplate:** Reduz a quantidade de código repetitivo necessário para definir classes de dados.
- **Imutabilidade:** Promove práticas de design imutável, o que pode levar a código mais seguro e menos propenso a erros.
- **Legibilidade:** A sintaxe clara e concisa torna o código mais legível e fácil de entender.

Na classe Transação também foi melhorado para imprimir o histórico de transação com Data e hora local.

Foram adicionados novos atributos para classe Cliente como **endereco** e **telefone** e foi criado também o método simples de auntenticação de clintes que foi implementado no na classe Conta.

Na classe Conta foi adicionada uma lista de transações para receber as transações além do método de **buscarContaPorCliente**

### Observações finais 
Mas melhorias podem ser adicionadas depende muito do que você quer fazer com o código no seu projeto, o objetivo desse código foi apenas trabalhar alguns conceitos do paradigma de programação orientação a objetos. Para tanto apesar do código ser simples alguns conhecimenos são previamente necessários, para replicação ou evolução do código.

Requisitos Técnicos:
- Conhecimentos básicos de Programação Orientada a Objetos em Java;
- Ambiente de desenvolvimento Java configurado;
- Acesso à internet para acesso ao projeto de referência no GitHub;
- Familiaridade com o uso de repositórios Git (opcional, mas recomendado);
- Capacidade de abstração para reproduzir a solução proposta e implementar melhorias.


### Domínio/Problema
Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base(mãe). A classe que herda os membros da classe base é chamada de classe derivada (filha).

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica.

## Stack utilizada


**Back-end:** Java, POO

**Ferramentas:** Intellij, Git e GitHub


## Documentação

[Slides](https://docs.google.com/presentation/d/1sGnTlpJK0F08hSZebk8LNTsOkHVBivVu/edit#slide=id.p4)

[Repositório Implementação de referência](https://github.com/falvojr/lab-banco-digital-oo)


