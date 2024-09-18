# Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Funcionários

## Descrição do Projeto
Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de funcionários. O sistema possui três classes principais: **Funcionario**, **Departamento** e **GerenciadorDeFuncionarios**. A classe **Funcionario** representa um funcionário com ID, nome, e-mail e departamento. A classe **Departamento** representa um departamento com ID, nome e descrição. A classe **GerenciadorDeFuncionarios** gerencia uma lista de funcionários, permitindo adicionar, remover, atualizar e listar funcionários por departamento.

Seu desafio é implementar testes unitários para as classes **Funcionario**, **Departamento** e **GerenciadorDeFuncionarios** utilizando JUnit. Os testes devem cobrir os seguintes cenários:

### FuncionarioTest.java
- Verificar se os atributos do funcionário são inicializados corretamente.
- Verificar se os métodos `setNome` e `setEmail` alteram corretamente os atributos do funcionário.

### DepartamentoTest.java
- Verificar se os atributos do departamento são inicializados corretamente.
- Verificar se os métodos `setNome` e `setDescricao` alteram corretamente os atributos do departamento.

### GerenciadorDeFuncionariosTest.java
- Verificar se o método `adicionarFuncionario` adiciona um funcionário corretamente ao gerenciador.
- Verificar se o método `removerFuncionario` remove um funcionário corretamente do gerenciador.
- Verificar se o método `atualizarFuncionario` atualiza um funcionário corretamente no gerenciador.
- Verificar se o método `listarFuncionariosPorDepartamento` retorna os funcionários corretamente por departamento.

## Dicas
- Utilize asserções (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, etc.) para verificar os resultados esperados.
- Utilize o método `@BeforeEach` para inicializar objetos antes de cada teste, se necessário.
- Verifique se os métodos da classe **GerenciadorDeFuncionarios** estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover funcionários, atualizar funcionários, listar funcionários por departamento).
