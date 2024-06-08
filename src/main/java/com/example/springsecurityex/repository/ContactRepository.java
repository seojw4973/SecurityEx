package com.example.springsecurityex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurityex.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
