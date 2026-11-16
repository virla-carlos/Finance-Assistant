# Finance Assistant

Projeto em desenvolvimento para ajudar pessoas a centralizar, organizar e compreender suas informações financeiras, especialmente quando utilizam um ou mais bancos.

A primeira versão planejada será uma aplicação Java executada pelo terminal, com registro manual de receitas e despesas. A visão futura é evoluir para um sistema web com gráficos e assistente de IA para consultas e apoio à organização financeira.

O projeto também tem como objetivo desenvolver conhecimentos de Java, orientação a objetos, back-end, front-end e integração com IA por meio de entregas incrementais.

## Status atual

O Finance Assistant está na fase inicial de desenvolvimento. A v0.1 ainda não foi lançada e as funcionalidades financeiras ainda não foram implementadas.

Até o momento:

- Objetivo e escopo da primeira versão definidos.
- Repositório e quadro Kanban criados.
- Ambiente Java preparado e testado na máquina pessoal.
- Programa simples em `src/Main.java` utilizado para validar compilação e execução.

O código atual é um programa de validação do ambiente. Ainda não existe integração com bancos ou inteligência artificial.

## Problema e público-alvo

Informações financeiras distribuídas entre diferentes bancos podem dificultar a compreensão das receitas, despesas e do resultado de um período.

O projeto é voltado a pessoas que desejam organizar essas informações em um único lugar. Na v0.1 planejada, os registros serão inseridos manualmente pelo terminal.

O sistema registrará informações financeiras; não executará pagamentos nem movimentará dinheiro real.

## Escopo planejado da v0.1

A primeira versão deverá permitir:

- Registrar receitas e despesas manualmente.
- Informar descrição, valor e data de cada movimentação.
- Identificar cada registro como receita ou despesa.
- Validar valor positivo, data válida e descrição preenchida.
- Listar as movimentações registradas.
- Consultar o total de receitas, o total de despesas e o resultado.
- Utilizar um menu com opções para registrar, consultar e sair.

Os valores serão expressos em reais (BRL), e o resultado será calculado como:

**Resultado = total de receitas − total de despesas**

Esse resultado será baseado apenas nos registros inseridos e não representará necessariamente o saldo bancário real.

O armazenamento será somente em memória durante a execução. **Ao encerrar o programa, todos os registros serão perdidos.**

## Tecnologias

### Tecnologias e ferramentas já utilizadas

- **Java e JDK 21** — versão registrada no teste do ambiente: Microsoft OpenJDK 21.0.13.0.2.
- **Git e GitHub** — versionamento e hospedagem do repositório.
- **GitHub Issues e Projects** — organização das tarefas em Kanban.
- **IntelliJ IDEA e VS Code** — ferramentas de desenvolvimento.

### Stack planejada para a evolução web

Estas tecnologias ainda não foram implementadas e não são necessárias para executar o programa atual.

| Área | Tecnologias planejadas |
| --- | --- |
| Back-end | Java com Spring Boot |
| Banco de dados | PostgreSQL |
| Front-end | React com TypeScript |
| Ferramentas de front-end e estilos | Vite e Tailwind CSS |
| Gráficos | Recharts |
| Integração com IA | Spring AI e modelo acessado por API, com provedor ainda não definido |

## Estrutura do projeto

Estrutura atual conhecida dos arquivos relevantes:

```text
Finance-Assistant/
├── README.md
├── .gitignore
└── src/
    └── Main.java
```

- `README.md`: documentação do projeto.
- `.gitignore`: regras para arquivos que não devem ser versionados.
- `src/Main.java`: programa utilizado para validar o ambiente Java.

A pasta `out/` será gerada pela compilação e conterá os arquivos compilados. Ela não faz parte do código-fonte. Configurações locais dos editores também não são componentes da aplicação.

## Pré-requisitos e execução

Para executar o programa atual, tenha o **JDK 21** instalado, com os comandos `java` e `javac` disponíveis no terminal.

Obtenha uma cópia do [repositório Finance-Assistant](https://github.com/virla-carlos/Finance-Assistant) e abra um terminal na raiz do projeto, onde está a pasta `src`.

### 1. Conferir o JDK

```bash
java -version
javac -version
```

Verifique se ambos os comandos estão disponíveis e indicam a versão 21.

### 2. Compilar

```bash
javac -d out src/Main.java
```

O comando `javac` compila o código-fonte. A opção `-d out` define a pasta de destino dos arquivos compilados.

### 3. Executar

```bash
java -cp out Main
```

O comando `java` executa a classe compilada. A opção `-cp out` indica onde essa classe está localizada.

**Atualmente, esses comandos executam apenas o programa de validação do ambiente, não o sistema financeiro completo.**

## Exemplo planejado de uso

O cenário abaixo descreve o comportamento esperado da v0.1. **Ele ainda não está disponível no código atual.**

1. Registrar uma receita de **R$ 2.000,00**, com descrição “Salário” e uma data válida.
2. Registrar uma despesa de **R$ 150,00**, com descrição “Supermercado” e uma data válida.
3. Consultar a listagem com as duas movimentações.
4. Consultar o resumo:
    - Total de receitas: **R$ 2.000,00**.
    - Total de despesas: **R$ 150,00**.
    - Resultado: **R$ 1.850,00**.

## Evoluções futuras

Os seguintes itens estão fora do escopo da v0.1 e poderão ser avaliados em etapas posteriores, sem datas definidas:

- Controle de contas e registro de transferências entre contas próprias.
- Categorias para as movimentações.
- Edição e exclusão de movimentações.
- Persistência em arquivos ou banco de dados.
- Importação de extratos e integração bancária.
- Cadastro de usuários e autenticação.
- API e interface web.
- Gráficos.
- Inteligência artificial para consultas e apoio à organização financeira.

## Organização do desenvolvimento

O desenvolvimento utiliza Kanban no GitHub Projects, com as colunas:

1. **Backlog**
2. **Ready**
3. **In progress**
4. **In review**
5. **Done**

O trabalho é organizado com uma tarefa em andamento por vez. As Issues registram os objetivos, as atividades, os critérios de aceite e as evidências de cada tarefa.

A **Discovery-01 foi concluída**. O ambiente Java também foi validado; essa validação, por si só, não confirma o encerramento da **Setup-01**.

## Autor

**Carlos Alberto Virla Neto**

LinkedIn: [@Carlos Alberto](https://www.linkedin.com/in/carlos-alberto-915aab356/)
