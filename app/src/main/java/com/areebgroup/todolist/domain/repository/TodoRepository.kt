package com.areebgroup.todolist.domain.repository

import com.areebgroup.todolist.data.source.local.model.TodoItem
import kotlinx.coroutines.flow.Flow
import java.util.Date

interface TodoRepository {

    fun getAllTodoTasks(): Flow<List<TodoItem>>

    suspend fun addTask(newTask: TodoItem)

    suspend fun updateTask(updatedTask: TodoItem)

    suspend fun deleteTask(id: Int)

    suspend fun markTaskCompleted(id: Int, status: Boolean)
    suspend fun getTodoItemsFilteredByDateAscending(date: Date): Flow<List<TodoItem>>

    suspend fun getTodoItemsFilteredByDateDescending(date: Date): Flow<List<TodoItem>>


}