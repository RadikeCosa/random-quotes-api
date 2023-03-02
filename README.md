# Random Quotes API

This API provides a list of quotes and allows adding, deleting, and getting random quotes.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## Installation and Setup

1. Clone this repository to your local machine.
2. Set up the MySQL database on your local environment and make sure you have the required configuration details such as the username, password, and database name.
3. Open the `application.properties` file in the project and configure your MySQL database details.
4. Open a terminal and navigate to the project directory.
5. Run the following command to build the project and generate the JAR file:

mvn clean install

6. Run the following command to start the application:

java -jar target/random-quotes-1.0.jar


7. The application should now be available at `http://localhost:8080`.

## Endpoints

- `GET /api/quotes`: Returns a list of all quotes stored in the database.
- `GET /api/quotes/random`: Returns a random quote from the database.
- `POST /api/quotes`: Adds a new quote to the database.
- `DELETE /api/quotes/{id}`: Deletes a quote from the database by ID.

## Example Request and Response

### GET /api/quotes/random

_Response:_

```json
{
"id": 5,
"text": "Creativity is intelligence having fun.",
"author": "Albert Einstein"
}
POST /api/quotes
Request:
{
    "text": "Happiness is not something ready made. It comes from your own actions.",
    "author": "Dalai Lama"
}
Response:
The quote was successfully added
Contribution
If you would like to contribute to this project, feel free to open a new pull request or message the repository owner.
