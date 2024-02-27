package io.github.byrdsean.ticketingsystemapi.repository

import io.github.byrdsean.ticketingsystemapi.dto.TicketsDto
import org.springframework.stereotype.Repository
import java.util.Date

@Repository
class TicketRepositoryImpl : TicketRepository {
    override fun getTickets(): List<TicketsDto> {
        val tickets: MutableList<TicketsDto> = mutableListOf()
        tickets.add(TicketsDto(
            title = "Test 12345",
            description = "Sample description",
            priority = 123,
            status = "Open",
            notes = mutableListOf(),
            submittedUserId = 987,
            submittedDate = Date(),
            completedByUserId = 2468,
            completedDate = Date(),
        ))
        return tickets
    }
}