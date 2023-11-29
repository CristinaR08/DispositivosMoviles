package com.rivera.dispositivostest.logic.login

import com.rivera.dispositivostest.data.entities.Users
import com.rivera.dispositivostest.data.repository.DBUsers

class LoginUseCase {

    fun checkUserandPassword(user:String, password:String): Int{
        var ret = -1
        var users= DBUsers().getListUsers()
        val exist = users.filter {
            it.userName.equals(user) and it.password.equals(password)
        }
        if( exist.isNotEmpty()){
            ret = exist.first().userId
        }
        return ret
    }

    fun getUserNAme(usrId:Int) : Users=
        DBUsers().getListUsers().first{
            it.userId.equals(usrId)
        }




}