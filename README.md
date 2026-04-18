# 🍔 Bytefood 1.0 - Sistema de Gestão de Delivery

Sistema de backend desenvolvido em **Java** com persistência em banco de dados **PostgreSQL**, focado no gerenciamento de pedidos, produtos e logística de entregas.

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17+
* **Banco de Dados:** PostgreSQL
* **Driver JDBC:** PostgreSQL JDBC Driver (localizado na pasta `/lib`)
* **Versionamento:** Git & GitHub

---

## 📐 Estrutura do Banco de Dados
Para garantir a integridade dos dados e evitar dependências circulares, a ordem de criação das tabelas no PostgreSQL deve ser:
1. **Clientes e Restaurantes:** Cadastros base independentes.
2. **Produtos:** Vinculados a um Restaurante (FK).
3. **Pedidos:** Vinculados a um Produto e a um Cliente (FK).
4. **Entregas:** Registros de envio vinculados a um Pedido e Cliente (FK).

---

## 👥 Equipe e Responsabilidades
* **Julia Rodrigues (Líder):** Desenvolvimento da base do sistema, Conexão com Banco de Dados e Módulo de **Produtos**.
* **Rodrigo:** Responsável pelo Módulo de **Clientes** e **Restaurantes**.
* **João:** Responsável pelo Módulo de **Pedidos**.
* **Melissa:** Responsável pelo Módulo de **Entregas/Logística**.

---

## 🚀 Como Configurar e Executar
1. **Clone o repositório:** `git clone https://github.com/Julia-Rodrigues03/bytefood.git`
2. **Banco de Dados:** Crie o banco `Bytefood` no seu pgAdmin e execute os scripts SQL de cada módulo.
3. **Conexão:** Ajuste a senha do banco no arquivo `src/bytefood/ConexaoBD.java`.
4. **Execução:** Rode a classe principal `Bytefood.java`.

---

## 📂 Padrão de Projeto
O projeto utiliza o padrão **DAO (Data Access Object)** para separar a lógica de negócio da persistência de dados, garantindo um código mais limpo e organizado.
