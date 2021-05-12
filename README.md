# moderantest

## Instructions
Compiled project is in /jar/moderantest-0.0.1-SNAPSHOT.jar

Run `java -jar moderantest-0.0.1-SNAPSHOT.jar` in the command line

### POST
Run `curl -v -X POST localhost:8888/person -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee"}'` to add a person with the name Samwise Gamgee to the database

### GET
Run `curl http://localhost:8888/person?search=baggins` to search for persons with the name baggins <br>
You can run `curl http://localhost:8888/person?search=` to get all the persons in the database
