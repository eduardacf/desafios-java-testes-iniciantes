### Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Produtos

#### Descrição do Projeto

Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de produtos. O sistema possui duas classes principais: Produto e Estoque. A classe Produto representa um produto com ID, nome, preço e quantidade em estoque. A classe Estoque gerencia uma lista de produtos, permitindo adicionar, remover, atualizar quantidade em estoque e listar produtos em estoque.

Seu desafio é implementar testes unitários para as classes Produto e Estoque utilizando JUnit. Os testes devem cobrir os seguintes cenários:

1.  ProdutoTest.java
    *   Verificar se os atributos do produto são inicializados corretamente.
    *   Verificar se os métodos setNome, setPreco e setQuantidade alteram corretamente os atributos do produto.
2.  EstoqueTest.java
    *   Verificar se o método adicionarProduto adiciona um produto corretamente ao estoque.
    *   Verificar se o método removerProduto remove um produto corretamente do estoque.
    *   Verificar se o método buscarProdutoPorId retorna o produto correto com base no ID.
    *   Verificar se o método listarProdutos retorna todos os produtos corretamente.

#### Dicas

*   Utilize asserções (assertEquals, assertTrue, assertFalse, assertNull, etc.) para verificar os resultados esperados.
*   Utilize o método @BeforeEach para inicializar objetos antes de cada teste, se necessário.
*   Verifique se os métodos da classe Estoque estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover produtos, buscar produtos por ID, listar produtos).