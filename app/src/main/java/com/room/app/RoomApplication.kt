package com.room.app

import android.app.Application
import androidx.room.Room
import com.room.app.database.UserDatabase
import com.room.app.database.constants.DBConstants.Companion.USERS_DATABASE

class RoomApplication : Application() {
    private lateinit var database: UserDatabase

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            UserDatabase::class.java,
            USERS_DATABASE
        ).build()
    }
}
