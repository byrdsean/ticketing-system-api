package io.github.byrdsean.ticketingsystemapi.resources

import io.github.byrdsean.ticketingsystemapi.dto.TicketsDto
import io.github.byrdsean.ticketingsystemapi.services.TicketService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path=["tickets"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TicketController(
    private val ticketService: TicketService
) {
    @GetMapping
    fun getTickets() : List<TicketsDto> {
        return ticketService.getTickets()
    }
}