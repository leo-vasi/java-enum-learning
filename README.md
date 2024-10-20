# Java Enum Learning
Este repositório contém um projeto educacional desenvolvido para explorar o uso de enums em **Java**, além de praticar o uso do **Maven** como gerenciador de dependências e do **IntelliJ IDEA** como IDE. O principal objetivo é consolidar o conhecimento sobre o uso de **enums** e o gerenciamento de projetos Java com ferramentas modernas.

## Propósito do Projeto
O projeto foi criado como parte do meu aprendizado contínuo em **Java**, sendo a minha primeira experiência com **enums**. Ele oferece uma simulação de um sistema de gerenciamento de trabalhadores e seus contratos por hora, permitindo o cálculo da renda com base nos contratos.

## Funcionamento do Projeto
O projeto simula um sistema no qual é possível cadastrar trabalhadores, associar contratos a eles, e calcular sua renda em um período específico. O enum **WorkerLevel** é utilizado para definir o nível do trabalhador (JUNIOR, MID_LEVEL ou SENIOR).

## Fluxo do Programa
1. **Entrada de Dados do Departamento e Trabalhador:**

* O programa solicita o nome do departamento ao qual o trabalhador pertence.
* Em seguida, pede o nome do trabalhador, seu nível (usando o enum WorkerLevel) e o salário base.

2. **Cadastro de Contratos por Hora:**
* O usuário informa quantos contratos o trabalhador possui.
* Para cada contrato, o usuário deve fornecer:
* A data (no formato DD/MM/YYYY),
* O valor pago por hora,
* A quantidade de horas trabalhadas.

3. **Cálculo da Renda:**
* O usuário informa o mês e o ano (no formato MM/YYYY) para calcular a renda do trabalhador nesse período.

* O programa então calcula a renda total, somando o salário base com o valor gerado pelos contratos.

## Enum Utilizado
O enum **WorkerLevel** define os níveis de trabalho do trabalhador:

* **JUNIOR**
* **MID_LEVEL**
* **SENIOR**

## Tecnologias Utilizadas

- Linguagem: Java
- **IDE:** [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- **Gerenciador de Dependências:** [Maven](https://maven.apache.org/)
