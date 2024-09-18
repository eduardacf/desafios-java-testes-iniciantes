# Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Biblioteca

## Descrição do Projeto

Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de biblioteca. O sistema possui duas classes principais: `Livro` e `Biblioteca`. A classe `Livro` representa um livro com ID, título, autor e disponibilidade. A classe `Biblioteca` gerencia uma lista de livros, permitindo adicionar, remover, buscar por ID e listar livros disponíveis.

Seu desafio é implementar testes unitários para as classes `Livro` e `Biblioteca` utilizando JUnit. Os testes devem cobrir os seguintes cenários:

### 1. LivroTest.java
- Verificar se os atributos do livro são inicializados corretamente.
- Verificar se o método `setDisponivel` altera corretamente a disponibilidade do livro.

### 2. BibliotecaTest.java
- Verificar se o método `adicionarLivro` adiciona um livro corretamente à biblioteca.
- Verificar se o método `removerLivro` remove um livro corretamente da biblioteca.
- Verificar se o método `buscarLivroPorId` retorna o livro correto com base no ID.
- Verificar se o método `listarLivrosDisponiveis` retorna apenas os livros disponíveis.

## Dicas

- Utilize asserções (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, etc.) para verificar os resultados esperados.
- Utilize o método `@BeforeEach` para inicializar objetos antes de cada teste, se necessário.
- Verifique se os métodos da classe `Biblioteca` estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover livros, buscar livros por ID, listar livros disponíveis).
