package org.demo.person

class Person {
	
	String username
	String firstName
	String lastName
	String email
	
	static expose = 'person'	
	static api = [excludedFields: [ "properties", "errors", "attached"]]
    static constraints = {
		username(maxSize: 100, blank:false)
		firstName(maxSize: 50, blank:false)
		lastName(maxSize: 50, blank:false)
		email(email: true, maxSize: 100, blank:false)
		
    }
}
