package com.abhisht28.notes

import androidx.lifecycle.LiveData

class NoteRespository(private val noteDao: NoteDao) {


    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert (note:Note){
        noteDao.insert(note)
    }
    suspend fun delete (note: Note){
        noteDao.delete(note)
    }
}