package com.rivera.dispositivostest.ui.core

import android.app.Application
import com.rivera.dispositivostest.data.repository.DBConnection
import com.rivera.dispositivostest.data.repository.DBRepository
import com.rivera.dispositivostest.logic.login.LoginUseCase

class My_Application:Application() {

    override fun onCreate() {
        super.onCreate()
        val c = DBConnection().getConnection(applicationContext)
        LoginUseCase(con).insertUser()
    }

    companion object{
        private lateinit var con: DBRepository

        fun getConnectionDB():DBRepository?{
            return con
        }
    }

}