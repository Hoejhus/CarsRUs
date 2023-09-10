### What are the benefits of using a RESTful API
Typically use JSON or XML as data formats, making it easy to work with in multiple languages.
Simple to use and understand, with simple GET, POST, PUT, DELETE requests.

### What is JSON, and why does JSON fit so well with REST?
JSON is a format for storing and sending data, typically done in objects and plain text, which makes it easy to work with in multiple languages.

### How have you designed simple CRUD endpoints using spring boot and DTOs to separate api from data
I use Spring JPA and Hibernate to be able to access our repo. We use DTO's to map objects from JSON to Java classes.

### What is the advantage of using using DTOs to separate api from data structure when designing rest endpoints
When using DTO's u can make sure that what u are sending out and receiving is just plain JSON and you dont have to manipulate the JSON to a specific template.

### Explain shortly the concept mocking in relation to software testing
Mocking in software testing involves creating simulated or fake objects, functions, or methods to mimic the behavior of real dependencies in a system. This is done to isolate the component being tested and ensure that it functions correctly in isolation from the rest of the system.

### How did you mock database access in your tests, using an in-memory database and/or mockito → Refer to your code
I use in-memory using H2 and Mockito to mock the database access and make isolated tests.

### Explain the concept Build Server and the role Github Actions play here
A build server is a automated server that build your application every time you push to the main branch and tries to build the project. it will give a message if it fails. this is for example controlled with Github Actions where you can control when and how the project is being build.

### Explain maven, relevant parts in maven, and how maven is used in our CI setup. Explain where maven is used by your GitHub Actions Script(s)
Maven is a framework used to read your POM file and it dictates what should be imported and whatnot. there is lifecycles and plugins in maven that do different stuff. but Github actions uses maven to differantiate, where it first uses the lifecycle down until verify or package. and then it uses the deploy lifecycle to test if it works.

### Understand and chose cloud service models (IaaS, PaaS, SaaS, DBaaS) for your projects -> Just explain what you have used for this handin
I have used Azure, where i have made a SQL database which is a DBaaS. I have also deployed my application in Azure on a server which is a Paas.