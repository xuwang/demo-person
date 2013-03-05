This is a simple grails demo app with json-rest-api

Get a list of person objects 
GET	http://localhost:8080/demo-email/api/person 
	(possible arguments are the same as for the DomainClass.list() method argument map)

retrieves the given instance
GET	http://localhost:8080/demo-email/api/person/id 

creates a new instance
POST 	http://localhost:8080/demo-email/api/person 

updates the given instance by ID
PUT	http://localhost:8080/demo-email/api/person/id 

deletes the given instance
DELETE	http://localhost:8080/demo-email/api/person/id 
