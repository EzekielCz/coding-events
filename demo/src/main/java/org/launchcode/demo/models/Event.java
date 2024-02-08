package org.launchcode.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Event extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;
//    private static int nextId = 1;

    @NotBlank(message = "Cannot be emtpy.")
    @Size(min = 3, max = 25, message = "Name must be between 3 and 25 characters long.")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventDetails eventDetails;
    @Size(max = 250, message = "Description is too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email, please try again")
    private String contactEmail;

    @ManyToOne
    @NotNull(message = "Category is required.")
    private EventCategory eventCategory;

    private final List<Tag> tags =new ArrayList<>();
    public Event(String name, EventCategory eventCategory) {
//        this();
        this.name = name;
//        this.description = description;
//        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
    }
    public Event(){
//        this.id = nextId;
//        nextId++;
    };
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getContactEmail() {
//        return contactEmail;
//    }
//
//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public List<Tag> getTags() {
        return tags;
    }
    public void addTags (Tag tag){
        this.tags.add(tag);
    }

    //    public int getId() {
//        return id;
//    }
//
    @Override
    public String toString() {
        return name;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
