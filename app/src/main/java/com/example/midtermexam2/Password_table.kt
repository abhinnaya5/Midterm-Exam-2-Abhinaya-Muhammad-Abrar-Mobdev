package com.example.midtermexam2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Password_table")
data class Password_table(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "Password") val Password: String?,
    @ColumnInfo(name = "System") val System: String?
)
