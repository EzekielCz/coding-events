package org.launchcode.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

@Entity
public class EventDetails extends AbstractEntity {

    @Size(max = 250, message = "Description is too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email, please try again")
    private String contactEmail;


    public EventDetails(String description, String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }
    public EventDetails(){}

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
}
