# spring-boot-swagger
# What is Swagger?
Swagger is used to generate UI for all end point of a REST application. Its not easy to remember all APIs. We can see all the APIs on swagger UI very easily.  Swagger allows you to describe the structure of your APIs so that machines can read them. The ability of APIs to describe their own structure is the root of all awesomeness in Swagger. Why is it so great? Well, by reading your API’s structure, we can automatically build beautiful and interactive API documentation. We can also automatically generate client libraries for your API in many languages and explore other possibilities like automated testing. Swagger does this by asking your API to return a YAML or JSON that contains a detailed description of your entire API. This file is essentially a resource listing of your API which adheres to OpenAPI Specification. The specification asks you to include information like:
What are all the operations that your API supports?
What are your API’s parameters and what does it return?
Does your API need some authorization?
And even fun things like terms, contact information and license to use the API.
You can write a Swagger spec for your API manually, or have it generated automatically from annotations in your source code. Check swagger.io/open-source-integrations for a list of tools that let you generate Swagger from code.


#What is the use of Swagger?
1. Quick UI Integration:- UI team can see request url, request body and reponse and it helps them to integrate APIs with UI quickly.
2. Better Productivity:- To understand the flow of the application for new developer, one can refer this documentation through which he can recognize the flow.


#So, I’ve got a Swagger spec for my API. Now what?
There are a few ways in which Swagger can help drive your API development further:
Design-first users: use Swagger Codegen to generate a server stub for your API. The only thing left is to implement the server logic – and your API is ready to go live!
Use Swagger Codegen to generate client libraries for your API in over 40 languages.
Use Swagger UI to generate interactive API documentation that lets your users try out the API calls directly in the browser.
Use the spec to connect API-related tools to your API. For example, import the spec to SoapUI to create automated tests for your API.
And more! Check out the open-source and commercial tools that integrate with Swagger.



#Now its time to create a project on https://start.spring.io/ with following dependencies
1. Spring Boot DevTools:- Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
2. Spring Web :- Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
3. H2 Database:- Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
4. Lombok:- Java annotation library which helps to reduce boilerplate code
5. Spring Data JPA:- Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.




