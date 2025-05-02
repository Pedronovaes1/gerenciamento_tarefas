# 📝 Gerenciador de Tarefas - API REST com Spring Boot

Este projeto é uma API REST desenvolvida com Java e Spring Boot para gerenciar tarefas de forma simples e eficiente. É ideal para estudos e como base para futuros projetos fullstack.

---

## 🚀 Funcionalidades

- ✅ Criar uma nova tarefa
- 📄 Listar todas as tarefas
- 🔍 Buscar tarefa por ID
- ✏️ Atualizar título e descrição de uma tarefa
- 🗑️ Excluir uma tarefa
- ✔️ Marcar tarefa como concluída

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL (ou H2 para testes)
- Maven

---

## 🔌 Endpoints da API

| Método | Rota                        | Descrição                        |
|--------|-----------------------------|----------------------------------|
| GET    | `/api/tarefas`              | Lista todas as tarefas           |
| GET    | `/api/tarefas/{id}`         | Busca uma tarefa por ID          |
| POST   | `/api/tarefas`              | Cria uma nova tarefa             |
| PUT    | `/api/tarefas/{id}`         | Atualiza uma tarefa              |
| DELETE | `/api/tarefas/{id}`         | Exclui uma tarefa                |
| PATCH  | `/api/tarefas/{id}/concluir`| Marca uma tarefa como concluída  |

---

## ⚙️ Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/gerenciador-tarefas.git
   ```

2. Acesse a pasta e abra em sua IDE.

2. Configure o banco de dados no application.properties (ex: PostgreSQL ou H2).

3. Rode o projeto:

```bash
./mvnw spring-boot:run
```

Acesse: http://localhost:8080/api/tarefas
