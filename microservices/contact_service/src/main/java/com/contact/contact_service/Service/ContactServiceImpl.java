package com.contact.contact_service.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.Entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
			 new Contact(1, "shri@gmail.com", "Shrijeet", 101),
			 new Contact(2, "aman@gmail.com", "Aman", 102),
			 new Contact(3, "rushi@gmail.com", "rushi", 103)
			);
	
	@Override
	public List<Contact> getContactofUser(int userId) {
		return list.stream()
			    .filter(contact -> contact.getUserId() == userId)
			    .collect(Collectors.toList());
	}
	
}
