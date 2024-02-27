package io.github.byrdsean.ticketingsystemapi.dto

import java.util.Date

data class TicketsDto(
    val title: String,
    val description: String,
    val priority: Int,
    val status: String,
    val notes: List<String>,
    val submittedUserId: Int,
    val submittedDate: Date,
    val completedByUserId: Int,
    val completedDate: Date,
)