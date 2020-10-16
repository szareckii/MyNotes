package com.geekbrains.homework1.data

import androidx.lifecycle.MutableLiveData
import com.geekbrains.homework1.data.entity.Note
import java.util.*

object NotesRepository {

    private val notesLiveData = MutableLiveData<List<Note>>()

    private val notes = mutableListOf(
            Note(
                    UUID.randomUUID().toString(),
                    "Первая заметка",
                    "Текст первой заметки. Описание.",
                    Note.Color.WHITE
            ),
            Note(
                    UUID.randomUUID().toString(),
                    "Вторая заметка",
                    "Текст второй заметки. Описание.",
                    Note.Color.YELLOW
            ),
            Note(
                    UUID.randomUUID().toString(),
                    "Третья заметка",
                    "Текст третьей заметки. Описание.",
                    Note.Color.GREEN
            ),
            Note(
                    UUID.randomUUID().toString(),
                    "Четвертая заметка",
                    "Текст четвертой заметки. Описание.",
                    Note.Color.BLUE
            ),
            Note(
                    UUID.randomUUID().toString(),
                    "Пятая заметка",
                    "Текст пятой заметки. Описание.",
                    Note.Color.RED
            ),
            Note(
                    UUID.randomUUID().toString(),
                    "Шестая заметка",
                    "Текст шестой заметки. Описание.",
                    Note.Color.VIOLET
            )
    )

    init {
        notesLiveData.value = notes
    }

    fun saveNote(note: Note) {
        addOrReplace(note)
        notesLiveData.value = notes
    }

    private fun addOrReplace(note: Note) {
        for (i in notes.indices) {
            if (notes[i] == note) {
                notes[i] = note
                return
            }
        }
        notes.add(note)
    }

    fun getNotes() = notesLiveData
}