package com.rivera.dispositivostest.data.entities.repository

import com.rivera.dispositivostest.data.entities.Users

class DBUsers {
    class DBUsers {
        class DBUsers {
            fun getListUsers(): List<Users> {
                var usr1 = Users(1,"admin","admin")
                var usr2 = Users(2,"juan","juan")
                var usr3 = Users(3,"maria","maria")
                var usr4 = Users(4,"Cristina","12345")

                var listUsers = listOf(usr1, usr2,usr3)
                return listUsers
            }
        }
    }
}