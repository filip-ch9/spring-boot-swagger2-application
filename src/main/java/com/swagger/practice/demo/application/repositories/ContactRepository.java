package com.swagger.practice.demo.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger.practice.demo.application.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{


}
