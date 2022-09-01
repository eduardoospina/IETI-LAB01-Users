# IETI-LAB01-Users

## AUTOR.

> Eduardo Ospina Mejia



### Desplegando localmente.

En esta seccion se daran intrucciones de como descargar y correr localmente la API REST de users:

##### Requisitos:
1)   [Java 11](https://www.java.com/download/ie_manual.jsp) 
2)   [Git](https://git-scm.com/downloads) 
3)   IDE de java. (intellij o visual studio code)

##### Despliegue local API

para esto se siguen los siguientes pasos:

1) clonar el repositorio, ya se a traves de cmd o de GIT: 

	git clone https://github.com/eduardoospina/IETI-LAB01-Users.git

2) ingresamos al proyecto clonado y desde cmd hacer uso de gradle. 

```maven
	gradle build
      gradlew bootRun
```


3) Ejecutamos el proyecto utilizando los comandos en el cmd o corremos directamente desde la ide.


### Desarrollo:


##### Part 1: Implementing the Users Microservice RESTFUL API

    1) Create a new project using the Spring Initializr .

    2) Use either Java or Kotlin as programming language.

    3) Use Gradle as project option.

    4) Add Spring Web dependency.

    5) Use latest Spring Boot version (make sure your selection doesn't contain SNAPSHOT or M1 (those are not as stable as the rest).

    6) Click on generate.

    7) Create a new public repo, name it as you like.

    8) Commit/push the files generated.

    9) Open the project on favorite editor (IntelliJ IDEA is highly recommended throughout this course).

    10) Create a new package called dto and inside define your UserDto object with at least the following fields:
        - id
        - name
        - email
        - lastName
        - createdAt

    11) Create a new package called entities and inside define your User entity object with the same fields as the dto version (Types don't matter yet, just be sure both DTO classes and Data classes types are consistent enough):

    12) Create a new package called service and inside create the following interface:

    13) Create an implementation of the UserService using a HashMap data structure inside.

    14) Make your service implementation UserServiceHashMap injectable using the @Service annotation.

    15) Create a new package called controller and create a new class UserController inside.

    16) Annotate your UserController so it becomes a REST Controller:

    17) Inject your UserService implementation inside the UserController via the constructor:

    18) Implement all the endpoints needed to interact with you UserService. Use the following method signatures to help you achieve the Level 2 RESTFUL Maturity:

    20) Remember to only expose to client relevant fields through Dto classes, not Entity classes (to decouple persistence model from API), you should implement on both User and UserDto mapping methods (toEntity, toDto accordingly).
    21) Build / Run your project.
    22) Download and install Insomnia and test ALL the endpoints of your API.

##### Estructure: 

![](https://i.postimg.cc/4396zkSn/estrucutura-usuarios.png)

##### hashmap: 

![](https://i.postimg.cc/26N4GcsG/implementacion-hashmap-usuario.png)

##### Controller:

![](https://i.postimg.cc/2yznRq8B/controller-usuario.png)



### Insomnia: 


##### getall()
![](https://i.postimg.cc/tRm565r1/insomian-user-1.png)

##### create()
![](https://i.postimg.cc/WbF7wkK5/insomian-user-2.png)

##### create()
![](https://i.postimg.cc/Sxc7wpm8/insomian-user-3.png)

##### getall()
![](https://i.postimg.cc/43ZbGF30/insomian-user-4.png)

##### findbyid()
![](https://i.postimg.cc/d1V2kkrm/insomian-user-5.png)

##### update()
![](https://i.postimg.cc/tTvhhqz0/insomian-user-6.png)


##### getall()
![](https://i.postimg.cc/QCBcm26F/insomian-user-7.png)

##### delete()
![](https://i.postimg.cc/gjf8Tg5N/insomian-user-8.png)

##### getall()
![](https://i.postimg.cc/fWFcybLm/insomian-user-9.png)













