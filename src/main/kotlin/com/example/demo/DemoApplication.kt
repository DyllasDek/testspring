package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}



@RestController
class HelloController {
	@Autowired
	lateinit var roleRepository: RoleRepository
	@GetMapping("/hello")
	fun hello() = "Hello, world!"
	@GetMapping("/roles")
	fun getRoles() = roleRepository.findAllByRole("Admin")

}

