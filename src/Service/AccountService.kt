package com.alexturnbull.Service

import com.alexturnbull.Database.DatabaseFactory.dbQuery
import com.alexturnbull.Model.Account
import com.alexturnbull.Model.Accounts
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.joda.time.DateTime
import java.util.*

class AccountService {

    suspend fun getAllAccounts(): List<Account> = dbQuery {
        Accounts.selectAll().map { toAccount(it) }
    }


    private fun toAccount(row: ResultRow): Account =
        Account(
            id = row[Accounts.id],
            username = row[Accounts.username],
            email = row[Accounts.email],
            createdOn = row[Accounts.createdOn],
            lastLogin = row[Accounts.lastLogin]
        )
}