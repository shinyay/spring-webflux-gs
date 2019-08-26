package io.pivotal.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxGsApplication

fun main(args: Array<String>) {
	runApplication<WebfluxGsApplication>(*args)
}
