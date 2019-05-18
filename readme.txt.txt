Coisas que vimos no curso:

- Spring Initializr https://start.spring.io/ 
Project?—?Maven Project
Language?—?Java
Spring Boot— 2.13?—?Deixar a versão sugerida
Group e Artifact
Dependencies?—?Web, Lombok, JPA, H2, Actuator, Rest Repositories, Rest Repositories HAL Browser
No eclipse importar como “Existing Maven Project”




- Anotações @Override @Service @Repository @Entity
- Banco De dados :  H2




PAssos
- Criar classe Contato  -  nome, email, telefone - construtores e get e set, @entity, @Id
-Criart interface Repository implenta JpaRepository<Classe, tipoChavePrimaria> find findAll
-criar classe Service (meio entre controler e repository)
-criar o controler@RestController
     GET ---> findAll ---> findByID
     POST --> create
     PUT  --> update



-Configurações no applications.propereties
-localhost:8080/h2
-postman


https://medium.com/@isagiongo_4988/primeira-api-rest-com-spring-jpa-e-h2-358e43474b1d
