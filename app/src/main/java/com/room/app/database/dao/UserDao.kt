package com.room.app.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.room.app.database.constants.DBConstants.Companion.FIRST_NAME_COLUMN
import com.room.app.database.constants.DBConstants.Companion.LAST_NAME_COLUMN
import com.room.app.database.constants.DBConstants.Companion.USERS_TABLE
import com.room.app.database.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM $USERS_TABLE")
    fun getAll(): List<User>

    @Query("SELECT * FROM $USERS_TABLE WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM $USERS_TABLE WHERE $FIRST_NAME_COLUMN LIKE :first AND " +
            "$LAST_NAME_COLUMN LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}
