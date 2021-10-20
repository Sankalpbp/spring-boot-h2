# Spring Boot H2 Usage


H2 is an in-memory embedded database that can be used for quick testing. 

In this example: 

1. An Employee model is created. (Annotated with @Entity)
The @Entity annotation will convert a POJO into a table and will demand for choose a 
primary key from the attributes provided

2. An EmployeeRepository is created which is extending JpaRepository<T, U>

3. And finally a controller to use CRUD on the DB.

4. Add the configuration for the H2 database and enable the H2 console.
See it at localhost:9001/h2-console

