# Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Vendas

## Descrição do Projeto
Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de vendas. O sistema possui três classes principais: **Venda**, **Cliente** e **GerenciadorDeVendas**. A classe **Venda** representa uma venda com ID, data, lista de produtos e valor total. A classe **Cliente** representa um cliente com ID, nome e e-mail. A classe **GerenciadorDeVendas** gerencia uma lista de vendas, permitindo adicionar, remover, atualizar e listar vendas por cliente.

Seu desafio é implementar testes unitários para as classes **Venda**, **Cliente** e **GerenciadorDeVendas** utilizando JUnit. Os testes devem cobrir os seguintes cenários:

### VendaTest.java
- Verificar se os atributos da venda são inicializados corretamente.
- Verificar se os métodos `setData` e `setValorTotal` alteram corretamente os atributos da venda.

### ClienteTest.java
- Verificar se os atributos do cliente são inicializados corretamente.
- Verificar se os métodos `setNome` e `setEmail` alteram corretamente os atributos do cliente.

### GerenciadorDeVendasTest.java
- Verificar se o método `adicionarVenda` adiciona uma venda corretamente ao gerenciador.
- Verificar se o método `removerVenda` remove uma venda corretamente do gerenciador.
- Verificar se o método `atualizarVenda` atualiza uma venda corretamente no gerenciador.
- Verificar se o método `listarVendasPorCliente` retorna as vendas corretamente por cliente.

## Dicas
- Utilize asserções (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, etc.) para verificar os resultados esperados.
- Utilize o método `@BeforeEach` para inicializar objetos antes de cada teste, se necessário.
- Verifique se os métodos da classe **GerenciadorDeVendas** estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover vendas, atualizar vendas, listar vendas por cliente).
