package com.nikunjprojects

import com.nikunjprojects.plugins.configureMonitoring
import com.nikunjprojects.plugins.configureRouting
import com.nikunjprojects.plugins.configureSerialization
import com.nikunjprojects.plugins.configureSockets
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
