# PC Build

Esse projeto foi desenvolvido como parte do desafio **"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"** proposto pela **DIO (Digital Innovation One)**. A aplicação consiste em um sistema para gerenciar usuários e suas respectivas configurações (builds) de PC, armazenando as informações em um banco de dados relacional.

---

## Objetivos

- Criar um sistema completo (CRUD) para gerenciar usuários e configurações de PC.
- Aprender e aplicar padrões de projeto na prática utilizando o ecossistema Spring Boot.
- Relacionar dados no banco (vincular cada usuário à sua respectiva build de PC).
- Gerar uma documentação interativa e visual para a API utilizando o Swagger.

---

## Tecnologias Utilizadas
- **Java** (Linguagem de programação)
- **Spring Boot** (Framework para o desenvolvimento da API)
- **Spring Data JPA** (Gerenciamento e conexão com o banco de dados)
- **Banco H2** (Banco de dados em memória para testes práticos)
- **Maven** (Gerenciador de dependências do projeto)
- **Swagger / OpenAPI** (Documentação visual dos endpoints)

---

## Como Executar

1. Executar esse comando no diretório do projeto:
```bash
mvn spring-boot:run
```

2. Para acessar a documentação Swagger enquanto o servidor está ativo, é só usar essa URL: http://localhost:8080/swagger-ui/index.html#/

---

## Imagens da Documentação no Swagger

### POST
<img width="961" height="482" alt="image" src="https://github.com/user-attachments/assets/98b50b71-f408-4e75-a29b-20d6cae70f79" />
<img width="963" height="771" alt="image" src="https://github.com/user-attachments/assets/3dd8df81-e573-4b3b-8ae8-540932baf930" />

### GET
<img width="971" height="933" alt="image" src="https://github.com/user-attachments/assets/747e348e-3cea-434c-8ba0-42f99faaab64" />

### GET com ID
<img width="971" height="924" alt="image" src="https://github.com/user-attachments/assets/e195c579-9a8a-4369-bfdc-45abf5c23e3d" />

### DELETE
<img width="971" height="648" alt="image" src="https://github.com/user-attachments/assets/bde952f0-7677-4bcc-9fcf-0a129cde359c" />
