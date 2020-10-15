package com.geekbrains.homework1.ui.note

import androidx.lifecycle.ViewModel
import com.geekbrains.homework1.data.NotesRepository
import com.geekbrains.homework1.data.entity.Note

class NoteViewModel : ViewModel() {
    private var pendingNote: Note? = null

    fun save(note : Note) {
        pendingNote = note
    }

    override fun onCleared() {
        pendingNote?.let {
            NotesRepository.saveNote(it)
        }

    }
}