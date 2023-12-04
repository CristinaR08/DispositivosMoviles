package com.rivera.dispositivostest.data.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rivera.dispositivostest.data.dao.UsersDAO
import com.rivera.dispositivostest.data.entities.Users
import java.security.AccessControlContext

@Database(
    entities = [Users::class],
    version = 1
)
abstract class DBRepository:RoomDatabase() {
    abstract fun getUsersDAO() : UsersDAO
}

class DBConnection(){
    fun getConnection(context: Context) : DBRepository =
         Room.databaseBuilder(
            context,
            DBRepository::class.java,
            "DBTest"
        ).build()

}

