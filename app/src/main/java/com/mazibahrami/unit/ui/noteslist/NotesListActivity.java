package com.mazibahrami.unit.ui.noteslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mazibahrami.unit.R;
import com.mazibahrami.unit.repository.NoteRepository;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class NotesListActivity extends DaggerAppCompatActivity {

    private static final String TAG = "NotesListActivity";

    @Inject
    NoteRepository noteRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        Log.d(TAG, "onCreate: " + noteRepository);
    }
}