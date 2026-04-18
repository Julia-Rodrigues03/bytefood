🍔 Bytefood 1.0 - Sistema de Gestão de Pedidos
Este é um projeto acadêmico desenvolvido em Java com persistência em banco de dados PostgreSQL. O sistema gerencia o fluxo de um delivery, desde o cadastro de produtos e clientes até a realização e acompanhamento de entregas.

🛠️ Tecnologias Utilizadas
Linguagem: Java (JDK 17+)

Banco de Dados: PostgreSQL

Driver JDBC: PostgreSQL JDBC Driver (incluído na pasta /lib)

Versionamento: Git & GitHub

📐 Estrutura do Banco de Dados
O sistema utiliza uma arquitetura relacional para evitar dependências circulares. A ordem de criação das tabelas é:

Restaurante / Cliente (Independentes)

Produto (FK para Restaurante)

Pedido (FK para Produto e Cliente)

Entrega (FK para Pedido e Cliente)

👥 Equipe e Responsabilidades
Cada integrante é responsável por um módulo específico (Modelo + DAO):

Julia (Líder): Gerenciamento de Produtos, Classe de Conexão e Menu Principal.

Rodrigo: Gerenciamento de Clientes e Restaurantes.

João: Gerenciamento de Pedidos.

Melissa: Gerenciamento de Entregas.

🚀 Como Executar o Projeto
Clonar o repositório:

Bash
git clone https://github.com/Julia-Rodrigues03/Bytefood.git
Configurar o Banco de Dados:

Crie um banco chamado Bytefood no pgAdmin.

Execute os scripts SQL fornecidos nos Guias de Task.

Configurar a Conexão:

Abra src/bytefood/ConexaoBD.java.

Altere a variável senha para a sua senha local do PostgreSQL.

Rodar a aplicação:

Execute a classe Bytefood.java (Main).

📂 Padrão de Codificação
Para manter o projeto organizado, utilizamos o padrão:

Modelo: Classes que representam as tabelas (Ex: Pedido.java).

DAO (Data Access Object): Classes que executam o SQL (Ex: PedidoDAO.java).

Main: Lógica de interface com o usuário e menus.