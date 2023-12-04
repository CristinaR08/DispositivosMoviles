package com.rivera.dispositivostest.data.repository

import com.rivera.dispositivostest.data.entities.Users

    class UserRepository {
        fun getListUsers(): List<Users> {

            return listOf<Users>(
                Users("Cristina", "12345", 1, "Cristina","Rivera"),
                Users("juan","juan", 2),
                Users("maria","maria", 3)

            )


        }
    }
