package com.amk.student

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class StudentApplication

fun main(args: Array<String>) {
	runApplication<StudentApplication>(*args)
}
