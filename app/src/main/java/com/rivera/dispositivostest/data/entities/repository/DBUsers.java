package com.rivera.dispositivostest.data.entities.repository;

public class DBUsers {

    fun getListUsers(){
        var usr1 = Users(1,"admin","admin")
        var usr2 = Users(2,"juan","juan")
        var usr3 = Users(3,"maria","maria")

        var listUsers = listOf(usr1, usr2,usr3)
        return listUsers
    }
}
