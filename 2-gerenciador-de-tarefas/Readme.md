### Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Tarefas

#### Descrição do Projeto

Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de tarefas. O sistema possui duas classes principais: Tarefa e GerenciadorDeTarefas. A classe Tarefa representa uma tarefa com ID, título, descrição e status (pendente, concluída). A classe GerenciadorDeTarefas gerencia uma lista de tarefas, permitindo adicionar, remover, marcar como concluída e listar tarefas pendentes.

Seu desafio é implementar testes unitários para as classes Tarefa e GerenciadorDeTarefas utilizando JUnit. Os testes devem cobrir os seguintes cenários:

1.  **TarefaTest.java**
    *   Verificar se os atributos da tarefa são inicializados corretamente.
    *   Verificar se o método setStatus altera corretamente o status da tarefa.
2.  **GerenciadorDeTarefasTest.java**
    *   Verificar se o método adicionarTarefa adiciona uma tarefa corretamente ao gerenciador.
    *   Verificar se o método removerTarefa remove uma tarefa corretamente do gerenciador.
    *   Verificar se o método marcarTarefaComoConcluida altera o status da tarefa corretamente.
    *   Verificar se o método listarTarefasPendentes retorna apenas as tarefas pendentes.

#### Dicas

*   Utilize asserções (assertEquals, assertTrue, assertFalse, assertNull, etc.) para verificar os resultados esperados.
*   Utilize o método @BeforeEach para inicializar objetos antes de cada teste, se necessário.
*   Verifique se os métodos da classe GerenciadorDeTarefas estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover tarefas, marcar tarefas como concluídas, listar tarefas pendentes).