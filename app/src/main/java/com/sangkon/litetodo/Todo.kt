package com.sangkon.litetodo

data class Todo(val id: Int = generatedId(), val date: String, val task: String) {
    companion object {
        private var currentId: Int = 0
        private fun generatedId(): Int {
            return ++currentId
        }
    }
}