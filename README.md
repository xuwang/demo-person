This is a simple grails demo app with json-rest-api

Gets a list of person objects 
-----------------------------
	GET on http://localhost:8080/demo-email/api/person 
	(possible arguments are the same as for the DomainClass.list() method argument map)

* Retrieves the given instance
-----------------------------
	GET on http://localhost:8080/demo-email/api/person/id 

* Creates a new instance
-----------------------------
	POST on http://localhost:8080/demo-email/api/person 

* Updates the given instance by ID
-----------------------------
	PUT on http://localhost:8080/demo-email/api/person/id 

* Dletes the given instance
-----------------------------
	DELETE on http://localhost:8080/demo-email/api/person/id 
