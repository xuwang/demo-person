package org.demo.person

import static org.junit.Assert.*
import org.junit.*
class EmailServiceTests {
	
	def emailService
	
	def person

    @Before
    void setUp() {
        //person = new Person(username:"xuwang", firstName:"Xu", lastName:"Wang", email:"xuwang@gmail.com")
		//person.save(flush:true, failOnError:true)
    }

    @After
    void tearDown() {
        //person.delete(flush: true)
    }

    @Test
    void testGetEmail() {
        assert emailService != null, "EmailService is null!"
		assert emailService.getEmail("xuwang")?.address == "xuwang@gmail.com"
    }
}
