package com.alexturnbull.Model

import org.jetbrains.exposed.sql.Table
import org.joda.time.DateTime

object Accounts : Table() {
    val id = integer("user_id").primaryKey().autoIncrement()
    val username = varchar("username", 50)
    val email = varchar("email", 355)
    val createdOn = datetime("created_on")
    val lastLogin = datetime("last_login")
}


data class Account(
    val id: Int,
    val username: String,
    val email: String,
    val createdOn: DateTime,
    val lastLogin: DateTime

)

