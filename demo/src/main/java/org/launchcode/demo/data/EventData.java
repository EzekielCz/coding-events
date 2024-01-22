package org.launchcode.demo.data;

import org.launchcode.demo.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need place to put events.
    private static final Map<Integer, Event> events = new HashMap<>();
    // needs to get all events.
    public static Collection<Event> getALl(){
        return events.values();
    }

    // should be able to get an event.
    public static Event getById(int id){
        return events.get(id);
    }

    // add an event.
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    //remove an event.
    public static void remove(int id){
        events.remove(id);
    }

}
