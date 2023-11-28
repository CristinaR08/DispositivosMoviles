package com.rivera.dispositivostest.data.entities

import android.adservices.adid.AdId

data class Users (
    val userName: String? = null,
    val password: String? = null
)
{
    var userId = -1
    var firstName : String = " "
    var lastName : String = " "
    var profile : String = " "

    constructor(
        username: String?,
        password: String?, userId: Int
    ) : this(username, password)
    {
        this.userId = userId
    }

    constructor(
        id: Int, username: String?,
        password: String?, profile: String
    ) : this(username, password)
    {
        this.profile = profile
    }

    constructor(
        id: Int, username: String?,
        password: String?, firstName: String, lastName: String
    ) : this(username, password)

    {
        this.firstName = firstName
        this.lastName = lastName
    }

}

