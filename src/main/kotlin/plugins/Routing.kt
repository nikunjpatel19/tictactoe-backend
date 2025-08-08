package com.nikunjprojects.plugins

import com.nikunjprojects.model.TicTacToeGame
import com.nikunjprojects.socket
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}