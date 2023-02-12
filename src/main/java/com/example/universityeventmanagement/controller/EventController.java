package com.example.universityeventmanagement.controller;

import com.example.universityeventmanagement.model.Event;
import com.example.universityeventmanagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class EventController {
    @Autowired
    private EventService eventService;
    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }
    @GetMapping("get-event/id/{id}")
    public Event getEventByDate(@PathVariable int id){
        return eventService.getEventByDate(id);
    }
    @PutMapping("update-event/id/{id}")
    public void updateEvent(@PathVariable int id, @RequestBody Event event){
        eventService.updateEvent(id,event);
    }
    @DeleteMapping("delete-event/id/{id}")
    public void deleteEvent(@PathVariable int id){
        eventService.deleteEvent(id);
    }
}
