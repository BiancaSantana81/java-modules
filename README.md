# 🚧 [**Readme em construção**] 🚧 # 
## Java Modules

Inspirado no formato didático da 42 (CPP Modules), este repositório é organizado em módulos progressivos, cada um abordando tópicos específicos da linguagem Java. O foco é no aprendizado e na aplicação de conceitos fundamentais.

### Estrutura geral

Este repositório é estruturado em módulos, e cada módulo contém um conjunto de exercícios. Cada exercício possui testes específicos, desenvolvidos com JUnit, para garantir o entendimento prático dos conceitos abordados. Para facilitar o processo de importação da JUnit, compilação e execução dos testes, um Makefile foi desenvolvido para cada exercício.

Veja a seguir um exemplo de estrutura: 

````

├── lib/ (contém .jar para JUnit)
│   ├── junit.jar
│   ├── engine.jar
├── module_00/
│   ├── ex00/
|   |   └── Makefile
|   |   └── src
│   │      └── main/ (arquivos de código)
|   |      └── test/ (arquivos de teste)
|   |      └── target/ 
│   |          ├── classes/       <-- Aqui estão as classes compiladas.

   (os outros exercícios e módulos seguem a mesma estrutura)

````

#### Module-00

