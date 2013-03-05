package org.demo.person

import grails.converters.*

class EmailServiceController {
	def emailService
	
    def index() {
		forward(action: "email")
	}
	
	def getEmail() {
		def data = emailService.getEmail(params.id)
		if (data != null) {
			render data as JSON
		} else {
			response.status = 404
			render "404"
		}
	}
	
	def getUser() {
		def data =  emailService.getPerson(params.id)
		if (data != null) {
			render data as JSON
		} else {
			response.status = 404
			render "404"
		}
		
	}
}
