package com.hendisantika.contactappbackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-app-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/18
 * Time: 03.41
 * To change this template use File | Settings | File Templates.
 */
@Document(collection = "contacts")
@Data
@NoArgsConstructor
public class Contact {
    @Id
    String id;
    String name;
    String address;
    String city;
    String phone;
    String email;

    public Contact(String name, String address, String city, String phone, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }
}
