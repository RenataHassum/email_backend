### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto Email Service [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/email_backend/blob/main/LICENSE) 

Email Service é uma solução de envio de e-mails personalizados e transacionais, utilizando o serviço SendGrid. Desenvolvido com o framework Spring Boot, o projeto garante uma estrutura sólida e eficiente para o envio direto e eficaz de e-mails. O Email Service é um projeto proposto pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/email_backend.git

# entrar na pasta do projeto back end
cd email_backend
cd integrations

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-38dc9bea-f0bb-488b-b65c-36482de9c965?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-38dc9bea-f0bb-488b-b65c-36482de9c965%26entityType%3Dcollection%26workspaceId%3Dc29d39e1-fd20-485c-b29f-fd827f7f0afc)
   
#### Não é necessário realizar a configuração de ambiente do projeto

##  Envio de Email endpoint - Utiliza o serviço SendGrid de forma gratuita
`POST Send email`
- Permite criar um email personalizado
- Devido à configuração gratuita, não é possível personalizar o email do remetente. No entanto, é possível personalizar o destinatário do email fornecendo o endereço desejado na propriedade "to" do objeto de envio de email:
  - "to" : "example@mail.com"
- Ao realizar a requisição, se o sistema retornar o código "200" como resultado, isso indica que a operação foi concluída com sucesso e está funcionando corretamente

# Tecnologias | Implantação em produção
- Java, Spring Boot, Send Grid, API REST, Maven, Git
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem

# Técnicas | Competências
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- SendGrid: Implementa soluções de envio de e-mails personalizados e transacionais.

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
