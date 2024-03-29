package org.launchcode.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;
//    private static int nextId = 1;

    @NotBlank(message = "Cannot be emtpy.")
    @Size(min = 3, max = 25, message = "Name must be between 3 and 25 characters long.")
    private String name;
    @Size(max = 250, message = "Description is too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email, please try again")
    private String contactEmail;

    private EventType type;
    public Event(String name, String description, String contactEmail, EventType type) {
//        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
