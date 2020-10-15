package com.geekbrains.homework1.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.geekbrains.homework1.R
import com.geekbrains.homework1.ui.note.NoteActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: NotesRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        rv_notes.layoutManager = GridLayoutManager(this, 2)
        adapter = NotesRVAdapter{
            NoteActivity.start(this, it)
        }

        rv_notes.adapter = adapter

        viewModel.viewState().observe(this, {value ->
            value?.let { adapter.notes = it.notes }
        })

        fab.setOnClickListener {
            NoteActivity.start(this)
        }
    }
}