
### The idea with, and reasons for why to use, a ORM-mapper
Its much easier working with different types of databases such as relational databases when using a ORM-mapper. It also makes it easier to work with the database in a object oriented way.
It increases productivity by having less redundant code.

### The meaning of the terms JPA, Hibernate and Spring Data JPA and how they are connected
JPA is a specification for ORM-mappers. Hibernate is a ORM-mapper that implements the JPA specification.
Spring Data JPA is a framework that makes it easier to work with JPA.

### How to create simple Java entities and map them to a database via the Spring Data API
You create a class and annotate it with @Entity. You can then annotate the fields with @Column or @Table to specify the column name and or table @Id to specify the primary key.

### How to control the mapping between individual fields in an Entity class and their matching columns in the database
You can use @Column to specify the column name and @Table to specify the table name.
If you want to set certain parameters for each column you can do that.
In my code i simply defined the tables and the ids where in Car its generated with auto increment.

### How to auto generate IDs, and how to ensure we are using  a specific database's preferred way of doing it (Auto Increment in our case for  MySQL)
With my Car entity code i use the annotation "@GeneratedValue(strategy = GenerationType.IDENTITY)" to make MySQL autoincrement the Id. 

### How to use and define repositories and relevant query methods using Spring Data JPAs repository pattern

### How to write simple "integration" tests, using H2 as a mock-database instead of MySQL
If you remove the Spring data source, then the SQL environment no longer works and the H2 in memory database is used instead.
Here you can write tests which only gets excecuted on the mock database.

### How to add (dev) connection details for you local MySQL database
### How you did that