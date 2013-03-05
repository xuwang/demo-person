class UrlMappings {

	static mappings = {
		"/email/$id?"(controller:"emailService", action:"getEmail")
		"/user/$id?"(controller:"emailService", action:"getUser")
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
