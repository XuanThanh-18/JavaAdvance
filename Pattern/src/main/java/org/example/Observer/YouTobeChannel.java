package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTobeChannel implements Subject{
    @Override
    public void NotifySubscribe(String videoTitle) {
        for(Observer observer : subscribers){
            observer.update(videoTitle);
        }
    }

    @Override
    public void UpdateVideos(String videoTitle) {
        System.out.println("YouTobeChannel has new video "+videoTitle);
        NotifySubscribe(videoTitle);
    }

    private List<Observer> subscribers = new ArrayList<Observer>();
    private String channelTitle;
    @Override
    public void Subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void UnSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

}
