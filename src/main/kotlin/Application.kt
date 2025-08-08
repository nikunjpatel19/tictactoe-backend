package com.nikunjprojects

import com.nikunjprojects.model.TicTacToeGame
import com.nikunjprojects.plugins.configureMonitoring
import com.nikunjprojects.plugins.configureRouting
import com.nikunjprojects.plugins.configureSerialization
import com.nikunjprojects.plugins.configureSockets
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val game = TicTacToeGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}