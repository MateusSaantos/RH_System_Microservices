<h1>RH_System_Microservices</h1>

**RH_System_Microservices** é um projeto desenvolvido com Spring Boot para gerenciar recursos humanos em uma arquitetura de microserviços. 
O sistema é composto por quatro microserviços principais: **eureka-server, gateway-api, payroll-api e user-api.** O projeto utiliza Spring Cloud para descoberta de serviços 
e roteamento de requisições, oferecendo uma solução escalável e modular.

<h3>Descrição</h3>
Este projeto é um estudo utilizando uma arquitetura de microserviços. 
A configuração inclui um servidor de descoberta Eureka, um gateway API para roteamento de requisições, e APIs específicas para gerenciamento de usuários e folhas de pagamento.<br><br>

## 🚀Começando
Para configurar e executar o projeto localmente, siga estas etapas:

## ⚙️Pré-requisitos
Antes de começar, você precisará instalar:

* Java 17: Para executar o projeto.
* Maven: Para gerenciar dependências e construir o projeto.
* MySQL: Para o banco de dados.
* Postman: Para testar as APIs.
* IDE (IntelliJ IDEA, Eclipse, etc.): Para o desenvolvimento.

## 💾Configure o Banco de Dados MySQL:
Atualize as configurações do banco de dados nos arquivos application.properties dos microserviços user-api e payroll-api:

## 🖇️Navegue até o diretório de cada microserviço e execute:

* eureka-server: Serviço de descoberta.
* gateway-api: API Gateway para roteamento.
* user-api: Gerenciamento de usuários.
* payroll-api: Gerenciamento de folha de pagamento.

## 📋 Testes
Para garantir que os microserviços estejam funcionando corretamente, foram executados os testes:
* Testes de Integração: Verificam a interação entre os microserviços e a integração com o banco de dados.
* Testes Unitários: Validam a funcionalidade de cada componente individualmente.

## 🛠️ Ferramentas Utilizadas
Spring Boot: Framework para desenvolvimento de microserviços.
Spring Cloud: Para serviços de descoberta e roteamento.
Eureka Server: Serviço de registro e descoberta.
Spring Gateway: API Gateway para roteamento de requisições.
Feign Client: Para comunicação entre microserviços.
MySQL: Banco de dados relacional.
Maven: Gerenciamento de dependências e build.

## 🎉 Agradecimentos
Agradecemos a todos que contribuíram para este projeto e a Compass Uol pelo suporte e aprendizado.
