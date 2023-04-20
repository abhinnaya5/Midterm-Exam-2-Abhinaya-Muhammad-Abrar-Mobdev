package com.example.midtermexam2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface tableDao {
        @Query("SELECT * FROM Password_table")
        fun getAll(): List<Password_table>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun Insert(passwordTable: Password_table)

        @Delete
        suspend fun delete(passwordTable: Password_table)
}