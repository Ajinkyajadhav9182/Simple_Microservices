package com.contact.contact_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@Document(collection = "contacts")
public class Contact {
    private int cId;
    private String email;
    private String Cname;
    private int userId;
}
