# Teste de Caixa Branca (Etapa 1)

Este documento destaca os principais erros encontrados no código Java fornecido.

## 1. Erro no Driver MySQL

O nome da classe do driver MySQL está incorreto no código. Deve ser "com.mysql.jdbc.Driver" em vez de "com.mysql.Driver.Manager". Portanto, a seguinte linha precisa ser corrigida:

```java
Class.forName("com.mysql.Driver.Manager").newInstance();

Deve ser alterado para:

Class.forName("com.mysql.jdbc.Driver").newInstance();
```

## 2. Falta de Documentação
Não há comentários ou documentação explicando o propósito e o funcionamento do código. É uma boa prática incluir comentários para explicar o que o código faz, especialmente se ele for compartilhado com outras pessoas ou por parte de um projeto maior.

## 3. Nomenclatura de Variáveis ​​e Constantes
A nomenclatura das variáveis ​​é razoavelmente clara, mas pode ser melhorada para ser mais clara e seguir as práticas de nomenclatura. Por exemplo, nome poderia ser mais descritivo, como nomeDoUsuario. Além disso, sql poderia ser querySQL.

## 4. Legibilidade e Organização
O código é um pouco difícil de ler devido à falta de proteção e formatação protegidas. É importante adicionar comentários para melhorar a legibilidade. Além disso, deve haver uma organização mais clara do código.

## 5. Tratamento de Exceções
Não há tratamento explícito para possíveis alternativas, como NullPointerException. Se ocorrer uma exceção, o código simplesmente ignora, o que não é uma prática recomendada. É importante adicionar tratamento de abordagens adequadas para garantir que o código funcione corretamente e trate erros de maneira semelhante.

## 6. Falta de fechamento de conexões
Não há evidência de fechamento adequado das conexões com o banco de dados. É fundamental garantir que as conexões com o banco de dados sejam devidamente fechadas para evitar vazamentos de recursos.

# Teste de Caixa Branca (Etapa 2)
## Grafo de Fluxo
![grafo-fluxo](https://github.com/marcustakeyasu/teste-caixa-branca/assets/116593545/7362184f-b6f6-4f6c-9a25-fe72e33efc05)

## Cálculo Complexidade Ciclomática
![cálculo-complexidade-ciclomática](https://github.com/marcustakeyasu/teste-caixa-branca/assets/116593545/ba46fa0b-10c9-4b92-9db7-ac13badb5e71)

## Todas as sequências
![sequencias](https://github.com/marcustakeyasu/teste-caixa-branca/assets/116593545/06ae5821-beca-4aac-a82e-329b749ff71f)

# Teste de Caixa Branca (Etapa 3)

## Descrição

Este repositório contém um projeto de teste de caixa branca, parte de um estudo na disciplina de Qualidade de Software. O objetivo do projeto é analisar um código-fonte específico, identificando erros, calculando a complexidade ciclomática e documentando o código.

## Funcionalidades

- Análise de código-fonte em busca de erros.
- Criação de um grafo de fluxo.
- Cálculo da complexidade ciclomática.
- Documentação do código.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/` - Contém o código-fonte a ser analisado.
- `docs/` - Contém documentação relacionada ao projeto.
- `README.md`: Este arquivo, fornecendo uma visão geral do repositório.

## Uso

Para realizar a análise de código e as etapas do projeto:

1. Abra o código-fonte localizado na pasta `src/`.
2. Realize a análise de código em busca de erros.
3. Crie um grafo de fluxo do código.
4. Calcule a complexidade ciclomática.
5. Documente o código e armazene os documentos na pasta `docs/`.


