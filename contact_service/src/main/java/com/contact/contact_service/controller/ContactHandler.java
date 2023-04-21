package com.contact.contact_service.controller;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactHandler {
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/{userid}")
    public List<Contact> getContacts(@PathVariable("userid") int id) {
        return this.contactService.getlist(id);
    }
}
