# API dsList - Lista de Games

Este é o repositório do projeto backend da API dsList - Lista de Games. A API permite a criação, leitura, atualização e exclusão de jogos em uma lista. Ela fornece um conjunto de endpoints para gerenciar as informações dos jogos, incluindo seus IDs e outras informações relevantes.

## Funcionalidades

        A API dsList - Lista de Games possui as seguintes funcionalidades principais:

- **Criar um jogo**: permite adicionar um novo jogo à lista, fornecendo as informações necessárias, como o nome, gênero, desenvolvedora, plataforma, etc.

- **Obter uma lista de jogos**: retorna uma lista com todos os jogos presentes na API.

- **Obter informações de um jogo específico**: retorna os detalhes de um jogo específico, com base no seu ID.

- **Atualizar informações de um jogo**: permite atualizar as informações de um jogo existente, fornecendo o ID do jogo e os campos a serem atualizados.

- **Excluir um jogo**: remove um jogo da lista com base no seu ID.

## Tecnologias Utilizadas

        O projeto backend da API dsList - Lista de Games foi desenvolvido utilizando as seguintes tecnologias:

- **Java Spring Boot**: framework para o desenvolvimento de aplicativos Java, oferecendo um ambiente prático para criação de APIs robustas.

- **JPA (Java Persistence API)**: especificação do Java para persistência de dados, utilizada para mapear objetos Java para o banco de dados.

- **Banco de Dados em Memória H2**: banco de dados relacional em memória, utilizado para armazenar as informações dos jogos durante a execução da API.

## Configuração do Ambiente

        Para configurar o ambiente e executar o projeto localmente, siga os passos abaixo:

1. Certifique-se de ter o Java JDK (Java Development Kit) instalado em sua máquina. Você pode baixar a versão mais recente do JDK em: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

2. Clone este repositório em sua máquina local utilizando o comando:
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    
3. Importe o projeto em sua IDE preferida como um projeto Java Maven existente.

4. Configure as propriedades do banco de dados no arquivo `application.properties` para utilizar o banco de dados H2 em memória:

        spring.datasource.url=jdbc:h2:mem:dslistdb
        spring.datasource.driverClassName=org.h2.Driver
        spring.datasource.username=sa
        spring.datasource.password=
        spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

        5. Execute a aplicação Java Spring Boot.

        A API dsList - Lista de Games estará disponível em `http://localhost:8080` ou na porta configurada no arquivo `application.properties`.

        ## Contribuição

        Contribuições são bem-vindas! Se você deseja melhorar este projeto, siga as etapas abaixo:

        1. Faça um fork deste repositório.

        2. Crie uma nova branch com a sua feature ou correção de bug:

        git checkout -b minha-feature
