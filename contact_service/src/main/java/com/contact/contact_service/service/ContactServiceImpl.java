package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    public static List<Contact> userList = new ArrayList<>();

    static {
        userList.add(new Contact(1, "ram@gmail.com", "ram", 11));
        userList.add(new Contact(2, "shyam@gmail.com", "shyam", 12));
        userList.add(new Contact(3, "om@gmail.com", "om", 13));
    }

    @Override
    public List<Contact> getlist(int userId) {
        return userList.stream().filter(q -> q.getUserId() == (userId)).collect(Collectors.toList());
    }
}
