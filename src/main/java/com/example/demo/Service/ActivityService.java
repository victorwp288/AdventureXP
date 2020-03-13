package com.example.demo.Service;

import com.example.demo.Model.Activity;
import com.example.demo.Repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    public void addActivity(Activity activity) {
        activityRepository.createActivity(activity);
    }

    public Activity findAcitivityById(int activityId) {
        return activityRepository.getActivity(activityId);
    }

    public void deleteActivity(int activityId ){ activityRepository.deleteActivity(activityId);}

    public void updateActivity(Activity activity){ activityRepository.updateActivity(activity);}

    public List<Activity> getAllActivities(){ return activityRepository.getActivities();}

}