package com.hendisantika.contactappbackend.controller;

import com.hendisantika.contactappbackend.model.Contact;
import com.hendisantika.contactappbackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-app-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/18
 * Time: 03.57
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping(value = "/contacts")
    public Iterable<Contact> contact() {
        return contactRepository.findAll();
    }

    @PostMapping(value = "/contacts")
    public Contact save(@RequestBody Contact contact) {
        contactRepository.save(contact);

        return contact;
    }

    @GetMapping(value = "/contacts/{id}")
    public Contact show(@PathVariable String id) {
        return contactRepository.findById(id).get();
    }

    @PutMapping(value = "/contacts/{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact c = contactRepository.findById(id).get();
        if (contact.getName() != null)
            c.setName(contact.getName());
        if (contact.getAddress() != null)
            c.setAddress(contact.getAddress());
        if (contact.getCity() != null)
            c.setCity(contact.getCity());
        if (contact.getPhone() != null)
            c.setPhone(contact.getPhone());
        if (contact.getEmail() != null)
            c.setEmail(contact.getEmail());
        contactRepository.save(c);
        return contact;
    }

    @DeleteMapping(value = "/contacts/{id}")
    public void delete(@PathVariable String id) {
        Contact contact = contactRepository.findById(id).get();
        contactRepository.delete(contact);
    }
}
