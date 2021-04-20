package com.swagger.practice.demo.application.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.practice.demo.application.model.Contact;
import com.swagger.practice.demo.application.repositories.ContactRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Address Book", description = "Address Book Controller")
@RestController
@RequestMapping(value = "/contacts")
public class AddressBookController {

	@Autowired
	private ContactRepository contactRepository;

	@GetMapping("/{id}")
	public Optional<Contact> getContact(@PathVariable Long id) {
		return contactRepository.findById(id);
	}

	@GetMapping("/")
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		return contactRepository.save(contact);
	}
	
	@PutMapping("/{id}")
	  public ResponseEntity<Contact> updateTutorial(@PathVariable("id") Long id, @RequestBody Contact contact) {
	    Optional<Contact> contactData = contactRepository.findById(id);

	    if (contactData.isPresent()) {
	      Contact _contact = contactData.get();
	      _contact.setFullName(contact.getFullName());
	      _contact.setCountry(contact.getCountry());
	      _contact.setCity(contact.getCity());
	      _contact.setPhoneNumber(contact.getPhoneNumber());
	      _contact.setStreetAdress(contact.getStreetAdress());
	      _contact.setZipCode(contact.getZipCode());
	      return new ResponseEntity<>(contactRepository.save(_contact), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }


	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable("id") Long id) {
		contactRepository.deleteById(id);
	}

}
