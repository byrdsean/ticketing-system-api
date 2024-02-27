package io.github.byrdsean.ticketingsystemapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TicketingSystemApiApplication

fun main(args: Array<String>) {
	runApplication<TicketingSystemApiApplication>(*args)
}
