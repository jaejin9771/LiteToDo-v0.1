package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding


// Todo를 카드 뷰로 변경해주는 어댑터
class TodoAdapter: RecyclerView.Adapter<TodoAdapter.TodoHolder>() {
    private val todoList: MutableList<Todo> = mutableListOf()  //Todo를 여러 개 담을 수 있는 리스트
    override fun getItemCount(): Int = todoList.size

    // TODO를 전달하면 카드 뷰를 우리한테 주는 것이 목적
    class TodoHolder(private val binding: TodoCardViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun binData(todo: Todo) {
            binding.todo = todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val binding =
            TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.binData(todoList[position])
    }

    fun setTodoList(list: List<Todo>) {
        todoList.addAll(list)
    }
}