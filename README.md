# Projeto Valorant

Este é um projeto desenvolvido para exercitar conceitos de Spring Framework, especialmente o uso de Spring Boot e Spring Data JPA. O projeto tem como objetivo simular um sistema relacionado ao jogo Valorant, desenvolvido pela Riot Games.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **domain**: Contém as classes de domínio do sistema.
- **repository**: Contém as interfaces dos repositórios que acessam os dados do banco de dados.
- **ValorantProjectApplication**: Classe principal do Spring Boot responsável pela inicialização da aplicação.
- **resources**: Contém recursos como arquivos de configuração, mensagens, etc.

## Classes Principais

### Agente

A classe `Agente` representa um personagem do jogo Valorant. Possui os seguintes atributos:

- `id`: Identificador único do agente (gerado automaticamente).
- `nome`: Nome do agente.
- `papel`: Papel do agente no jogo.
- `saude`: Quantidade de saúde do agente.
- `armadura`: Quantidade de armadura do agente.
- `ultimate`: Habilidade ultimate do agente.

### IAgenteRepository

Interface responsável pela comunicação com o banco de dados para a entidade `Agente`. Estende `CrudRepository` do Spring Data JPA.

### ValorantProjectApplication

Classe principal do Spring Boot. É responsável por inicializar a aplicação e executar as operações desejadas. Implementa `CommandLineRunner` para executar operações ao iniciar a aplicação.

## Configuração

O projeto utiliza as seguintes configurações:

- **Spring Boot**: Facilita a configuração de aplicações baseadas em Spring.
- **Spring Data JPA**: Facilita o acesso e manipulação de dados no banco de dados através de interfaces de repositório.
- **Slf4j (Simple Logging Facade for Java)**: Framework de logging para Java.

## Execução

Ao executar a aplicação, a classe principal `ValorantProjectApplication` é inicializada. Durante a inicialização, um agente é criado e salvo no banco de dados.

