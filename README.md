# Screen Sound

Programa produzido como resposta ao desafio final do curso "Java: persistência de dados e consultas com Spring Data JPA"
da plataforma Alura em parceria com a Oracle. O [desafio](https://github.com/alura-cursos/3355-java-desafio/blob/main/README.md)
se tratava em salvar informações de músicas e artistas no banco de dados e recuperá-las de diferentes formas usando o JPA.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

## Execução

Para executar esse projeto você precisa ter o [Postgres](https://www.omdbapi.com/).

1. Crie um banco de dados postgres nomeado `db_screensound` e insira a senha do
seu usuário postgres no campo em branco do arquivo `src\main\resources\application.properties`

    - Caso você queira utilizar outro nome para o banco ou nome de usuário,
    basta alterar os valores desse mesmo arquivo para os desejados

2. Abra o projeto na IDE de sua preferência e instale as dependências maven do
projeto
