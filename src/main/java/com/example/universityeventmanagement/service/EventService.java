package com.example.universityeventmanagement.service;

import com.example.universityeventmanagement.model.Event;
import com.example.universityeventmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EventService {
    private static final List<Event> events = new ArrayList<>();
    private static int id = 0;

    static {
        Event e1 = new Event(++id,"Malay","kolkata","26nov","10am","5pm");
        Event e2 = new Event(++id,"minoti","delhi","13dec","10am","4pm");
        Event e3 = new Event(++id,"palash","bangalore","15feb","10am","6pm");
        Event e4 = new Event(++id,"Sudip","channai","6nov","10am","7pm");
        Event e5 = new Event(++id,"sipon","mumbai","9jan","10am","5pm");

        events.add(e1);
        events.add(e2);
        events.add(e3);
        events.add(e4);
        events.add(e5);
    }


    public Event getEventByDate(int id){
        for (Event event: events){
            if(event.getEvenId() == id) return event;
        }
        return null;
    }
    public void deleteEvent(int id){
        Predicate<? super Event> predicate = todo -> todo.getEvenId() == id;
        events.removeIf(predicate);
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void updateEvent(int id, Event newEvent){
        Event event = getEventByDate(id);
        event.setEvenId(newEvent.getEvenId());
        event.setEvenName(newEvent.getEvenName());
        event.setLocationOfEven(newEvent.getLocationOfEven());
        event.setDate(newEvent.getDate());
        event.setStartTime(newEvent.getStartTime());
        event.setEndTime(newEvent.getEndTime());
    }
}
