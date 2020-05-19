package com.hendisantika.contactappbackend.repository;

import com.hendisantika.contactappbackend.model.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-app-backend
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/18
 * Time: 03.56
 * To change this template use File | Settings | File Templates.
 */
public interface ContactRepository extends CrudRepository<Contact, String> {
    void delete(Contact deleted);
}