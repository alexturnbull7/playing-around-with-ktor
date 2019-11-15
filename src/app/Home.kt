package com.alexturnbull.app

import com.alexturnbull.Service.AccountService
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

const val HOME = "/"

fun Route.home(accountService: AccountService) {
    get(HOME) {
        call.respond(accountService.getAllAccounts())
    }
}