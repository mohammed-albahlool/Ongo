package com.example.logo;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WorkDao {

    @Query("Select * From works ")
    LiveData<List<Work>> getWork();

    @Insert(onConflict = OnConflictStrategy.ABORT)
    void insert(Work work);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void update(Work work);

    @Delete(entity = Work.class)
    void delete(Work work);





}
