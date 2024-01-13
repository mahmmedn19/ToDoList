package com.areebgroup.todolist.data.source.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.areebgroup.todolist.data.source.local.model.TodoItem

@Database(entities = [TodoItem::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class TodoDatabase: RoomDatabase() {
    abstract val todoDao: TodoDao
}