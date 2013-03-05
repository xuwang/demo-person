package org.demo.person

import org.demo.person.EmailAddress;
import org.demo.person.Person;

class EmailService {
	
	static dataSource
	
	def getPerson(String username) {
		assert dataSource != null, "Datasource is null! No Good!!!"
		def person = Person.findByUsername(username)
		if (person) {
			return person
		}
		log.debug("Username - ${username} Person -")
		return null
	}

	
	def getEmail(String username) {
		assert dataSource != null, "Datasource is null! No Good!!!"
		def person = Person.findByUsername(username)
		if (person) {
			def wrapper = new EmailAddress()
			wrapper.address = person.email
			return wrapper
		} 
		log.debug("Username - ${username} Email -")
		return null
	}
}
