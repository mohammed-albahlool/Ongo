package com.example.logo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WorkViewModel extends AndroidViewModel {

    private WorkRepositry mRepositry ;
    private LiveData<List<Work>> allWork ;

    public LiveData<List<Work>> getAllWork() {
        return allWork;
    }

    public WorkViewModel(@NonNull Application application) {
        super(application);

        mRepositry = new WorkRepositry(application);
        allWork = mRepositry.getAllWorks();
    }

    public void insertWork(Work work){

        mRepositry.insert(work);
    }

    public void updateWork(Work work){
        mRepositry.update(work);
    }
}
