package io.github.byrdsean.ticketingsystemapi.repository

import io.github.byrdsean.ticketingsystemapi.dto.TicketsDto

interface TicketRepository {
    fun getTickets(): List<TicketsDto>
}