Coisas que vimos no curso:

- Spring Initializr https://start.spring.io/ 
Project?�?Maven Project
Language?�?Java
Spring Boot� 2.13?�?Deixar a vers�o sugerida
Group e Artifact
Dependencies?�?Web, Lombok, JPA, H2, Actuator, Rest Repositories, Rest Repositories HAL Browser
No eclipse importar como �Existing Maven Project�




- Anota��es @Override @Service @Repository @Entity
- Banco De dados :  H2




PAssos
- Criar classe Contato  -  nome, email, telefone - construtores e get e set, @entity, @Id
-Criart interface Repository implenta JpaRepository<Classe, tipoChavePrimaria> find findAll
-criar classe Service (meio entre controler e repository)
-criar o controler@RestController
     GET ---> findAll ---> findByID
     POST --> create
     PUT  --> update



-Configura��es no applications.propereties
-localhost:8080/h2
-postman