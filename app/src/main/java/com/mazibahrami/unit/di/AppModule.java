package com.mazibahrami.unit.di;

import android.app.Application;

import androidx.room.Room;

import com.mazibahrami.unit.models.Note;
import com.mazibahrami.unit.persistence.NoteDao;
import com.mazibahrami.unit.persistence.NoteDatabase;
import com.mazibahrami.unit.repository.NoteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static com.mazibahrami.unit.persistence.NoteDatabase.DATABASE_NAME;

@Module
public class AppModule {
    @Singleton
    @Provides
    static NoteDatabase provideNoteDatabase(Application application) {
        return Room.databaseBuilder(
                application,
                NoteDatabase.class,
                DATABASE_NAME
        ).build();
    }

    @Singleton
    @Provides
    static NoteDao provideNoteDao(NoteDatabase noteDatabase) {
        return noteDatabase.getNoteDao();
    }

    @Singleton
    @Provides
    static NoteRepository provideNoteRepository(NoteDao noteDao) {
        return new NoteRepository(noteDao);
    }
}
