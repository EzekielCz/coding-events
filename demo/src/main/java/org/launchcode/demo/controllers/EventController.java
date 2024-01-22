package org.launchcode.demo.controllers;

import org.launchcode.demo.data.EventData;
import org.launchcode.demo.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

//    private static List <Event> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model){
//        List<String> events = new ArrayList<>();
//        events.add("dooms Day");
//        events.add("Zeta Ring");
//        events.add("UNSC");
//        events.add("Stalker");
//        model.addAttribute("events", events);
        model.addAttribute("events", EventData.getALl());
        return "events/index";
    }
    // will be at /events/create
    @GetMapping("create")
    public String createEventForm(){
        return "events/create";
    }

    // will be at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription){
        EventData.add(new Event(eventName, eventDescription));
        return "redirect:/events";
    }
}
