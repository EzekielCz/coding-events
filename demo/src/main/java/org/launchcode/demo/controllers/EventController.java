package org.launchcode.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("doomsDay");
        events.add("zeta");
        events.add("unsc");
        events.add("stalker");
        model.addAttribute("events", events);
        return "events/index";
    }
    // will be at /events/create
    @GetMapping("create")
    public String createEventForm(){
        return "events/create";
    }
}
