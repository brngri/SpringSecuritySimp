<h1 align="center">API com Spring Security</h1>

<div align="center">
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
  <img src="https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white" alt="MySql">
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman">
  <img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white" alt="Docker">
</div>

---

## 📄 Resumo

Este projeto tem como objetivo aprender a utilizar o Spring Security.

---

## 🔧 Tecnologias

- Java 21
- Spring Boot
- Spring Security 
- OAuth2 Resource Server
- MySql
- Git, Docker e Postman  

---

## ✅ Práticas Adotadas

- **Versionamento de Código:** Git para controle de versões e colaboração.  
- **Documentação:** Manutenção de documentação clara e detalhada.  
- **Consultas:** JpaRepository para operações no banco de dados.  
- **API REST:** Implementação de endpoints RESTful.  
- **Containerização com Docker:** Banco de dados MySql containerizado.  

---

## 🚀 Como Executar a Aplicação

### 📋 Pré-requisitos

- [Postman](https://www.postman.com/downloads/).
- [Docker](https://www.docker.com/products/docker-desktop/).
- [Maven](https://maven.apache.org/download.cgi) ([Como instalar](https://www.youtube.com/watch?v=rfhTnfbBQcY)).  

---

### 🛠️ Passos para Execução

1. **Clone o repositório:**  
   ```bash
     git clone https://github.com/brngri/SpringSecuritySimp.git
    ```


2. **Ativar banco de dados:**  
   ```bash
     docker compose up -d
    ```


3. **Abra o postman:**

---
   
#### Criar usuário (POST)

OBS: Usuário admin já foi criado. Username: admin ; password: 123

URL: 
```url
http://localhost:8080/users
```
```JSON
{
    "username": "bruno",
    "password": "123"
} 
```

#### Fazer login (POST)

OBS: O login vai gerar um token bearer

URL:
```url
http://localhost:8080/login
```
Body:
```JSON
{
    "username": "admin",
    "password": "123"
} 
````

#### Listar usuários (GET)

OBS: Apenas o usuário admim tem permissão

URL:
```url
http://localhost:8080/users
```
Authorization:
```TOKEN
Token aqui
```

OBS: O token perde a validade em 5 min após criado



