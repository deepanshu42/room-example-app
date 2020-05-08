package com.room.app.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.room.app.database.constants.DBConstants.Companion.FIRST_NAME_COLUMN
import com.room.app.database.constants.DBConstants.Companion.LAST_NAME_COLUMN
import com.room.app.database.constants.DBConstants.Companion.USERS_TABLE

@Entity(tableName = USERS_TABLE)
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = FIRST_NAME_COLUMN) val firstName: String?,
    @ColumnInfo(name = LAST_NAME_COLUMN) val lastName: String?
)
