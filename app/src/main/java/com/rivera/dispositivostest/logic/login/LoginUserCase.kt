package com.rivera.dispositivostest.logic.login

import com.rivera.dispositivostest.data.entities.Users
import com.rivera.dispositivostest.data.entities.repository.DBUsers

class LoginUserCase(val dbUsers: DBUsers) {
    fun checkUserAndPassword(user: String, password: String): Boolean{
        val usuarios = dbUsers.getListUsers()
        val autenticar = usuarios.find{
        it.userName == user && it.password == password
        }
        return autenticar != null
    }

    fun checkLogin(username:String, password: String): Int{
       var ret =-1
        val user = DBUsers().getListUsers()
        val lstUsers = user.filter {
            it.password == password && it.userName == username
        }
        if (lstUsers.isNotEmpty()){
            ret = lstUsers.first().userId
        }
        return  ret

    }

    fun  getUserName(userId:Int) : Users =
        DBUsers().getListUsers().first {
            it.userId == userId
        }
    }
