package com.rivera.dispositivostest.data.entities.repository

import com.rivera.dispositivostest.data.entities.Users

    class DBUsers {
        fun getListUsers(): List<Users> {


            return listOf<Users>(
                Users("admin", "admin", 1),
                Users("juan","juan", 2),
                Users("maria","maria", 3),
                Users("Cristina","12345", 4),

            )


        }
    }
