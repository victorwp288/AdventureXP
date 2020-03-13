package com.example.demo.Repository;

import com.example.demo.Model.Activity;

import java.util.List;

public interface ActivityRepository {

    public int createActivity(Activity activity);
    public int deleteActivity(int id);
    public int updateActivity(Activity activity);
    public Activity getActivity(int id);
    public List<Activity> getActivities();

}
