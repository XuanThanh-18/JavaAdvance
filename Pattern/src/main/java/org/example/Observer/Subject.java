package org.example.Observer;

public interface Subject {
    void Subscribe(Observer observer);
    void UnSubscribe(Observer observer);
    void NotifySubscribe(String  videoTitle);
    void UpdateVideos(String videoTitle);

}
