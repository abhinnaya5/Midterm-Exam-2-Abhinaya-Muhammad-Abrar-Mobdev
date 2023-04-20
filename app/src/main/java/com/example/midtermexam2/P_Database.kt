package com.example.midtermexam2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Password_table::class], version = 1)
abstract class P_Database : RoomDatabase(){
    abstract fun tableDao(): tableDao

    companion object{
        @Volatile
        private var INSTANCE : P_Database? = null

        fun getDataBase(context: Context): P_Database{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    P_Database::class.java,
                    "Database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}