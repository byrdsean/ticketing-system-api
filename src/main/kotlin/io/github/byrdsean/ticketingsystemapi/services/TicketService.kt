package io.github.byrdsean.ticketingsystemapi.services

import io.github.byrdsean.ticketingsystemapi.dto.TicketsDto
import io.github.byrdsean.ticketingsystemapi.repository.TicketRepository
import org.springframework.stereotype.Service

@Service
class TicketService(
    private val ticketRepository: TicketRepository
) {
    fun getTickets() : List<TicketsDto> {
        return ticketRepository.getTickets()
    }
}