# Projetos de Java - Faculdade Estácio

Este repositório contém os projetos que desenvolvi durante minha graduação para aplicar e aprofundar os conceitos aprendidos em sala de aula.

## Projetos:

- **Tratando Exceções com FileReader:** Um programa simples que lê um arquivo de texto e demonstra o uso robusto de `try-catch-finally` para lidar com `IOException`, garantindo que os recursos sejam sempre fechados corretamente.

- **Encadeamento de Exceções:** Um exemplo prático que demonstra a técnica de *Exception Chaining*. O código captura uma exceção técnica de baixo nível (`IllegalArgumentException`) e a relança como uma exceção de negócio mais específica (`NomeInvalidoExcecao`), preservando a causa original do erro para facilitar a depuração.

- **Concatenação de Arrays e Erros de Memória:** Demonstra a concatenação de arrays usando `System.arraycopy` e o tratamento de erros críticos do sistema, como o `OutOfMemoryError`, ao tentar alocar grandes quantidades de memória. Também inclui validações para evitar o `NullPointerException`.

- **Simulação de Concorrência com Threads (Material de Estudo):** Análise de um sistema que simula uma linha de produção com múltiplas equipes e empacotadores (threads) competindo por recursos limitados. Este projeto foi fundamental para o estudo prático de conceitos avançados de concorrência.
  > **Nota de Autoria:** O código-fonte deste projeto de simulação foi inteiramente desenvolvido pelo **Prof. Marlos M. Corrêa** como material didático. Os créditos pela arquitetura e implementação são dele. O projeto está incluído neste portfólio como registro do meu processo de estudo sobre o tema.