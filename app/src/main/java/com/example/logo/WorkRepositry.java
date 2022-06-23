package com.example.logo;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WorkRepositry {

    public WorkDao workDao;
    private LiveData<List<Work>> allWorks;

    public WorkRepositry(Application application) {

        WorkRoomDatabase db = WorkRoomDatabase.getDatabase(application);
        workDao = db.workDao();
        allWorks = workDao.getWork();
    }

    public LiveData<List<Work>> getAllWorks() {
        return allWorks;
    }

    public void insert(Work work) {
        WorkRoomDatabase.databaseWriteExecutor.execute(() -> {
            workDao.insert(work);
        });
    }

    public void update(Work work){
        WorkRoomDatabase.databaseWriteExecutor.execute(() -> {
            workDao.update(work);
        });
    }

    public void delete(Work work) {

        WorkRoomDatabase.databaseWriteExecutor.execute(() -> {
            workDao.delete(work);
        });
    }
}
