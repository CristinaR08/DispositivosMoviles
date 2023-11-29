package com.rivera.dispositivostest.data.repository

import androidx.room.Database
import com.rivera.dispositivostest.data.dao.UsersDAO
import com.rivera.dispositivostest.data.entities.Users

@Database(
    entities = [Users::class],
    version = 1
)
abstract class DBRepository {

    abstract fun getUsersDAO() : UsersDAO


}