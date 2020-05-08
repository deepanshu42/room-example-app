package com.room.app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.room.app.database.dao.UserDao
import com.room.app.database.entity.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
