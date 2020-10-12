package com.geekbrains.homework1.data

import com.geekbrains.homework1.data.entity.Note

object NotesRepository {

    val notes = listOf(
            Note(
                    "Первая заметка",
                    "Текст первой заметки. Описание.",
                    0xfff06292.toInt()
            ),
            Note(
                    "Вторая заметка",
                    "Текст второй заметки. Описание.",
                    0xff9575cd.toInt()
            ),
            Note(
                    "Третья заметка",
                    "Текст третьей заметки. Описание.",
                    0xff64b5f6.toInt()
            ),
            Note(
                    "Четвертая заметка",
                    "Текст четвертой заметки. Описание.",
                    0xff4db6ac.toInt()
            ),
            Note(
                    "Пятая заметка",
                    "Текст пятой заметки. Описание.",
                    0xffb2ff59.toInt()
            ),
            Note(
                    "Шестая заметка",
                    "Текст шестой заметки. Описание.",
                    0xffffeb3b.toInt()
            )
    )
}