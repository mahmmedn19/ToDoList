package com.areebgroup.todolist.domain.usecase

import com.areebgroup.todolist.data.source.local.model.TodoItem
import com.areebgroup.todolist.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import java.util.Date
import javax.inject.Inject

class GetTodoItemByDate @Inject constructor(
    private val todoRepository: TodoRepository
) {
    suspend fun getTodoItemFilteredByDateAscending(date: Date): Flow<List<TodoItem>> =
        todoRepository.getTodoItemsFilteredByDateAscending(date)

    suspend fun getTodoItemFilteredByDateDescending(date: Date): Flow<List<TodoItem>> =
        todoRepository.getTodoItemsFilteredByDateDescending(date)
}