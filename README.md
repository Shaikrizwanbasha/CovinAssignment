## Setup and Installation

1. Clone the repository.
2. Navigate to the project directory.
3. Build the project:
    bash
    mvn clean install
    
4. Run the application:
    bash
    mvn spring-boot:run
    
5. Access the API documentation at `http://localhost:8080/swagger-ui.html`.

## API Endpoints

### User Endpoints
- `POST /api/users/`: Create a new user.
- `GET /api/users/all`: Retrieve all users.
- `GET /api/users/{id}`: Retrieve user details by ID.

### Expense Endpoints
- `POST /api/expenses/`: Add a new expense.
- `GET /api/expenses/user/{userId}`: Retrieve expenses for a user.

First Import Overall package in an STS run an application 
then provide an details of an client and User details as Username and Password in sql database 
by using postman.api provide an url: "http://localhost:8080/oauth/token?username=rizzu&password=rizu8639&grant_type=password",
In Aunthorization by using basicAuntic provide username and password then bearer token will be generated place in Aunthorization by using Bearer token.
in an body write an data in json formate by the help of swagger document checks the given entity name are equal or not.

