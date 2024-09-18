# Desafio: Implementação de Testes Unitários para o Sistema de Gerenciamento de Alunos

## Descrição do Projeto
Você recebeu um projeto Java simples que implementa um sistema de gerenciamento de alunos. O sistema possui três classes principais: **Aluno**, **Curso** e **GerenciadorDeAlunos**. A classe **Aluno** representa um aluno com ID, nome, e-mail e lista de cursos matriculados. A classe **Curso** representa um curso com ID, nome e descrição. A classe **GerenciadorDeAlunos** gerencia uma lista de alunos, permitindo adicionar, remover, matricular em curso e listar alunos matriculados em um curso.

Seu desafio é implementar testes unitários para as classes **Aluno**, **Curso** e **GerenciadorDeAlunos** utilizando JUnit. Os testes devem cobrir os seguintes cenários:

### AlunoTest.java
- Verificar se os atributos do aluno são inicializados corretamente.
- Verificar se os métodos `setNome` e `setEmail` alteram corretamente os atributos do aluno.

### CursoTest.java
- Verificar se os atributos do curso são inicializados corretamente.
- Verificar se os métodos `setNome` e `setDescricao` alteram corretamente os atributos do curso.

### GerenciadorDeAlunosTest.java
- Verificar se o método `adicionarAluno` adiciona um aluno corretamente ao gerenciador.
- Verificar se o método `removerAluno` remove um aluno corretamente do gerenciador.
- Verificar se o método `matricularAlunoEmCurso` matricula um aluno corretamente em um curso.
- Verificar se o método `listarAlunosMatriculadosEmCurso` retorna os alunos matriculados corretamente.

## Dicas
- Utilize asserções (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, etc.) para verificar os resultados esperados.
- Utilize o método `@BeforeEach` para inicializar objetos antes de cada teste, se necessário.
- Verifique se os métodos da classe **GerenciadorDeAlunos** estão funcionando corretamente em diferentes cenários (e.g., adicionar/remover alunos, matricular alunos em cursos, listar alunos matriculados).
