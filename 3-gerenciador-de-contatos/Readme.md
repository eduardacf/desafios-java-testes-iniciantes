### Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Contatos

#### Descrição do Projeto

Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de contatos. O sistema possui duas classes principais: Contato e Agenda. A classe Contato representa um contato com ID, nome, telefone e e-mail. A classe Agenda gerencia uma lista de contatos, permitindo adicionar, remover, buscar por nome e listar todos os contatos.

Seu desafio é implementar testes unitários para as classes Contato e Agenda utilizando JUnit. Os testes devem cobrir os seguintes cenários:

1.  ContatoTest.java
    *   Verificar se os atributos do contato são inicializados corretamente.
    *   Verificar se os métodos setNome, setTelefone e setEmail alteram corretamente os atributos do contato.
2.  AgendaTest.java
    *   Verificar se o método adicionarContato adiciona um contato corretamente à agenda.
    *   Verificar se o método removerContato remove um contato corretamente da agenda.
    *   Verificar se o método buscarContatoPorNome retorna o contato correto com base no nome.
    *   Verificar se o método listarTodosOsContatos retorna todos os contatos corretamente.

#### Dicas

*   Utilize asserções (assertEquals, assertTrue, assertFalse, assertNull, etc.) para verificar os resultados esperados.
*   Utilize o método @BeforeEach para inicializar objetos antes de cada teste, se necessário.
*   Verifique se os métodos da classe Agenda estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover contatos, buscar contatos por nome, listar todos os contatos).